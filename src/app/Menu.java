package app;


import java.util.*;

public class Menu {

    private final Scanner sc = new Scanner(System.in);

    public int requestUserOption() {
        boolean valid = false;
        int menuOption = -1;

        while (!valid) {
            System.out.println("What do you want to do? (enter menu number)");
            String str = sc.nextLine();

            try {
                menuOption = Integer.parseInt(str);
                valid = true;
            } catch (Exception e) {
                continue;
            }

        }
        return menuOption;
    }

    public void print() {
        System.out.println("\n\n---------------------------------");
        System.out.println("1. Add new student to course");
        System.out.println("2. Print All students in course");
        System.out.println("3. Exit Program");
    }

    public void close() {
        sc.close();
    }
}
