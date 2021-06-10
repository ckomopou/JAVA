package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        new Thread(()-> {
//            System.out.println("Printing from the Runnable ");
//            System.out.println("Line 2");
//            System.out.format("This is Line %d\n", 3);
//        }).start();

    Employee john = new Employee("John Doe", 27);
    Employee chara = new Employee("Chara Kom", 100);
    Employee jack = new Employee("Jack Knives", 43);
    Employee frog = new Employee("Frog Roberts ", 33);

    List<Employee> employees = new ArrayList<>();
    employees.add(john);
    employees.add(chara);
    employees.add(jack);
    employees.add(frog);

//    Collections.sort(employees, new Comparator<Employee>(){
//        @Override
//        public int compare(Employee employee1, Employee employee2){
//            return employee1.getName().compareTo(employee2.getName());
//        }
//    });


        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

    for (Employee employee: employees){
        System.out.println(employee.getName());
    }

    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

