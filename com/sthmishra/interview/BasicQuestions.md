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



