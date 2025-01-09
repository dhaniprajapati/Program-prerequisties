import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter Principle amopunt:");
        double P = scanner.nextDouble();

        System.out.print("Enter rate of interest:");
        double R = scanner.nextDouble();

        System.out.print("Enter time period:");
        double T = scanner.nextDouble();

        double SI = (P*R*T)/100;

        System.out.print("Simple Interest:" +SI);
        scanner.close();
    }
}