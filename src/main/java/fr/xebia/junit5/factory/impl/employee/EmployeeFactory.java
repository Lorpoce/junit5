package fr.xebia.junit5.factory.impl.employee;

import fr.xebia.junit5.factory.PojoFactory;

import java.util.UUID;

public class EmployeeFactory implements PojoFactory<Employee> {

    @Override
    public Employee create() {

        Employee employee = new Employee();

        employee.setId(UUID.randomUUID().toString());
        employee.setFirstname("John");
        employee.setLastname("Doe");

        return employee;
    }
}
