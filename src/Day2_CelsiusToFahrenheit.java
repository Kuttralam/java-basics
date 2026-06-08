import java.util.Scanner;

public class Day2_CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease Enter The Temperature in Celsius : ");
        double celsius = sc.nextDouble();
        double fahrenheit =(celsius * 9 / 5) + 32;
        System.out.printf("The Temperature in Fahrenheit : %.2f\n", fahrenheit);
        sc.close();
    }
}
