package Project_01_InvestmentEarnings;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StockGain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the buying price per share: ");
        double buyingPrice = scanner.nextDouble();
        System.out.println("Enter the number of shares: ");
        int shares = scanner.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        while (true) {
            int day = 1;
            System.out.println("Day-" + day + " : Enter the closing price per share: ");
            double closingPrice = scanner.nextDouble();
            if (closingPrice <= 0.00) {
                System.out.println("Bad Luck!!!!!!!!!!");
                System.out.println("In day " + day + "your investment turned into 0.");
                break;
            }
            double gain = (closingPrice - buyingPrice) * shares;

            if (gain < 0) {
                System.out.println("After day " + day + " your loss is : " + decimalFormat.format(gain / shares));
                System.out.println("Total loss  : " + decimalFormat.format(gain));
            } else if (gain > 0) {
                System.out.println("After day " + day + " the stock gain is: " + decimalFormat.format(gain));
                System.out.println("Total earning  : " + decimalFormat.format(gain));
            } else
                System.out.println("After day " + day + " you have no earning.");
            System.out.println();
            day++;
        }

    }
}
