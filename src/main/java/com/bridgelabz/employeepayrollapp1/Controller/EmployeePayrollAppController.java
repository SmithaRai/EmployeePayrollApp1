package com.bridgelabz.employeepayrollapp1.Controller;

import com.bridgelabz.employeepayrollapp1.DTO.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp1.DTO.ResponseDTO;
import com.bridgelabz.employeepayrollapp1.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp1.services.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollAppController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;


   @RequestMapping(value={"","/","/get"})
   public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
       List<EmployeePayrollData> empDataList = null ;
       empDataList = employeePayrollService.getEmployeePayrollData();
       ResponseDTO respDTO = new ResponseDTO("Get Call Successful",empDataList);
       return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
   }

   @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId")int empId) {
       EmployeePayrollData empData=null;
       empData =  employeePayrollService.getEmployeePayrollDataById(empId);
       ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successful",empData);
       return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
   }

   @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
       EmployeePayrollData empData = null;
       empData = employeePayrollService.createEmployeePayrollData(empPayrollDTO);
       ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Successful",empData);
       return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
   }

   @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
       EmployeePayrollData empData=null ;
       empData =employeePayrollService.updateEmployeePayrollData(empPayrollDTO);
       ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data Successfully",empData);
       return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
   }

   @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
       employeePayrollService.deleteEmployeePayrollData(empId);
       ResponseDTO respDTO = new ResponseDTO("Deleted Successfully ","Deleted id : " +empId);
       return new ResponseEntity<ResponseDTO>(respDTO ,HttpStatus.OK);
   }
}

