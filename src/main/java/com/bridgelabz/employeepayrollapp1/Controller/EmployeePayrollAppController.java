package com.bridgelabz.employeepayrollapp1.Controller;

import com.bridgelabz.employeepayrollapp1.DTO.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollAppController {

   @RequestMapping(value={"","/","/get"})
   public ResponseEntity<String>getEmployeePayrollData() {
       return new ResponseEntity<>("Get Call Success", HttpStatus.OK);
   }

   @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId")int empId) {
       return new ResponseEntity<>("Get Call Success for id : " + empId, HttpStatus.OK);
   }

   @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
       return new ResponseEntity<>("Created Employee Payroll Data for : "+ empPayrollDTO,HttpStatus.OK);
   }

   @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
       return new ResponseEntity<>("Updated Employee Payroll Data for : "+ empPayrollDTO,HttpStatus.OK);
   }

   @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
       return new ResponseEntity<>("Delete Call Success for id : "+empId ,HttpStatus.OK);
   }
}
