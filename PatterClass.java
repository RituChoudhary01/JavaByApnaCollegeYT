public class PatterClass {
    //Q1 Print the Pattern Solid Rectangle
    public static void main(String args[]){
        int n = 4;
        int m = 5;
        System.out.print("patter1\n");
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Q2. Print the Hollow Rectange pattern
        System.out.print("patter2\n");
        int num1 = 4;
        int num2 = 5;
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==num1||j==num2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Q3.Print the half pyramid patter
        System.out.print("patter 3\n");
            int num3=5;
            for(int i=1;i<=num3;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            // Q4.Print the Inverted Half Pyramid
            System.out.print("Pattern 4\n");
            int num4 = 4;
            for(int i=num4;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            // Q5.Print the Inverted Half Pyramid(rotated by 180 deg.) patter
            System.out.print("Patter 5\n");
            int num5 = 4;
            for(int i=1;i<=num5;i++){
                // spaces
                for(int j=1;j<=num5-i;j++){
                    System.out.print(" ");
                }
                // *
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
               System.out.println();
            }
            // Q6.Print Half Pyramid with number
                System.out.print("Patter 6\n");
                int num6 = 5;
                for(int i=1;i<=num6;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                // Q7.Inveted Half Pyramid with Number
                System.out.print("Patter 7\n");
                int num7=5;
                for(int i=1;i<=num7;i++){
                    for(int j=1;j<=num7-i+1;j++){
                        System.out.print(j);
                    }
                    System.out.println();
                }
                // Q8.Print the Floyd's Triangle
                System.out.print("Patter 8\n");
                int num8 = 5;
                int count = 1;
                for(int i=1;i<=num8 ;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print(count+" ");
                        count++;
                    }
                    System.out.println();
                }
                // Q9.Print the 0-1 Triangle
                System.out.print("Patter 9\n");
                int num9 = 5;
                for(int i=1;i<num9;i++){
                    for(int j=1;j<=i;j++){
                        int sum = i+j;
                        if(sum%2==0){
                            System.out.print("1");
                        }
                        else{
                            System.out.print("0");
                        }
                    }
                        System.out.println();
                    }   
                }
}
