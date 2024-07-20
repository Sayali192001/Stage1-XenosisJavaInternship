package Level1;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixedNumber = 10;

        try {
            System.out.println("Enter a Number to divide a fixed number:");
            int num=sc.nextInt();

            int result=fixedNumber/num;
            System.out.println("Result="+result);
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
        catch (Exception e){
            System.out.println("Error Occured"+e);
        }

        finally {
            sc.close();
        }
    }
}




