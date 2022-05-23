package com.bridgelabz.employeepayrollapp1.services;

import com.bridgelabz.employeepayrollapp1.DTO.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp1.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int empId);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);
    EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);
    void deleteEmployeePayrollData(int empId);
}
