# Executors and Callables

## Executors Class and ExecutorService Interface

The `Executors` class and the `ExecutorService` interface provide a framework for managing 
and controlling the execution of concurrent tasks using a pool of worker threads. 

These components are part of the `java.util.concurrent package`, which 
offers a higher-level concurrency framework compared to traditional 
thread-based approaches.

### newFixedThreadPool and newCachedThreadPool

`ExecutorService.newFixedThreadPool` and `ExecutorService.newCachedThreadPool` are 
two methods provided by the `ExecutorService` interface in Java to 
create thread pools with different characteristics. 

#### 1. `newFixedThreadPool(int nThreads)` method:

* **Description:** This method creates a fixed-size thread pool where the number of threads 
remains constant. The pool has a specified number of threads (nThreads) 
that are all active and available for executing tasks. 
If a task is submitted when all threads are busy, 
it is queued until a thread becomes available. 
If a thread encounters an exception and terminates, a new one will be created to 
replace it.


* **Use Case:** Suitable for scenarios where a fixed number of threads 
is desired to control resource usage, especially when tasks 
may have dependencies and need to be executed concurrently 
with a controlled degree of parallelism.

```java
// FixedThreadPoolExample.java
package com.sthmishra.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        for(int i = 0; i < 10; i++) {
            int taskId = i+1;
            Runnable runnable = () -> {
                String currentThreadName = Thread.currentThread().getName();
                try {
                    Thread.sleep(500);
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
                System.out.println("Task " + taskId + " executed by thread " + currentThreadName);
            };
            fixedThreadPool.execute(runnable);
        }

        fixedThreadPool.shutdown();
    }
}

```

#### 2. `newCachedThreadPool()` method:

* **Description:** This method creates a thread pool that dynamically 
adjusts its size based on the number of active tasks. 
Threads are created on-demand and reused if available, otherwise, a new thread is created.
Threads that have been idle for a certain period may be terminated 
and removed from the pool to conserve resources.


* **Use Case:** Suitable for scenarios with a variable number of tasks 
and where threads can be created and terminated as needed. 
It's a good choice for handling a large number of short-lived asynchronous tasks.







