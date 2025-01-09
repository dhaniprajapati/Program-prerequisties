import java.util.Scanner;
public class AverageOfThreeNum
{
    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter num1:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter num2:");
        double num2 = scanner.nextDouble();

        System.out.print("Enter num3:");
        double num3 = scanner.nextDouble();

        double average = (num1+num2+num3)/3;

        System.out.print("Average of three numbers:" +average);
        scanner.close();
    }
}