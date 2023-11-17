package com.sthmishra.collections;

public class StudentMarks {
    private int math;
    private int physics;

    public StudentMarks(int math, int physics) {
        this.math = math;
        this.physics = physics;
    }

    public int getMath() {
        return math;
    }

    public int getPhysics() {
        return physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "math=" + math +
                ", physics=" + physics +
                '}';
    }
}
