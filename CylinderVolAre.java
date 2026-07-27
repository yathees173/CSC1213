import java.util.Scanner;

public class CylinderVolAre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of cylinder: ");
        double radius = input.nextDouble();

        System.out.println("Enter length of cylinder: ");
        double length = input.nextDouble();

        final double PI = 3.14159;

        double area = PI * radius * radius;

        double volume = area * length;

        System.out.println("Area of cylinder: "+ area);
        System.out.println("Volume of cylinder: "+ volume);

        
    }
}