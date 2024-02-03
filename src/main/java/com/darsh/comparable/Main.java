package com.darsh.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sachin", 33);
        Student s2 = new Student("Virat", 20);
        Student s3 = new Student("Yuzi", 39);
        Student s4 = new Student("Mahi", 18);
        final List<Student> students = new ArrayList<>(List.of(s1, s2, s3, s4));

        // Collections.sort(students); //ascending order default
        Collections.sort(students, Collections.reverseOrder());

        students.stream().forEach(System.out::println);
    }
}
