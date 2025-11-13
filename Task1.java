package Lab;

import java.util.Scanner;

public class Task1 {
     public static void main (String[] args ){
       Scanner scanner = new Scanner (System.in);

        System.out.print("Enter 1st student mark:");
        double firstmark = scanner.nextDouble();

        System.out.print("Enter 2nd student mark:");
        double sceondmark = scanner.nextDouble();

        System.out.print("Enter 3rd student mark:"); 
        double thirdmark = scanner.nextDouble();
         
        double average = (firstmark+sceondmark+thirdmark)/3;
        System.out.print("Average=" + average);
     }

}
