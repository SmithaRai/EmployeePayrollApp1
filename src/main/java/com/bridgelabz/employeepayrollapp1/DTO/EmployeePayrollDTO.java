package com.bridgelabz.employeepayrollapp1.DTO;

public class EmployeePayrollDTO {

    public String name;
    public long salary;



    @SuppressWarnings("ResultOfMethodCallIgnored")
    public EmployeePayrollDTO(String name , long salary ) {

        this.name = name;
        this.salary = salary;

        toString();

    }
        public String toString () {
            return "EmployeePayrollDTO{" + "name='" + name + '\'' + ", salary=" + salary + "}";
        }

}
