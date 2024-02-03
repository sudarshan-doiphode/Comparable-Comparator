package com.darsh.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Z", 11, 40);
        Student s2 = new Student("A", 1, 34);
        Student s3 = new Student("B", 35, 55);

        List<Student> students = new ArrayList<>(List.of(s1, s2, s3));

//        Collections.sort(students, new AgeComparator()); //Ascending order by age
//        Collections.sort(students, Collections.reverseOrder(new AgeComparator())); //Descending order by age

        Collections.sort(students, new NameComparator());
        students.stream().forEach(System.out::println);
    }
}
