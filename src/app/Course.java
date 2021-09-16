package app;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public String getName() {
        return this.name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
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
}
