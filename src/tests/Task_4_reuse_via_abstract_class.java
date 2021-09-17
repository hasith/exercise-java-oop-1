package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import app.Person;
import app.Student;
import java.lang.reflect.Method;

public class Task_4_reuse_via_abstract_class {

    @Test
    public void does_abstract_class_have_getName() {
        try {
            Person.class.getMethod("getName");
        } catch (NoSuchMethodException e) {
            fail("Abstract class should implement getName method");
        }
    }

    @Test
    public void does_abstract_class_have_setName() {
        try {
            Person.class.getMethod("setName", String.class);
        } catch (NoSuchMethodException e) {
            fail("Abstract class should implement setName method");
        }
    }

    @Test
    public void does_abstract_class_have_getNIC() {
        try {
            Person.class.getMethod("getNIC");
        } catch (NoSuchMethodException e) {
            fail("Abstract class should implement getNIC method");
        }
    }

    @Test
    public void does_abstract_class_have_setNIC() {
        try {
            Person.class.getMethod("setNIC", String.class);
        } catch (NoSuchMethodException e) {
            fail("Abstract class should implement setNIC method");
        }
    }

    @Test
    public void is_student_getName_inherited_from_person() {
        try {
            Method m = Student.class.getMethod("getName");
            assertEquals(Person.class, m.getDeclaringClass());
        } catch (NoSuchMethodException e) {
            fail("Student class should inherit getName method from Person abstract class");
        }
    }

}
