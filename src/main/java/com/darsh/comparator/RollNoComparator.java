package com.darsh.comparator;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.rollNo() > o2.rollNo()) return 1;
        if (o1.rollNo() < o2.rollNo()) return -1;
        return 0;
    }
}
