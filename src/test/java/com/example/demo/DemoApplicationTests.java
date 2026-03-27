package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private DemoApplication application;

    @Test
    void contextLoads() {
        assertNotNull(application);
    }

    @Test
    void runWithNoArgs() throws Exception {
        application.run();
    }

    @Test
    void runWithArgs() throws Exception {
        application.run("hello", "world");
    }
}
