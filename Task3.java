package Lab;

c

public class Task3 {
    public static void main (String[] args ){
         Scanner scanner = new Scanner (System.in);
         System.out.print("Celcius temperature=");
           double celcius = scanner.nextDouble();
           double fahrenhit = (celcius * 9/5)+32;
              System.out.print("Fahrenhit temperature="+ fahrenhit );

    }
}
