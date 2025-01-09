import java.util.Scanner;
public class BaseExponent
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base:");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent:");
        double exponent = sc.nextDouble();
        double BE = Math.pow(base,exponent);
        System.out.print("Base raised to exponent:" +BE);
        sc.close();
    }
}