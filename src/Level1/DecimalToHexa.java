package Level1;

import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be converted to hexadecimal number:");
        int n = sc.nextInt();
        //        System.out.println(Integer.toString(n,16));       //using Integer.toString Method

        int[] hexNum = new int[100];
        int c = 0;     //counter
        while (n != 0) {

            hexNum[c] = n % 16;  //Storing Reminder in an array

            n = n / 16;         //dividing by 16

            c++;                //Increment of counter
        }

//        printing hexadecimal numbers in reverse order
        for (int i = c - 1; i >= 0; i--) {
            if (hexNum[i] > 9) {
                System.out.print((char) (55 + hexNum[i]));
            } else {
                System.out.println(hexNum[i]);
            }
        }
    }
}





