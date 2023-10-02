public class AmericanFlag {
    public static void main(String[] args) {
        int numRows = 13; // Total number of rows in the flag
        
        // Loop through each row
        for (int i = 0; i < numRows; i++) {
            // Determine the number of stars and stripes in this row
            int numStars = (i % 2 == 0) ? 6 : 5; // 6 stars in even rows, 5 in odd rows
            int numStripes = 13; // Total number of stripes
            
            // Print stars and stripes for this row
            for (int j = 0; j < numStars; j++) {
                System.out.print("* ");
            }
            for (int k = 0; k < numStripes; k++) {
                System.out.print("-");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}