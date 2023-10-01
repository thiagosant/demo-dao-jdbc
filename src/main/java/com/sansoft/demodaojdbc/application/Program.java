package com.sansoft.demodaojdbc.application;

import com.sansoft.demodaojdbc.model.entities.Department;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Program {

    public static void main(String[] args) {
        SpringApplication.run(Program.class, args);

        Department obj = new Department(1, "Books");
        System.out.println(obj);
    }

}
