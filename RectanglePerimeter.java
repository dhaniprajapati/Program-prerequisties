import java.util.Scanner;
public class RectanglePerimeter
{
    public static void main(String arga[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length:");
        double length = scanner.nextDouble();

        System.out.print("Input Breadth:");
        double breadth = scanner.nextDouble();

        double perimeter = 2 * (length+breadth);

        System.out.print("Perimeter of Rectangle:" +perimeter);
        scanner.close();
    }
}