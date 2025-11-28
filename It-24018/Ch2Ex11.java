import java.util.Scanner;
public class Ch2Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int secondsInYear = 365 * 24 * 60 * 60;

        int births = secondsInYear / 7;
        int deaths = secondsInYear / 13;
        int immigrants = secondsInYear / 45;

        int population = 312032486 + (births - deaths + immigrants) * years;

        System.out.println("The population in " + years + " years is " + population);
    }
}
