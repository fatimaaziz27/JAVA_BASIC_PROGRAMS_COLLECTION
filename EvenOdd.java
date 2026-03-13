

//                                ===============  Java Basic Programs Collection  ===============
// This repository contains common Java programming practice problems for beginners such as number problems, array algorithms, and string operations.


// 1. Check Even or Odd

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

// 2. Check Prime Number

// import java.util.Scanner;

// public class PrimeNumber {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int flag = 0;

//         for(int i = 2; i <= num/2; i++) {
//             if(num % i == 0) {
//                 flag = 1;
//                 break;
//             }
//         }

//         if(flag == 0)
//             System.out.println("Prime Number");
//         else
//             System.out.println("Not Prime");
//     }
// }

// // 3. Factorial of a Number

// import java.util.Scanner;

// public class Factorial {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int fact = 1;

//         for(int i = 1; i <= num; i++) {
//             fact = fact * i;
//         }

//         System.out.println("Factorial = " + fact);
//     }
// }

// // 4. Fibonacci Series (First N Terms)

// import java.util.Scanner;

// public class Fibonacci {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int a = 0, b = 1;

//         for(int i = 1; i <= n; i++) {
//             System.out.print(a + " ");

//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }
// }

// // 5. Reverse a Number

// import java.util.Scanner;

// public class ReverseNumber {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int reverse = 0;

//         while(num != 0) {
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num = num / 10;
//         }

//         System.out.println("Reverse = " + reverse);
//     }
// }

// // 6. Check Palindrome Number

// import java.util.Scanner;

// public class PalindromeNumber {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int original = num;
//         int reverse = 0;

//         while(num != 0) {
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num = num / 10;
//         }

//         if(original == reverse)
//             System.out.println("Palindrome");
//         else
//             System.out.println("Not Palindrome");
//     }
// }

// // 7. Armstrong Number

// import java.util.Scanner;

// public class Armstrong {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         int temp = num;

//         while(temp != 0) {
//             int digit = temp % 10;
//             sum = sum + (digit * digit * digit);
//             temp = temp / 10;
//         }

//         if(sum == num)
//             System.out.println("Armstrong Number");
//         else
//             System.out.println("Not Armstrong");
//     }
// }

// // 8. Sum of Digits

// import java.util.Scanner;

// public class SumDigits {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;

//         while(num != 0) {
//             sum += num % 10;
//             num /= 10;
//         }

//         System.out.println("Sum = " + sum);
//     }
// }

// // 9. Largest of Three Numbers

// import java.util.Scanner;

// public class LargestNumber {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if(a >= b && a >= c)
//             System.out.println("Largest = " + a);
//         else if(b >= a && b >= c)
//             System.out.println("Largest = " + b);
//         else
//             System.out.println("Largest = " + c);
//     }
// }

// // 10. GCD of Two Numbers

// import java.util.Scanner;

// public class GCD {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int gcd = 1;

//         for(int i = 1; i <= a && i <= b; i++) {
//             if(a % i == 0 && b % i == 0)
//                 gcd = i;
//         }

//         System.out.println("GCD = " + gcd);
//     }
// }

// // 11. LCM of Two Numbers

// import java.util.Scanner;

// public class LCM {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int lcm = (a * b) / gcd(a,b);

//         System.out.println("LCM = " + lcm);
//     }

//     static int gcd(int a, int b) {
//         while(b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }

// // 12. Check Leap Year

// import java.util.Scanner;

// public class LeapYear {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();

//         if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
//             System.out.println("Leap Year");
//         else
//             System.out.println("Not Leap Year");
//     }
// }

// // 13. Count Vowels and Consonants

// import java.util.Scanner;

// public class VowelsConsonants {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         int vowels = 0, consonants = 0;

//         for(char ch : str.toCharArray()) {
//             if("aeiouAEIOU".indexOf(ch) != -1)
//                 vowels++;
//             else if(Character.isLetter(ch))
//                 consonants++;
//         }

//         System.out.println("Vowels = " + vowels);
//         System.out.println("Consonants = " + consonants);
//     }
// }

// Topics Covered
// Numbers

// Even / Odd

// Prime

// Factorial

// Fibonacci

// Palindrome

// Armstrong

// GCD / LCM

// Strings

// Reverse String

// Count Words

// Remove Spaces

// Remove Duplicates

// Arrays

// Linear Search

// Binary Search

// Bubble Sort

// Selection Sort

// Insertion Sort

// Second Largest Element

// Merge Arrays

// Matrix

// Matrix Addition

// Matrix Transpose

// If you want, I can also make a complete GitHub repository structure with folders like this (very professional for portfolio):

// java-programs
// │
// ├── numbers
// ├── arrays
// ├── strings
// ├── matrix
// └── sorting

// Just tell me and I’ll prepare it for you.
