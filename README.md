# uni-oop-java-01-objects

![AI generated image from perchance.org of a man in pink pyjamas looking at a laptop scratching his head in confusion with the caption "OOP vs POP"](oop_vs_pop.jpg)

---

TLDR

A simple demo calculator app that operates (+, -, *, /) on two numbers.

---

TOC

* [About](#about)
* [Differences between Java and C](#differences-between-java-and-c)
  * [Portability](#portability)
  * [Programming Paradigm](#programming-paradigm)
  * [Memory Safety](#memory-safety)
  * [Type Checking](#type-checking)
  * [Usage](#usage)

## About

This repository is part of an evolving set of repositories (uni-oop-java-*)
demonstrating coursework in Object Orientated Programming (OOP) using Java.

The purpose of this project was to get familiar with: 
- Java (from a C background) and Maven using IntelliJ 
- Committing, branching, pushing and merging with Git and GitHub 
- Creating objects from existing classes

The app reads two numbers and a choice of operation from the user via an object
created from the `Scanner` class and `System.in`. The created object is assigned
to the variable `scan1` for reuse:   
`Scanner scan1 = new Scanner(System.in);`

It then prints the result.

Errors handled are: divide by 0, invalid number input, invalid operator input.

## Differences between Java and C

### Portability

Java was intended to be a "Write Once, ~~Sue Everyone~~ Run Anywhere" language 
on any system with a Java Virtual Machine. Java code is compiled into byte code 
and interpreted by the JVM. C code is compiled directly into machine code 
specific to a target architecture, making it platform-dependent and requiring 
recompilation for different systems.

### Programming Paradigm

Object-Oriented Programming (OOP) and Procedure-Oriented Programming (POP)
represent two distinct paradigms in software development. Java, is a primarily 
object-oriented, unlike C which is procedure-orientated.

OOP structures programs around objects, which are instances of classes that
encapsulate data and the methods/functions that operate on that data. Everything
in Java, including Strings but not primitives, is organized into classes. This, 
along with features like method overloading, exception handling, inheritance and
polymorphism promote code reusability, modularity and data security.

In contrast, POP organizes programs around functions/procedures,
following a top-down approach where the main function breaks down the problem
into smaller, sequential functions that operate on shared global data.

Java also incorporates features from other programming paradigms e.g. lambda 
expressions from functional programming and threads from concurrent programming, 
making it a multi paradigm language.

### Memory Safety

Java, unlike C, is considered memory safe. It has a garbage collector used for 
automatic memory management. C requires manual memory management using functions
like `malloc` and `free`. Java does not use pointers, which allow direct memory 
manipulation but increase the risk of memory related vulnerabilities such as 
buffer overflows.

### Type Checking

Both Java and C are statically typed languages meaning both perform type 
checking of variables at compile time. While both are statically typed, Java is 
strongly typed while C is considered weakly typed. Weakly typed, because C 
allows unsafe type casts which can lead to undefined behavior. Java ensures that
variables maintain their declared type throughout their lifetime, and operations
that violate type safety, such as adding a string to an integer, result in a 
compile time error.

### Usage

The fundamental differences between Java and C, leads to Java being better 
suited for large, complex applications such as enterprise software, web and 
Android applications, where scalability and maintainability are critical. 
Whereas C is often preferred for smaller, resource-constrained systems like 
embedded applications and low/system level programming due to its direct 
hardware access, lower memory overhead and faster execution speed.