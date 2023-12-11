# Difference Between Arrays and ArrayLists in Java

## Overview
In Java, arrays and ArrayLists are both used to store collections of items, but they have some key differences.

### Arrays
An array in Java is a basic way to store a fixed number of elements of the same type. Once you create an array, its size cannot be changed. This makes arrays simple and efficient, especially when you know the exact number of elements you need to store. Arrays can hold both primitive data types, like `int` and `char`, and objects.

### ArrayLists
ArrayLists, on the other hand, are part of Java's Collections Framework and are more flexible than arrays. They can dynamically resize, which means you can add or remove elements, and the ArrayList will automatically adjust its size. However, ArrayLists can only store objects, not primitive data types. This makes ArrayLists a better choice when you need a collection whose size can change, or when you want more advanced methods to manage the collection.

## Cloning and Running the Program

### Cloning the Repository
To clone the repository to your local machine, follow these steps:
1. Open your terminal or command prompt.
2. Navigate to the directory where you want to clone the repository.
3. Run the following command: git clone https://github.com/your-username/Difference-Arrays-ArrayLists.git

Replace `your-username` with your actual GitHub username.

### Running the Program
To run the program, you'll need Java installed on your machine. Then, follow these steps:
1. Navigate to the cloned repository's directory in your terminal or command prompt.
2. Compile the Java program by running: javac DifferenceArraysArrayLists.java
