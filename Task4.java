package Lab;

import java.util.Scanner;


public class Task4 {
     public static void main (String[] args ){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter 1st number:");
         int a = scanner.nextInt();

        System.out.print("Enter 2nd number");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print("1st number="+a);
        System.out.print("2nd number:"+b);

     }
    
}
