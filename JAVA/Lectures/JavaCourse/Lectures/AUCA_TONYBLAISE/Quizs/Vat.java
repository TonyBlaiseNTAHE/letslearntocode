package AUCA_TONYBLAISE.Quizs;

import java.util.Scanner;
public class Vat {
    public static void main(String[] args) {
        getVat();
    }

    public static void getVat()
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the pieces: ");
        String input = Scanner.nextLine();
        int pieces = Integer.parseInt(input);

        System.out.print("Enter the price: ");
        String s = Scanner.nextLine();
        int price = Integer.parseInt(s);

        if (pieces >= 100)
        {
            int total_amout = pieces * price;
            int vat = (18 * total_amout) / 100;
            System.out.println("the vat is "  +vat);
            System.out.println("the total amout is " +total_amout);
        }
        else{
            System.out.println("The pieces are less than 100");
        }

    }
}
