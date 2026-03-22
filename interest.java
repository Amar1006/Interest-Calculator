import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Interest Rate Calculator");
        System.out.println("1. Simple Interest (compute rate from principal, time, and simple interest amount)");
        System.out.println("2. Compound Interest (compute annual rate from principal, time, and final amount)");
        System.out.println("3. Compound Amount (compute final amount from principal, rate, time, and compounding frequency)");
        System.out.print("Choose option (1, 2 or 3): ");

        int option = 0;
        try {
            option = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid option.");
            sc.close();
            return;
        }

        switch (option) {
            case 1:
                computeSimpleInterestRate(sc);
                break;
            case 2:
                computeCompoundInterestRate(sc);
                break;
            case 3:
                computeCompoundFinalAmount(sc);
                break;
            default:
                System.out.println("Invalid option.");
        }

        sc.close();
    }

    private static void computeSimpleInterestRate(Scanner sc) {
        try {
            System.out.print("Enter principal amount (P): ");
            double p = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter time in years (T): ");
            double t = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter simple interest amount (SI): ");
            double si = Double.parseDouble(sc.nextLine().trim());

            if (p <= 0 || t <= 0) {
                System.out.println("Principal and time must be greater than zero.");
                return;
            }

            double r = (si * 100.0) / (p * t);
            System.out.printf("Computed simple interest rate: %.4f%% per annum\n", r);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        }
    }

    private static void computeCompoundInterestRate(Scanner sc) {
        try {
            System.out.print("Enter principal amount (P): ");
            double p = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter time in years (T): ");
            double t = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter final amount (A): ");
            double a = Double.parseDouble(sc.nextLine().trim());

            if (p <= 0 || t <= 0) {
                System.out.println("Principal and time must be greater than zero.");
                return;
            }
            if (a <= p) {
                System.out.println("Final amount must be greater than principal for positive interest rate.");
                return;
            }

            // A = P * (1 + r/100)^t  =>  r = 100 * ( (A/P)^(1/t) - 1 )
            double rate = 100.0 * (Math.pow(a / p, 1.0 / t) - 1.0);
            System.out.printf("Computed compound interest annual rate: %.4f%%\n", rate);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        }
    }

    // New: compute final compound amount given P, annual rate r (percent), time t (years), and compounding frequency n
    private static void computeCompoundFinalAmount(Scanner sc) {
        try {
            System.out.print("Enter principal amount (P): ");
            double p = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter annual interest rate (r) in percent: ");
            double r = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter time in years (T): ");
            double t = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter compounding periods per year (n), e.g. 12 for monthly: ");
            int n = Integer.parseInt(sc.nextLine().trim());

            if (p <= 0 || t <= 0 || n <= 0) {
                System.out.println("Principal, time, and compounding frequency must be greater than zero.");
                return;
            }

            double amount = p * Math.pow(1.0 + (r / 100.0) / n, n * t);
            System.out.printf("Final amount after %.2f years with %d compounding(s) per year: %.4f\n", t, n, amount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        }
    }
}
