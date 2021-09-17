package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

import app.Student;
import java.lang.reflect.Method;

public class Task_5_implement_getAge {

    @Test
    public void is_setBirthYear_method_exists_in_student() {
        try {
            var year = 2000;
            Student student = new Student();

            Method set = Student.class.getMethod("setBirthYear", int.class);
            set.invoke(student, year);

            Method get = Student.class.getMethod("getBirthYear");
            var yearResult = get.invoke(student, year);

            assertEquals(year, ((Integer)yearResult).intValue());
        } catch (Exception e) {
            fail("Student class should inherit setBirthYear, getBirthYear methods from Person abstract class");
        }
    }
}
