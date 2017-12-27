package com.smallcode.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Lenny on 2017/12/25.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

//        System.out.println(System.getProperty("sun.boot.class.path"));
//
//        System.out.println(System.getProperty("java.ext.dirs"));
//
//        System.out.println(System.getProperty("java.class.path"));

//        try {
//            Class.forName("");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        SpringApplication springApplication = new SpringApplication();
//        ClassLoader classLoader = springApplication.getClassLoader();

        // System.out.println(classLoader);


        SpringApplication.run(Application.class, args);

    }
}
