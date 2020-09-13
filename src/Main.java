import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj proszę wysokość Twoich rocznych zarobków");
        Scanner scanner = new Scanner(System.in);
        double incomeLevel = scanner.nextDouble();
        double calculatedTax = 0;
        if (incomeLevel < 85529){
            calculatedTax = (incomeLevel * 0.18) - 556.02;
        } else if (incomeLevel > 85528){
            calculatedTax = 14839.02 + 0.32*(incomeLevel - 85528);
        }
        System.out.println("Twój podatek to: " + calculatedTax);
    }
}
