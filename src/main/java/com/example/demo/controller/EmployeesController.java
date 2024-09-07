package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmployeesController {
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
}
