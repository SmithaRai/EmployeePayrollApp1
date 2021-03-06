package com.bridgelabz.employeepayrollapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EmployeePayrollApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(EmployeePayrollApp1Application.class, args);
    }

}
