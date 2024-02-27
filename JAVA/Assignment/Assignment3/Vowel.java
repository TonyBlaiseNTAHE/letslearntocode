import java.util.Scanner;
class Vowel {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the string: ");
      String input = scanner.nextLine();
      int num = getVowel(input);
      System.out.println("the number of vowel in the string is " + num);
    }
    public static int getVowel(String string)
    {
        int count = 0;
        int length = string.length();
        for (int i = 0; i < length; i++)
        {
            char c = Character.toUpperCase(string.charAt(i));
            if (c == 'A' || c == 'E' || c == 'U' || c == 'I' || c == 'O')
            {
                count = count + 1;
            }
        }
        return count;
    }
}