package tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.Student;
import app.IPerson;

public class Task_implementing_an_interface {

    @Test
    public void is_interface_implemented() {
        var student = new Student("John");
        assertTrue("Student class should implement IPerson interface", student instanceof IPerson);
    }

    @Test
    public void is_interface_methods_works() {
        var name = "John";
        var nic = "1234567890";
        var student = (IPerson)new Student(name, nic);

        assertEquals(name, student.getName());
        assertEquals(nic, student.getNIC());
    }

}
