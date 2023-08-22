package com.example.controll;

import com.example.bootstrap.DataGenerater;
import com.example.model.Employee;
import com.example.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/register")
public String register(Model model){
model.addAttribute("employee",new Employee());
    model.addAttribute("stateList", DataGenerater.getAllStates());
      return "employee/employee-create";
}
@PostMapping("/insert")
public String insertEmployee(@ModelAttribute ("employee") Employee employee){
  employeeService.saveEmployee(employee);
  return " redirect:/employee/list";    //with redirect we are using endpoint

}
@GetMapping("/list")
    public String listOfEmployee(Model model){
        model.addAttribute("employeeList",employeeService.readAllEmployee());
    return "employee/employee-list"; //without redirect we are using html file path


}

}
