package com.sthmishra.collections;

public class StudentMarks implements Comparable<StudentMarks> {
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
    @Override
    public int compareTo(StudentMarks o) {

        /*
            current obj <  other obj
                return -1; // any negative number
            current obj > other obj
                return 1; // any positive number
            current obj == other obj
                return 0;

        */

//        if(this.math < o.math) return -1;
//        if(this.math > o.math) return 1;
//        return 0;

        // above 3 lines can be written in below format

//        return this.math - o.math; // this way it will be ascending
        System.out.println("Comparable's compareTo() is called");
        return o.math - this.math; // this will be descending

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime*result+math;
        result = prime*result+physics;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        StudentMarks other = (StudentMarks) obj;
        if(math != other.math) return false;
        if(physics != other.physics) return false;
        return true;
    }
}
