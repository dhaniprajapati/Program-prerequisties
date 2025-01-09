import java.util.Scanner;
public class KiloToMile
{
    public static void main(String args[])
    {
    Scanner scanner= new Scanner(System.in);

    System.out.print("Enter distance in Kilometers:");
    double kilometer= scanner.nextDouble();

    double miles= kilometer * 0.621371;

    System.out.print("Distance in miles:" +miles);
    scanner.close();
    }
}