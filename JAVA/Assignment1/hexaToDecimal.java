public class hexaToDecimal {
    public static void main(String[] args) {
        String hexString = "1A";
        int decimalNum = Integer.parseInt(hexString, 16);
        System.out.println("Hexadecimal: " + hexString);
        System.out.println("Decimal: " + decimalNum);
    }
}
