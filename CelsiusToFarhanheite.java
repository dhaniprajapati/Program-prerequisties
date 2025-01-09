import java.util.Scanner;
public class CelsiusToFarhanheite
{
    public static void main(String args[])
    {
    Scanner scanner= new Scanner(System.in);

    System.out.print("Enter Celsius:");
    double Celsius= scanner.nextDouble();

    double Farhanheite= (Celsius * 9/5) + 32;

    System.out.print("Temperatue in Farhanheite:" + Farhanheite);
    scanner.close();
    }
}