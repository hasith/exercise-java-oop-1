# exercise-java-oop-1

This repository is for students to practice the use of abstractions and interfaces of OOP. The exercise project is implemented in Java.

## Prerequisites

* Knowledge of using a Git repository
* Basic knowledge on Java programming language

## Setting up the project locally

1. Folk this repository from GitHub on to your personal GitHub account. Clone the code from your repository to your local computer.

1. Use an IDE of your preference. THis solution was originally created by VS Code and therefore necessary settings are already available if you are using VS Code.

1. Run the application using App.java. This application contains a skeleton of a simple command line application. You should be able to perform the actions such as 'adding students', 'printing students', etc.

1. Run the tests using JUnit. All the tests will fail as you have not solved the required tasks.

## How to solve the required tasks

Below is the list of activities you need to perform to get all tests to run successfully. Solve the tasks in the given sequence.

Once you solve a task, please commit the code and push it to your GitHub repository so that your instructors will be able to see how you progressed step by step.

Every task here is covered by one or more test cases. You should locally run the tests to see if the related test is passed before pushing your code to the GitHub repository.

## Tasks to solve

1. **Task_1_add_interface_to_student**: There is a class called ```Student``` in the source code. You must get this class to implement ```IPerson``` interface which you can find in teh code. There can be methods that are required to be added to the ```Student``` class as a result of this interface implementation.

1. **Task_2_complete_instructor**: Have a look at ```Instructor``` class. It should be completed similar to ```Student``` class. This class must also implement the ```IPerson``` interface.

1. **Task_3_abstract_class_person**: There is an empty class in the solution called ```Person```. We need to make this an abstract class. Then inherit ```Student``` and ```Instructor``` classes from this ```Person``` abstract class.

1. **Task_4_reuse_via_abstract_class**: Move following common methods and class-variables in ```Student``` and ```Instructor``` to the abstract class ```Person```. This allows us to reuse these methods in ```Person``` and reduce the amount of code in ```Student``` and ```Instructor``` classes. Now remove the following methods and class-variables from the 2 inherited child classes.
    * ```private String name```
    * ```private String nic```
    * ```String getName()```
    * ```void setName(String name)```
    * ```String getNIC()```
    * ```void setNIC(String nic)```  

    > Note that the access modifier ```private``` of the class-variables should be changed to ```protected``` in order for them to be accessible to the inherited classes.

1. **Task_5_implement_getAge**: Add the following 2 methods to ```IPerson``` interface. You are required to code the implementation of the 2 methods to ```Person``` abstract class.
    * ```void setBirthYear(int year)```
    * ```int getBirthYear()```
    * ```int getAge()```

    > You are required to complete the ```getAge()``` method in ```Course``` class by adding appropriate logic. Basically the age should be calculated by reducing birth-year from the current year.

1. **Task_6_instructor_methods_in_course**: There are 2 methods  in ```Course``` that are related to instructors but not implemented. You need to implement following 2 methods similarly to how ```addStudent(Student student)``` and ```getStudents()``` are implemented.
    * ```void addInstructor(Instructor instructor)```
    * ```List<Instructor> getInstructors()```

1. **Task_7_course_getAllAssociatedPersons**: ```getAllAssociatedPersons()``` method in ```Course``` is not currently implemented. You are required to implement this method with following logic. Once invoked, this method should return all persons (Students and Instructors) associated with the ```Course```, combined into a Single ```List```.
