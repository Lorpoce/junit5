package fr.xebia.junit5.factory.impl.employee;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class EmployeeFactoryTest {

    private EmployeeFactory employeeFactory;

    @Before
    public void before() {
        employeeFactory = new EmployeeFactory();
    }

    @Test
    public void testCreate() {
        // When
        Employee employee = employeeFactory.create();

        // Then
        assertNotNull(employee);
        assertNotNull(employee.getId());
        assertNotNull(employee.getLastname());
        assertNotNull(employee.getFirstname());
    }

}
