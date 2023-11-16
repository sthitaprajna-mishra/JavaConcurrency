# Basic Java Interview Questions

### 1. What is class and object? 

#### **Class**

A class can be understood as a template or a blueprint, which contains some values, known as data members, and some set of rules, known as behaviors or methods. 

#### **Objects**

An object is an instance of a class. It is a specific entity created from the class, and it represents a real-world concept. 

In simpler terms, a **class defines the structure and behavior**, while an **object is an actual representation of that structure in memory**.

### 2. Which class is the superclass of all objects in Java and why? 

`java.lang.Object` class is the root or superclass of the class hierarchy, which is present in `java.lang` package. All predefined classes and user-defined classes are the subclasses from `Object` class.

**Every object has common properties.**

To reduce the burden on the developer SUN developed a class called Object by implementing all these properties.

All these methods have generic logic common for all the subclasses, if this logic is not satisfying subclass requirement then subclass can override it. Some of the common ones are - 

**Comparing two objects**
```java
public boolean equals(Object obj)
```
**Retrieving hashcode**
```java
public int hashcode()
```
**Retrieving the run time class object reference**
```java
public final Class getClass()
```

###  3. How can we say that a particular language is an object-oriented programming language?

A language is considered object-oriented if it supports the four fundamental principles of OOP:

* encapsulation
* inheritance
* polymorphism
* abstraction

### 4. Difference between procedural programming language and object-oriented programming language.

| Procedural Programming                                                               | Object-Oriented Programming                                                                |
|--------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| In procedural programming, the program is divided into small parts called **functions**. | In object-oriented programming, the program is divided into small parts called **objects**. |
| Procedural programming follows a **top-down approach**. |   Object-oriented programming follows a **bottom-up approach**.   |
| There is no access specifier in procedural programming. |  Object-oriented programming has access specifiers like private, public, protected, etc. |
| In procedural programming, there is no concept of data hiding and inheritance. | In object-oriented programming, the concept of data hiding and inheritance is used. |
| Procedural programming does not have any proper way of hiding data so it is **less secure**. | Object-oriented programming provides data hiding so it is **more secure**. |

### 5. What is encapsulation? 

Encapsulation is the bundling of data and methods that operate on that data into a single unit, i.e., a class. It helps in hiding the internal state of an object and restricting access to the internal details.

### 6. What do you mean by tightly encapuslated? 

If each variable is declared as private in the class, it is called tightly encapsulated class in Java. 

For a tightly encapsulated class, we are not required to check whether the class contains getter and setter method or not and whether these methods are declared as public or not. For example - 

```java
// TightEncapsulationExample.java
package com.sthmishra.interview;

public class TightEncapsulationExample {
    private double balance;

    public double getBalance() {
        return balance;
    }
}
```
