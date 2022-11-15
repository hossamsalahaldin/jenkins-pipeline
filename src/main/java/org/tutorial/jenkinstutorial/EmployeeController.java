package org.tutorial.jenkinstutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/api/v1/")
public class EmployeeController {

    @GetMapping("employees")
    public List<Employee> getEmployees(){

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Hossam Salah",38));
        employees.add(new Employee(2,"Mostafa Elhefnawy",37));
        employees.add(new Employee(3,"Reham Huissen",25));
        employees.add(new Employee(4,"Heba Abdelqader",30));
        employees.add(new Employee(5,"Omar Mouneer",32));
        employees.add(new Employee(6,"Ismael Shebl",37));
        employees.add(new Employee(7,"Mohamed Nabil",30));
        return employees;
    }
}
