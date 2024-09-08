package com.example.demo.controller;

import java.util.Collections;
import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Job;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;


@Controller
public class EmployeesController {

    final EmployeeRepository employeeRepository;
    final JobRepository jobRepository;
    public EmployeesController(EmployeeRepository employeeRepository, JobRepository jobRepository) {
        this.employeeRepository = employeeRepository;
        this.jobRepository = jobRepository;
    }

    @GetMapping({"employee/list","employee"})
    public String listarEmployees(Model model) {

        List<Employee> listaEmployee = employeeRepository.findAll();
        model.addAttribute("employeesList", listaEmployee);


        return "listaEmpleados";
    }

    @GetMapping("employee/info/{id}")
    public String informEmployee(@PathVariable("id") Integer employeeId, Model model) {
        Optional<Employee> oEmployee = employeeRepository.findById(employeeId);
        if(oEmployee.isPresent()) {
            Employee employee = oEmployee.get();
            model.addAttribute("employee", employee);
            model.addAttribute("selectedJobId",employee.getJob().getJob_id());
        }
        List<Job> listaJob = jobRepository.findAll();
        model.addAttribute("jobList", listaJob);
        return "inforEmpleado";
    }

    @GetMapping("employee/info/{id}")
    public void borrarEmployee(@PathVariable("id") Integer employeeId, Model model) {
        Optional<Employee> oEmployee = employeeRepository.findById(employeeId);


    }


/*
    private Employee employees = new Employee();
    private Job jobs = new Job();

    @GetMapping({"employee/list", "employee"})
    public String listarEmpleados() {
//        COMPLETAR
        return "XXXXXX";
    }

    @GetMapping("")
    public String informEmpleado() {
        //        COMPLETAR
        return "XXXXXX";
    }

    @GetMapping("")
    public String borrarEmpleado(Model model) {
        model.addAttribute("tipo_alert", "success");
        model.addAttribute("msg", "Se borro el empleado");
//        COMPLETAR
        return "XXXXXX";
    }

 */

}
