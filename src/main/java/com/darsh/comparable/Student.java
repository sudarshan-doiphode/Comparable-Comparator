package com.darsh.comparable;

public record Student(String name, int age) implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        if (this.age > o.age) return 1;
        else if (this.age < o.age) return -1;
        return 0;
    }
}
