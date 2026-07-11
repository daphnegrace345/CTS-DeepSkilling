package com.cts.spring_data_jpa_handson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import exercise1.entity.Employee;
import exercise1.repository.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpaHandson2Application implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHandson2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(employeeRepository.findAll());
    }
}