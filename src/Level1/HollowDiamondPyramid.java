package Level1;

import java.util.Scanner;

public class HollowDiamondPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows=sc.nextInt();

        for(int i=1; i<=rows;i++){
            for (int j=i;j<=rows;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                if (k==1||k==(2*i-1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i=rows-1;i>=1;i--){
            for (int j=rows;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i*2-1;k++){
                if (k==1||k==i*2-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



