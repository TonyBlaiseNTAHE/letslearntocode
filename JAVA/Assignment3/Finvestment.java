import java.util.Scanner;
public class Finvestment {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the invertment: ");
        String inpuString = scanner.nextLine();
        int pv = Integer.parseInt(inpuString);

        System.out.println("Enter the interest rate: ");
        String rateString = scanner.nextLine();
        double rate = Integer.parseInt(rateString);

        System.out.println("Enter the invertment: ");
        String nuString = scanner.nextLine();
        int n = Integer.parseInt(nuString);
        int result = getFinvest(pv, rate, n);

    }
    public static int getFinvest(int pv, double rate, int n)
    {
        int fv;

        fv  = 

    }
}
