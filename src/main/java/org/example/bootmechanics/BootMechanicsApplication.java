package org.example.bootmechanics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.server.servlet.context.ServletComponentScan;

@ServletComponentScan // so that I can add barebone custom Servlets
@SpringBootApplication
public class BootMechanicsApplication {

    public static void main(String[] args) {
        // TODO: how does run bootstrap an application? what happens during context preparation phase?
        // TODO: how is Tomcat Server embedded?
        SpringApplication.run(BootMechanicsApplication.class, args);
    }

}
