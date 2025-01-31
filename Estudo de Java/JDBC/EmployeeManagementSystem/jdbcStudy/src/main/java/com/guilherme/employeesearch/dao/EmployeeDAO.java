package com.guilherme.employeesearch.dao;

import com.guilherme.employeesearch.model.Employee;

import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EmployeeDAO {
    private Connection conn;

    public EmployeeDAO() throws Exception{
        Properties props = new Properties();
        props.load(new FileInputStream("src\\main\\resources\\demo.properties"));

        String user = props.getProperty("user");
        String password = props.getProperty("password");
        String dburl = props.getProperty("dburl");

        conn = DriverManager.getConnection(dburl, user, password);

        System.out.println("Db connection successful to: " + dburl);
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();

        Statement stm = null;
        ResultSet rs = null;

        try {
            stm = conn.createStatement();

            rs = stm.executeQuery("select * from employees");

            while (rs.next()) {
                Employee employee = convertRowToEmployees(rs);
                employees.add(employee);
            }

            stm.close();
            rs.close();



        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    private Employee convertRowToEmployees(ResultSet rs) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setLastName(rs.getString("last_name"));
        employee.setFirstName(rs.getString("first_name"));
        employee.setEmail(rs.getString("email"));
        employee.setSalary(rs.getBigDecimal("salary"));

        return employee;

    }

    public static void main(String[] args) throws Exception{
        EmployeeDAO dao = new EmployeeDAO();
        System.out.println(dao.getAllEmployees());

    }

}
