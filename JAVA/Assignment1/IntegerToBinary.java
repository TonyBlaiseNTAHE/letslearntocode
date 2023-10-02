public class IntegerToBinary {
    public static void main(String[] args) {
        int decimalNum = 42;

        String binaryString = Integer.toBinaryString(decimalNum);
        System.out.println("Decimal: " + decimalNum);
        System.out.println("Binary: " + binaryString);
    }
}
