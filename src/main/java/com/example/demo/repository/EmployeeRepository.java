package com.example.demo.repository;

import com.example.demo.entity.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeRepository {
    public ArrayList<Employee> findAll() {

        ArrayList<Employee> listaEmpleados = new ArrayList<>();

        //        COMPLETAR

        return listaEmpleados;
    }

    public Employee findById(int id) {

        Employee employee = new Employee();

 //        COMPLETAR

        return employee;
    }

    public boolean deleteById(int id) {
        String sql = " //        COMPLETAR";
        boolean flag = false;
        try {
            //        COMPLETAR
            flag = true;

        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
}
