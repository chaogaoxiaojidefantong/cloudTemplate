package com.gainer.demo;
import com.gainer.demo.controller.StudentRecordController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    StudentRecordController studentRecordController;
    @Test
    void contextLoads() throws  Exception{

    }
}
