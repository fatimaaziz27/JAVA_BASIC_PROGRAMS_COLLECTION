# Java Basic Programs Collection

This repository contains **common Java programming practice problems** for beginners.
It includes programs related to **numbers, loops, conditions, arrays, and strings** to help students practice core Java concepts.

These programs are useful for:

* Beginners learning Java
* Programming practice
* Interview preparation
* University assignments

---

## Programs Included

### Number Based Programs

1. Check Even or Odd
2. Check Prime Number
3. Factorial of a Number
4. Fibonacci Series
5. Reverse a Number
6. Check Palindrome Number
7. Armstrong Number
8. Sum of Digits

### Comparison & Mathematical Programs

9. Largest of Three Numbers
10. GCD of Two Numbers
11. LCM of Two Numbers
12. Check Leap Year

### String Programs

13. Count Vowels and Consonants

---

## Concepts Used

The programs in this repository demonstrate the use of:

* Java **loops** (for, while)
* **Conditional statements** (if-else)
* **User input using Scanner**
* **Basic mathematics operations**
* **String processing**
* **Functions / methods**

---

## Example Program

Example: Even or Odd

```java
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
```
