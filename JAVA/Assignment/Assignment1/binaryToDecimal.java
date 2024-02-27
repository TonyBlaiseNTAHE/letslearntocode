public class binaryToDecimal {
    public static void main(String[] args) {
        String binaryString = "10110101";
        int decimalNum = Integer.parseInt(binaryString, 2);
        System.out.println("Binary: " + binaryString);
        System.out.println("decimal: " + decimalNum);
    }
}
