
import java.util.*;
public class LoopsClass {
  /*
  For Loop
  while Loop
  do while Loop
   */
  public static void main(String args[]){
    // for loop
    for(int counter = 0;counter<3;counter++){
        System.out.println("Hello World");
    }
    // Q.print number 0 to 10
    for(int counter = 0;counter<11;counter++){
        System.out.println(counter);
    }
    // while loop
    int i = 0;
    while(i<11){
      System.out.println(i);
      i++;
    } 
    // Do while loop
    int j = 0;
    do{
     System.out.println(j);
     j++;
    }while(j<11);
    // do run atleast one time if contion is false
    int k = 12;
    do{
      System.out.println("Apna college");
    }while(k<11);
    // Q Print the sum of first n Natural Number
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    for(int counter=0;counter<=num;counter++){
      sum = sum+counter;
    }
    System.out.println(sum);
    // Q Print the table of a number input by the user
    int table = sc.nextInt();
    for(int count=1;count<11;count++){
      System.out.println(table*count);
    }
  //  H.W
  // Q1.Print all even number till n
  System.out.println("Print even number: ");
  int numq1  = sc.nextInt();
  for(int count=2;count<numq1;count = count+2){
            System.out.println(count);
  }
  // Q2.Run given loop
  // for(; ;){
  //   System.out.println("Apna college");
  // }
  // This loop run infinite times

  // Q3.
int input;
do {
      int marks = sc.nextInt();
      if(marks >= 90 && marks <= 100) {
          System.out.println("This is Good");
      } 
      else if(marks >= 60 && marks <= 89) {
          System.out.println("This is also Good");
      } 
      else if(marks >= 0 && marks <= 59) {
          System.out.println("This is Good as well");
      } 
      else {
          System.out.println("Invalid");
      }
      System.out.println("Want to continue ? (yes(1) or no(0))");
      input = sc.nextInt();
     } while(input == 1);
    //Q4.  Check prime number
    boolean isPrime = true;
    int checkPrimeNumber = sc.nextInt();
    for(int num1 = 2;num1*num1<=checkPrimeNumber;num1++){
         if(checkPrimeNumber/i==0){
          isPrime = false;
          break;
         }
    }
    if(isPrime){
      if(checkPrimeNumber==1){
        System.out.println("Not Prime");
      }
      System.out.println("Prime");
    }
    else{
      System.out.println("Not Prime");
    }


}   
}

 

