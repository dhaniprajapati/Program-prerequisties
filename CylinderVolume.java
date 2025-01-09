import java.util.Scanner;
public class CylinderVolume
{
    public static void main(String args[])
    {
       Scanner scanner= new Scanner(System.in);
        System.out.print("Radius of the Cylinder:");
        double radius = scanner.nextDouble();

        System.out.print("Height of the Cylinder:");
        double height = scanner.nextDouble();

        double volume = Math.PI * Math.pow(radius,2) * height;

        System.out.print("Volume of the Cylinder:" +volume);
        scanner.close();

    }
}