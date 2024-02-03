package com.darsh.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.name().compareTo(o2.name()) > 0) return 1;
        else if (o1.name().compareTo(o2.name()) < 0) return -1;
        return 0;
    }
}
