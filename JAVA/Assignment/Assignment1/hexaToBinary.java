public class hexaToBinary {
    public static void main(String[] args) {
        String hexString = "1A"; // Replace with your hex string
        
        // Convert the hex string to a decimal integer
        int decimalNumber = Integer.parseInt(hexString, 16);
        
        // Convert the decimal number to binary
        String binaryString = Integer.toBinaryString(decimalNumber);
        
        System.out.println("Hexadecimal: " + hexString);
        System.out.println("Binary: " + binaryString);
    }
}
