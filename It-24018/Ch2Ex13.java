import java.util.Scanner;
public class Ch2Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double amount = input.nextDouble();
        double rate = 0.00417;
        double value = amount * (1 + rate);
        value = (amount + value) * (1 + rate);
        value = (amount + value) * (1 + rate);
        value = (amount + value) * (1 + rate);
        value = (amount + value) * (1 + rate);
        value = (amount + value) * (1 + rate);
        System.out.printf("After the sixth month, the account value is $%.2f", value);
    }
}
