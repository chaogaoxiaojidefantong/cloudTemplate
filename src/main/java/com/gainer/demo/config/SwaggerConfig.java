package com.gainer.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyang
 */
@Configuration //必须存在
@EnableSwagger2 //必须存在
public class SwaggerConfig implements WebMvcConfigurer {

    private boolean enableSwagger = true;//ui开关

    @Bean
    public Docket createRestApi() {
        //添加head参数配置start
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        tokenPar.name("Authorization").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enableSwagger)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gainer.demo"))
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(security())
//                .pathMapping("/approval")
                ;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("审批系统API")
                .version("1.0")
                .description("审批系统接口文档")
                .build();
    }

    private List<ApiKey> security() {
        List<ApiKey> list = new ArrayList<>();
        ApiKey apiKey = new ApiKey("Authorization", "Authorization", "header");
        list.add(apiKey);
        return list;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("*.txt").addResourceLocations("classpath:/");
        //静态资源放行
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/static").addResourceLocations("classpath:/static/");

    }

    /**
     * 允许跨域
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH")
                .maxAge(3600);
    }
}
