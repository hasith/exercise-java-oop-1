package tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.Student;
import app.IPerson;

public class Task_add_interface_to_student {

    @Test
    public void is_interface_implemented() {
        var student = new Student();
        assertTrue("Student class should implement IPerson interface", student instanceof IPerson);
    }

    @Test
    public void does_interface_methods_work() {
        var name = "John";
        var nic = "1234567890";
        var student = (IPerson) new Student();
        
        student.setName(name);
        student.setNIC(nic);

        assertEquals(name, student.getName());
        assertEquals(nic, student.getNIC());
    }

}
