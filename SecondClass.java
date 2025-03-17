import java.util.Scanner;

public class SecondClass {
    public static void main(String [] args){
        // print
        System.out.println("Hello World With Java");
        // println
        System.out.println("Hello World With Java");
        // "\n"
        System.out.print("Hello World With Java\n");

        // Print pattern
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        // varibles
        String name="tony stark";
        int age = 45;
        double price = 23.34;
        int a=10;
        int b = 25;
        int sum = a+b;
        System.out.println(sum);
        int diff = b-a;
        System.out.println(diff);
        int mul = a*b;
        System.out.println(mul);
        //Input
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        // nextInt
        System.out.println(name1);
        
        // Q. take 2 varible in input and write print sum
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int total = num1+num2;
        System.out.println(total);
        // H.W
        // Q1.Write a program to calculates radius of circle
        int radius = sc.nextInt();
        double PI = 3.14;
        double area = PI*radius*radius;
        System.out.println("Radius of circle: "+radius+" Area of circle is: "+area);
       //Q2. Print a table of a number
       int table = sc.nextInt();
       for(int i=1;i<=10;i++){
        System.out.println(table+" * "+i+" = "+table*i);
       }
    }
}
