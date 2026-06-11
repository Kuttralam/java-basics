import java.util.Scanner;

public class Day3_VoteEligibilityChecker {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the Voter : ");
        int input = sc.nextInt();
        if(input >= 18) System.out.println("Voter is Eligible to vote.");
        else System.out.println("Voter is not Eligible to vote.");
        sc.close();
    }
}
