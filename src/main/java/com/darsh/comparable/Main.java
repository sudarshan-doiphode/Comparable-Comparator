package com.darsh.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sachin", 23);
        Student s2 = new Student("Virat", 30);
        Student s3 = new Student("Manish", 20);
        Student s4 = new Student("Suresh", 33);
        Student s5 = new Student("Harish", 11);

        List<Student> students = new ArrayList<>(List.of(s1, s2, s3, s4, s5));

//        Collections.sort(students); //ascending order
        Collections.sort(students, Collections.reverseOrder()); //decending order

        students.stream().forEach(System.out::println);
    }
}
