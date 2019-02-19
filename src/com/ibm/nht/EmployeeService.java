package com.ibm.nht;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/EmployeeService")

public class EmployeeService {
    EmployeeForDatabase empDao = new EmployeeForDatabase();
    @GET
    @Path("/insertEmployee")
    @Produces(MediaType.APPLICATION_JSON)
    public String insertEmployee() {
        Employee employee = new Employee();
        empDao.insert(employee);
            return "success";
    }
    @GET
    @Path("/getEmployee")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getEmployee() {
        Employee employee = new Employee();
        employee.setName("mela");
        employee.setRole("Trainee");
        employee.setSalary(500);
       
        Employee employee1 = new Employee();
        employee1.setName("Yedda");
        employee1.setRole("Trainee");
        employee1.setSalary(500);
        
        Employee employee2 = new Employee();
        employee2.setName("Sheena");
        employee2.setRole("Trainee");
        employee2.setSalary(500);
        
        Employee employee3 = new Employee();
        employee3.setName("Enj");
        employee3.setRole("Trainee");
        employee3.setSalary(500);

        List<Employee> li = new ArrayList<Employee>();
        
        li.add(employee);
        li.add(employee1);
        li.add(employee2);
        li.add(employee3);
            return li;
    }
}
