import java.util.Scanner;
public class SumTwoNum
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1:");
        int num1 = scanner.nextInt();

        System.out.print("Enter num2:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.print("SUM:" +sum);
        scanner.close();
    }
}