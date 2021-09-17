package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import app.Course;
import app.Instructor;
import app.Student;

public class Task_7_course_getAllAssociatedPersons {
    @Test
    public void is_instructor_methods_work() throws Exception {
        Course course = new Course("test course");
        assertEquals(0, course.getAllAssociatedPersons().size());

        course.addInstructor(new Instructor());
        course.addInstructor(new Instructor());
        course.addInstructor(new Instructor());
        assertEquals(3, course.getAllAssociatedPersons().size());

        course.addStudent(new Student());
        course.addStudent(new Student());
        assertEquals(5, course.getAllAssociatedPersons().size());
    }
}
