# Java Concurrency and MultiThreading - 1

Welcome to the realm of Java threads, 
where virtual CPUs execute your code in parallel, 
creating a symphony of concurrent operations within your application. 
The main stage is set by the **primary thread**, 
launched by the Java Virtual Machine (JVM) when your application begins its performance.

## 1. Create Threads

Java threads, akin to any other Java objects, are instances of java.lang.Thread or its subclasses. 

Let's dive into the nuances of creating and starting threads with a detailed exploration. 
Broadly, there are two ways to specify what code the thread should execute.

- Create a subclass of `Thread` and override the `run()` method
- Pass an object that implements `Runnable` (`java.lang.Runnable`) to the `Thread` constructor

### 1.1. Thread Subclass Implementation
The classic approach involves extending the Thread class and overriding the run() method. For instance:

```java
// ThreadExample1.java
package com.sthmishra.concurrency;

public class ThreadExample1 {
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("MyThread running");
            System.out.println("MyThread finished");
        }
    }

    public static void main(String[] args) {
        MyThread myThreadObj = new MyThread();
        myThreadObj.start();
    }
}
```

### 1.2. Runnable Interface Implementation

The `Runnable` interface is a standard **Java Interface** that comes with the Java platform. 
The `Runnable` interface only has a single method `run()`.

Whatever the thread is supposed to do when it executes must be included in the implementation of the `run()` method. There are three ways to implement the `Runnable` interface:

* Create a Java class that implements the `Runnable` interface.
* Create an anonymous class that implements the `Runnable` interface.
* Create a Java Lambda that implements the `Runnable` interface.

#### 1.2.1. Java Class Implements Runnable

```java
// ThreadExample2.java
package com.sthmishra.concurrency;

public class ThreadExample2 {
    public static class MyRunnableThread implements Runnable {
        @Override
        public void run() {
            System.out.println("MyRunnableThread running");
            System.out.println("MyRunnableThread finished");
        }
    }

    public static void main(String[] args) {
        MyRunnableThread myThreadObj = new MyRunnableThread();

        Thread thread = new Thread(myThreadObj);
        thread.start();
    }
}
```

#### 1.2.2. Anonymous Implementation of Runnable

```java
// ThreadExample3.java
package com.sthmishra.concurrency;

public class ThreadExample3 {
    public static void main(String[] args) {
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("MyAnonRunnableThread running");
                System.out.println("MyAnonRunnableThread finished");
            }
        };

        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
```

**Note:** Anonymous implementation is now considered to be outdated, and it is suggested to use Java Lambdas if you're not writing a separate class while implementing the `Runnable` interface. However, please keep in mind that if your `Runnable` implementation needs more than just the `run()` method (e.g. a `stop()` or `pause()` method too), then you can no longer create your `Runnable` implementation with a Java lambda expression. A Java lambda can only implement a single method. Instead, you must use a custom class, or a custom interface that extends `Runnable` which has the extra methods, and which is implemented by an anonymous class. 

#### 1.2.3. Java Lambda Implementation of Runnable

```java
// ThreadExample4.java
package com.sthmishra.concurrency;

public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable myRunnable = () -> {
            System.out.println("Lambda running");
            System.out.println("Lambda finished");
        };

        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
```

### 1.3. Choosing Between Subclassing and Implementing Runnable

The choice between extending Thread or implementing Runnable depends on one's design preferences. However, implementing `Runnable` is a more popular choice for most developers.

When having the `Runnable`'s executed by a **thread pool** it is easy to queue up the `Runnable` instances until a thread from the pool is idle. This is a little harder to do with `Thread` subclasses.

## 2. Thread Names

When you create a Java thread you can give it a name. The name can help you distinguish different threads from each other. For instance, if multiple threads write to the console it can be handy to see which thread wrote the text. Here is an example:

```java
// ThreadReference.java
package com.sthmishra.concurrency;

public class ThreadReference {
    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            String threadName = Thread.currentThread().getName(); // fetch our new thread's name
            System.out.println(threadName + " running");
        }
    }
    
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();

        // fetch the name of the current running thread, i.e., the main thread by JVM
        System.out.println(Thread.currentThread().getName() + " running in main method"); 

        Thread thread = new Thread(obj, "MyRunnableMod"); // pass in the name of the thread
        thread.start();
    }
}
```

Output:

```
main running in main method
MyRunnableMod running
```

## 3. Pause Threads

Pause a thread using `Thread.sleep()`. For instance, sleeping for 2 seconds:

```java
// ThreadPause.java
package com.sthmishra.concurrency;

public class ThreadPause {
    public static void main(String[] args) {
        Runnable threadObj = () -> {
            String currentThreadName = Thread.currentThread().getName();
            System.out.println(currentThreadName + " running...");

            try {
                Thread.sleep(2000);
            } catch(Exception ex) {
                ex.printStackTrace();
            }

            System.out.println(currentThreadName + "finished.");
        };

        Thread thread = new Thread(threadObj, "CustomThread1");
        thread.start();

        System.out.println(Thread.currentThread().getName() + " running in main method...");
    }
}
```

## 4. Stop Threads

Stopping a thread requires careful implementation. Avoid using the deprecated `stop()` method. 

Instead, implement a signal mechanism:

```java

```