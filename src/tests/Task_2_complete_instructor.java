package tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.Instructor;
import app.IPerson;

public class Task_2_complete_instructor {

    @Test
    public void is_interface_implemented() {
        var instructor = new Instructor();
        assertTrue("Instructor class should implement IPerson interface", instructor instanceof IPerson);
    }

    @Test
    public void does_interface_methods_work() {
        var name = "Mark Instructor";
        var nic = "1234567890";
        var instructor = (IPerson) new Instructor();
        
        instructor.setName(name);
        instructor.setNIC(nic);

        assertEquals(name, instructor.getName());
        assertEquals(nic, instructor.getNIC());
    }

}
