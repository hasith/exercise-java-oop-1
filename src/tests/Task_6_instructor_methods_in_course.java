package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import app.Course;
import app.Instructor;

public class Task_6_instructor_methods_in_course {
    @Test
    public void is_instructor_methods_work() throws Exception {
        Course course = new Course("test course");
        assertEquals(0, course.getInstructors().size());

        course.addInstructor(new Instructor());
        course.addInstructor(new Instructor());
        course.addInstructor(new Instructor());
        assertEquals(3, course.getInstructors().size());

        course.getInstructors().remove(0);
        assertEquals(2, course.getInstructors().size());
    }
}
