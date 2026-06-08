import java.util.Scanner;

public class Day2_AreaOfCircle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease Enter the Radius Of Circle : ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("The Area of Circle : %.2f\n", area);
        sc.close();
    }
}
