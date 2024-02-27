public class converter {
    public static void main(String[] args) {
        int decimalNumber = 12;

        String oString = Integer.toOctalString(decimalNumber);
        String heString = Integer.toHexString(decimalNumber);
        String bString = Integer.toBinaryString(decimalNumber);
        System.out.println("Decimal number is "+ decimalNumber);
        System.out.println("Binary number is " + bString);
        System.out.println("Hexa number is " + heString);
        System.out.println("octo number is " + oString);
        
        String binaString = "0001010110";
        int decimal = Integer.parseInt(binaString, 2);
        System.out.println("decimal number from binary is " + decimal);
        String hexString = "1AB";
        decimal = Integer.parseInt(hexString, 16);
        System.out.println("decimal number from binary is " + decimal);

    }
}

