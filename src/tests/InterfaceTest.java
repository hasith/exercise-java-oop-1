package tests;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import app.Student;
import app.IPerson;

public class InterfaceTest {

    @Test
    public void task1_studentImplementIPerson() {
        var student = new Student("John");
        assertTrue("Student class should implement IPerson interface", student instanceof IPerson);
    }
}
