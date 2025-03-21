public class AdvancedPatternClass {
    public static void main(String args[]){
    // Q1. Print Butterfly Pattern 
    System.out.println("Butterfly Pattern");
    int num1 = 5;
    // upper half
    for(int i=1;i<=num1;i++){
        // 1st part
       for(int j=1;j<=i;j++){
        System.out.print("*");
       }
    //    spaces
    int spaces = 2*(num1-i);
    for(int j=1;j<=spaces;j++){
        System.out.print(" ");
    }
    // 2nd part
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
    }
    // lower half
    for(int i=num1;i>=1;i--){
        // 1st part
       for(int j=1;j<=i;j++){
        System.out.print("*");
       }
    //    spaces
    int spaces = 2*(num1-i);
    for(int j=1;j<=spaces;j++){
        System.out.print(" ");
    }
    // 2nd part
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
    }

    // Q2.Print Solid Rhombus
    System.out.println("Solid Rhombus");
    int num2 = 5;
    // outer loop
    for(int i=1;i<=num2;i++){
        // spaces
        for(int j=1;j<=num2;j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1;j<num2;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    // Q3. Print Number Pyramid
    System.out.println("Number Pyramid");
    int num3=5;
    for(int i=1;i<=num3;i++){
        // spaces
        for(int j=1;j<num3-i;j++){
            System.out.print(" ");
        }
        // numbers
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    // Q4.Print Palindromic Pattern
    System.out.println("Palindromic Pattern");
    int num4 = 5;
    for(int i=1;i<=num4;i++){
        // spaces
        for(int j=1;j<=num4-i;j++){
            System.out.print(" ");
        }
        // 1st half numbers
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        // 2nd half numbers
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    // Q5.Print Diamond Pattern
    System.out.println("Diamond Pattern");
    int num5=4;
    // upper half
    for(int i=1;i<=num5;i++){
    //  spaces
    for(int j=1;j<=num5-i;j++){
        System.out.print(" ");
    }
    // stars
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
    }
    // lower half
    for(int i=num5;i>=1;i--){
        //  spaces
        for(int j=1;j<=num5-i;j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
