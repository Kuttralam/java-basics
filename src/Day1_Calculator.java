import java.util.*;

public class Day1_Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number 1");
        double a = sc.nextDouble();
        System.out.println("Please Enter number 2");
        double b = sc.nextDouble();

        System.out.println("\n--- Calculator Results ---");
        System.out.println("Addition : "+(a+b));
        System.out.println("Subtract : "+(a-b));
        System.out.println("Multiply : "+(a*b));
        System.out.println("Divide : "+(a/b));
        System.out.println("Modulo : "+(a/b));
    }
}
