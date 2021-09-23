# OOP Abstract Classes and Interfaces (Assignment)

This repository is for students to practice the use of abstractions and interfaces of OOP. The exercise project is implemented in Java.

## Prerequisites

* Knowledge of using a Git repository
* Basic knowledge on Java programming language

## Setting up the project locally

1. Folk this repository from GitHub on to your personal GitHub account.

1. Clone the code from your repository to your local computer.
    ```git clone < your Github repo URL >```

1. Use an IDE of your preference. This solution was originally created by VS Code and therefore necessary settings are already available if you are using VS Code. Optionally you can edit the code files with a simple text editor and use CLI commands to compile, run and test.

1. Compile and Run the application using App.java. This application contains a half built code of a simple CLI application for a School Management System. You should be able to perform the actions such as 'adding students to a course', 'printing students of the course', etc.

    * How to compile the code via CLI commands:
        * Windows: ```javac -cp "src;lib/*" -d bin src/**/*.java```
        * Mac/Linux: ```javac -cp "src:lib/*" -d bin src/**/*.java```

    * How to run the Application via CLI:
        * Windows: ```java -cp "bin;lib/*" app/App```
        * Mac/Linux: ```java -cp "bin:lib/*" app/App```

1. Run the tests using JUnit. Below are the CLI commands unless you use the IDE features.
    * Windows: ```java -cp "bin;lib/*" org.junit.runner.JUnitCore tests.TestSuite```
    * Mac/Linux: ```java -cp "bin:lib/*" org.junit.runner.JUnitCore tests.TestSuite```

    > All the tests will fail as you have not yet completed the required tasks.

## How to solve the tasks

Below is the list of tasks you need to complete to get all tests to run successfully. Solve the tasks in the given sequence.

Once you solve a task, run the tests to verify you have completed it successfully. Every task is covered by one or more tests.

please commit the code and push it to your GitHub repository so that your instructors will be able to see how you progressed step by step.

> You must locally run the tests to see if the test succeed before pushing your code to the Forked GitHub repository.

Once all the tasks are completed and if all your tests succeed, you can submit the URL of your Forked Git repository as the submission of this assessment.

## Tasks to solve

1. **Task 1: Add interface to student**: There is a class called `Student` in the source code. You must get this class to implement `IPerson` interface which you can find in teh code. There can be methods that are required to be added to the `Student` class as a result of this interface implementation.

1. **Task 2: Complete instructor**: Have a look at `Instructor` class. It should be completed similar to `Student` class. This class must also implement the `IPerson` interface.

1. **Task 3: Abstract class person**: There is an empty class in the solution called `Person`. We need to make this an abstract class. Then inherit `Student` and `Instructor` classes from this `Person` abstract class.

1. **Task 4: Reuse via abstract class**: Move following common methods and class-variables in `Student` and `Instructor` to the abstract class `Person`. This allows us to reuse these methods in `Person` and reduce the amount of code in `Student` and `Instructor` classes. Now remove the following methods and class-variables from the 2 inherited child classes.
    * ```private String name```
    * ```private String nic```
    * ```String getName()```
    * ```void setName(String name)```
    * ```String getNIC()```
    * ```void setNIC(String nic)```  

    > Note that the access modifier `private` of the class-variables should be changed to `protected` in order for them to be accessible to the inherited classes.

1. **Task 5: Implement getAge**: Add the following 2 methods to `IPerson` interface. You are required to code the implementation of the 2 methods to `Person` abstract class.
    * ```void setBirthYear(int year)```
    * ```int getBirthYear()```
    * ```int getAge()```

    > You are required to complete the `getAge()` method in `Course` class by adding appropriate logic. Basically the age should be calculated by reducing birth-year from the current year.

1. **Task 6: Instructor methods in course**: There are 2 methods  in `Course` that are related to instructors but not implemented. You need to implement following 2 methods similarly to how `addStudent(Student student)` and `getStudents()` are implemented.
    * ```void addInstructor(Instructor instructor)```
    * ```List<Instructor> getInstructors()```

1. **Task 7: Course getAllAssociatedPersons**: `getAllAssociatedPersons()` method in `Course` is not currently implemented. You are required to implement this method with following logic. Once invoked, this method should return all persons (Students and Instructors) associated with the `Course`, combined into a Single `List`.
