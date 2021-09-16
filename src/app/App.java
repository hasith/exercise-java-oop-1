package app;

import java.util.*;

public class App
{

    private static final Course course = new Course("Java Programming Course");
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();

        while (true) {
            menu.print();
            int menuOption = menu.requestUserOption();

            if (menuOption == 1) {
                addStudent();
            } else if (menuOption == 2) {
                printStudents();
            } else {
                sc.close();
                menu.close();
                exitProgram();
            }
        }

    }

    private static void addStudent() {
        
        System.out.println("What is the name of the student?");
        String name = sc.nextLine();
        course.addStudent(new Student(name));
    }

    private static void printStudents() {
        course.printStudents();
    }

    private static void exitProgram() {
        System.exit(0);
    }
}
