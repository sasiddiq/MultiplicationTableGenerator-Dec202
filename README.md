
# **Multiplication Table Generator – Java Program**

## 📌 **Overview**

This simple Java console application prompts the user to enter a number and then prints the multiplication table for that number from 1 to 10.

It is a beginner-friendly exercise designed to help understand:

* User input using `Scanner`
* Basic `for` loops
* String formatting
* Arithmetic operations in Java

---

## 🚀 **How the Program Works**

1. The program displays a message asking the user to enter a number.
2. It reads the integer input using the `Scanner` class.
3. A `for` loop runs from 1 to 10, multiplying the given number by each value.
4. Each line of the multiplication table is printed in the format:

```
[number] x [i] = [result]
```

---

## 🖥️ **Sample Output**

```
Enter a number to print its multiplication table
5
Multiplication Table for 5:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
```

---

## 📂 **Code**

```java
package day5;

import java.util.Scanner;

public class MultiplicationTableGenerator {

    public static void main(String[] args) 
    {
        System.out.println("Enter a number to print its multiplication table");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++)
        {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
```

---

## 📘 **Concepts Used**

* **`Scanner` class** for reading user input
* **Loops (`for`)** for iterating from 1 to 10
* **Basic arithmetic** operations
* **String concatenation** for output formatting

---

## 🛠️ **How to Run**

1. Save the file as `MultiplicationTableGenerator.java` inside a folder named `day5`.
2. Open a terminal and navigate to the folder containing the code.
3. Compile the program:

```
javac day5/MultiplicationTableGenerator.java
```

4. Run the program:

```
java day5.MultiplicationTableGenerator
```

---

## ✅ **Future Enhancements (Optional)**

You can expand the program by adding:

* Input validation
* Allowing the user to choose the table range
* Generating tables for multiple numbers
* Printing the table in reverse

---

