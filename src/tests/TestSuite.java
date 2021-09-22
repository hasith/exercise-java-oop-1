package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
        Task_1_add_interface_to_student.class, 
        Task_2_complete_instructor.class,
        Task_3_abstract_class_person.class,
        Task_4_reuse_via_abstract_class.class,
        Task_5_implement_getAge.class,
        Task_6_instructor_methods_in_course.class,
        Task_7_course_getAllAssociatedPersons.class
     })

public class TestSuite {

}
