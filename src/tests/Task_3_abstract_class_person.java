package tests;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

import app.Student;
import app.Instructor;
import app.Person;

public class Task_3_abstract_class_person {

    @Test
    public void is_abstract_class() {
        Class<Person> clazz = Person.class;
        assertTrue(Modifier.isAbstract(clazz.getModifiers()));    }

    @Test
    public void does_student_inherits_person() {
        Class<Person> personClazz = Person.class;
        Class<Student> studentClazz = Student.class;
        assertTrue(personClazz.isAssignableFrom(studentClazz));
    }

    @Test
    public void does_instructor_inherits_person() {
        Class<Person> personClazz = Person.class;
        Class<Instructor> instructorClazz = Instructor.class;
        assertTrue(personClazz.isAssignableFrom(instructorClazz));
    }

}
