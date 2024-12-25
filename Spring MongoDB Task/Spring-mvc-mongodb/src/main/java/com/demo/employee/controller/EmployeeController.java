package com.demo.employee.controller;

import com.demo.employee.model.Employee;
import com.demo.employee.repository.EmployeeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Render the form page
    @GetMapping("/")
    public String showForm() {
        return "index";
    }


    // Save Employee
    @PostMapping("/saveEmployee")
   //@RequestMapping(method = RequestMethod.POST, value = "/saveEmployee")
    public String saveEmployee(
            @RequestParam("id") String Id ,@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("location") String location, Model model) {
        Employee employee = new Employee();
        employee.setId(Id);
        employee.setName(name);
        employee.setEmail(email);
        employee.setLocation(location);
        employeeRepository.save(employee);

        model.addAttribute("message", "Employee saved successfully!");
        return "index";
    }

    @GetMapping("/displayById")
    public String displayId(@PathVariable("id") String id, Model model)
    {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            model.addAttribute("employee", employee.get());
        } else {
            model.addAttribute("message", "Employee not found!");
        }
        return "displayById";
    }




    // Display All Employees
    @GetMapping("/displayAll")
    public String displayAllEmployees(@ModelAttribute("message")String message, Model model) {
        List<Employee> employeeList= new ArrayList<>();
        employeeRepository.findAll().forEach(employee->employeeList.add(employee));
        model.addAttribute("employees", employeeRepository.findAll());
        model.addAttribute("message",message);
        return "displayAll";
    }


    // Display Employee by ID
   // @GetMapping("/display/{id}")
    @RequestMapping(method = RequestMethod.GET, value = "/display/{id}")
    public String displayEmployeeById(@PathVariable("id") String id, Model model) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            model.addAttribute("employee", employee.get());
        } else {
            model.addAttribute("message", "Employee not found!");
        }
        return "displayById";
    }



    @RequestMapping("/test")
    public String test(Model model) {
        List<Employee> employees = Arrays.asList(
                new Employee("1", "John Doe", "john.doe@example.com", "New York"),
                new Employee("2", "Jane Smith", "jane.smith@example.com", "Los Angeles")
        );
        model.addAttribute("employees", employees);
        return "testView";
    }

}