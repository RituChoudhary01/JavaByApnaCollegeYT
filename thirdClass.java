import java.util.*;
import java.util.Scanner;

public class thirdClass {
    /*
    Conditional Statements
    1.if,else
    2.else if
    3.switch
    4.break

    */ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if(age>18){
                System.out.println("Adult");
            }
            else{
                System.out.println("Not Adult");
            }
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==b){
                System.out.println("Equal");
            }
            else if(a>b){
                System.out.println("a is greater");
            }
            else{
                System.out.println("a is lesser");
            }
            // 
            int button = sc.nextInt();
            if(button == 1){
                System.out.println("Hello");
            }
            else if(button == 2){
                System.out.println("Namaste");
            }
            else if(button == 3){
                System.out.println("Bonjour");
            }
            else{
                System.out.println("Invalid Button");
            }
            // switch
            switch(button){
                case 1:System.out.println("hello");
                break;
                case 2:System.out.println("Namaste");
                break;
                case 3:System.out.println("Bonjour");
                break;
                default: System.out.println("Invalid Button");

            }
            // H.W.
            // Q1. make a calculater
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            System.out.print("Enter an operator (+, -, *, /, %): ");
            sc.nextLine(); // Consume the leftover newline
        char operator = sc.next().charAt(0); // Read a single
            switch(operator){
                case '+':System.out.println(number1+number2);
                break;
                case '-':System.out.println(number1-number2);
                break;
                case '*':System.out.println(number1*number2);
                break;
                case '/':System.out.println(number1/number2);
                break;
                case '%':System.out.println(number1%number2);
                break;
                default: System.out.println("Invalid operator");
                 }
                 sc.close(); 

                //  Q2.Enter a number of months and print the name of months
                int monthNum = sc.nextInt();
                switch(monthNum){
                    case 1:
                    System.out.println("January");
                    break;
                    case 2:
                    System.out.println("February");
                    break;
                    case 3:
                    System.out.println("March");
                    break;
                    case 4:
                    System.out.println("April");
                    break;
                    case 5:
                    System.out.println("May");
                    break;
                    case 6:
                    System.out.println("June");
                    break;
                    case 7:
                    System.out.println("July");
                    break;
                    case 8:
                    System.out.println("August");
                    break;
                    case 9:
                    System.out.println("September");
                    break;
                    case 10:
                    System.out.println("October");
                    break;
                    case 11:
                    System.out.println("November");
                    break;
                    case 12:
                    System.out.println("December");
                    break;
                }

        }
    }


