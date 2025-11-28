import java.util.Scanner;
public class Ch2Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double m = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initial = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalT = input.nextDouble();
        double Q = m * (finalT - initial) * 4184;
        System.out.println("The energy needed is " + Q);
    }
}
