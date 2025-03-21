import java.util.*;

public class FunctionsAndMethodClass {
    // Function:- A block of code  
 
    // Q1. Print a given name using a function
    public static void printMyName(String name) {
        System.out.println(name);
    }

    // Q2. Make a function to add 2 numbers and return the sum
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // Q3. Make a function to multiply 2 numbers and return the product
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    // Q4. Find the factorial of a number
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }

    // Q1. Make a function to check if a number is prime or not
    public static void checkPrime(int n) {
        if (n < 2) {
            System.out.println("Not a prime number");
            return;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }

    // Q2. Make a function to check if a given number n is even or not
    public static void checkEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    // Q3. Make a function to print the table of a given number n
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.next();
        printMyName(name);

        System.out.print("Enter two numbers to add: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum of 2 numbers is: " + sum);

        System.out.print("Enter a number to find its factorial: ");
        int fac = sc.nextInt();
        printFactorial(fac);
        
        checkPrime(fac);
        checkEven(fac);
        printTable(fac);
        
        sc.close();
    }
}

