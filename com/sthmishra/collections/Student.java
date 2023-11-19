package com.sthmishra.collections;

public class Student implements Comparable<Student> {
    int id;
    String name;
    double psp;
    int age;

    Student(int id, String name, double psp, int age) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return (int)(other.psp - this.psp);
    }

    @Override
    public String toString() {
        return "#" + this.id + " " + this.name + " scored " + this.psp;
    }
}
