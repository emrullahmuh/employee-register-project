package com.example.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
  @RequestMapping("/register")
public String register(){

      return "employee/employee-create";
}

}
