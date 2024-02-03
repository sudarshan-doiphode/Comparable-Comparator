package com.darsh.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.age() > o2.age()) return 1;
        if (o1.age() < o2.age()) return -1;
        return 0;
    }
}
