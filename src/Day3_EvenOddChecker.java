import java.util.Scanner;

public class Day3_EvenOddChecker {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input : ");
        int input = sc.nextInt();
        if(input % 2 == 0) System.out.println(input + " is Even");
        else System.out.println(input + " is Odd");
        sc.close();
    }
}
