import java.util.*;
public class TimeAndSpaceComplaxity {
    // Time Complexity
    // Relation between Input Size & Running Time (Operations)
    // 1.Best case 2.Average case 3.Worst case

    public static void main(String args[]){
    // Q1.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.println("hello");
        }
    }
    // TC:O(n^2)
    // Q2.
     int n1 = sc.nextInt();
     int n2 = sc.nextInt();
     for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            System.out.println("Hello");
        }
     }
//    TC:O(n1*n2)
// Q3
for(int j=0;j<n1;j++){
    System.out.println("Hello");
}
for(int j=0;j<n2;j++){
    System.out.println("Hello");
}
// TC:O(n1+n2);SC:O(1);

  }
}