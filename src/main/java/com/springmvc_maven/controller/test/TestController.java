/*
package com.springmvc_maven.controller.test;

public class TestController {

    public String getAllEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employee-list";
    }

    @GetMapping("/employees/{id}")
    public String getEmployeeById(@PathVariable("id") int id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employee-detail";
    }

    @GetMapping("/employees/add")
    public String addEmployeeForm(Employee employee) {
        return "employee-add";
    }

    @PostMapping("/employees/add")
    public String addEmployee(@Valid Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "employee-add";
        }
        employeeService.addEmployee(employee);
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employee-list";
    }

    @GetMapping("/employees/edit/{id}")
    public String editEmployeeForm(@PathVariable("id") int id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employee-edit";
    }

    @PostMapping("/employees/edit/{id}")
    public String editEmployee(@PathVariable("id") int id, @Valid Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            employee.setId(id);
            return "employee-edit";
        }
        employeeService.updateEmployee(employee);
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employee-list";
    }

    @GetMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id, Model model) {
        employeeService.deleteEmployee(id);
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employee-list";
    }
}
}
*/
