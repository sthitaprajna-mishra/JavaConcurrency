package com.sthmishra.exceptionhandling;

public class Doer {
    public int doSomething() {
        return 1/0;
    }

    public void findStudentByRollNo(int rollNo) throws ClassNotFoundException, EvenNumberException {
        if(rollNo < 30) {
            if(rollNo%2 == 0) {
                System.out.println("Even block");
                throw new EvenNumberException("Even number exception happened");
            } else {
                System.out.println("Good");
            }
        }
        else {
            throw new ClassNotFoundException();
        }
    }

    // exceptions are checked exceptions

    // class not found can happen
    // network error can happen
    // these can be expected
    // but you cannot expect code to throw nullpointer exception (runtime exception)

    // why are runtime exceptions unchecked? they should already be handled by you
    // IndexOutOfBounds
}
