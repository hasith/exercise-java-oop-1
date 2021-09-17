package tests;

import static org.junit.Assert.fail;
import org.junit.Test;
import app.Person;

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
            Person.class.getMethod("setName");
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
            Person.class.getMethod("setNIC");
        } catch (NoSuchMethodException e) {
            fail("Abstract class should implement setNIC method");
        }
    }

}
