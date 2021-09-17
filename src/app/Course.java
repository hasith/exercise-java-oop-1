package app;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private List<Student> students;
    private List<Instructor> instructors;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
        this.instructors = new ArrayList<Instructor>();
    }

    public String getName() {
        return this.name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void printStudents() {
        if (this.students.size() > 0) {
            for (int i = 0; i < this.students.size(); i++) {
                System.out.println(this.students.get(i));
            }
        } else {
            System.out.println("-no students in this course-");
        }

    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public List<Instructor> getInstructors() {
        return this.instructors;
    }

    public List<IPerson> getAllAssociatedPersons() {
        List<IPerson> all = new ArrayList<IPerson>();
        all.addAll(this.instructors);
        all.addAll(this.students);
        return all;
    }
}
