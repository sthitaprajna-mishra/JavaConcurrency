package com.sthmishra.exceptionhandling;

public class Client {
    public static void main(String[] args) {
        Doer d = new Doer();
//        d.doSomething();
        try {
            d.findStudentByRollNo(10);
        } catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        } catch(EvenNumberException ex) {
            System.out.println("EvenNumberException");
        } catch(Exception ex) {
            System.out.println("Generic exception");
//            ex.printStackTrace();
        }
    }
}
