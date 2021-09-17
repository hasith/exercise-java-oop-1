package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import app.Instructor;
import app.Student;

import java.lang.reflect.Method;
import java.util.Calendar;

public class Task_5_implement_getAge {
    @Test
    public void is_setBirthYear_method_exists_in_student() throws Exception {
        var year = 2000;
        Student student = new Student();

        Method set = Student.class.getMethod("setBirthYear", int.class);
        set.invoke(student, year);

        Method get = Student.class.getMethod("getBirthYear");
        var yearResult = get.invoke(student);

        assertEquals(year, ((Integer) yearResult).intValue());
    }

    @Test
    public void is_setBirthYear_method_exists_in_instructor() throws Exception {
        var year = 2000;
        Instructor instructor = new Instructor();

        Method set = Instructor.class.getMethod("setBirthYear", int.class);
        set.invoke(instructor, year);

        Method get = Instructor.class.getMethod("getBirthYear");
        var yearResult = get.invoke(instructor);

        assertEquals(year, ((Integer) yearResult).intValue());
    }

    @Test
    public void is_getAge_implemented() throws Exception {
        var year = 2000;
        Instructor instructor = new Instructor();

        Method set = Instructor.class.getMethod("setBirthYear", int.class);
        set.invoke(instructor, year);

        Method get = Instructor.class.getMethod("getAge");
        var age = get.invoke(instructor);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        assertEquals(currentYear - year, ((Integer) age).intValue());
    }

}
