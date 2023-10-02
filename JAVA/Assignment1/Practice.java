public class Practice {
    public static void main(String[] args) {
       double a = 1090;
       double b = 356;
       double average;

       average = (a + b) / 2;
       System.out.println(average); // Uncomment this line

       if (average < a)
       {
        System.out.println("The first number is small");
       }
       else{
        System.out.println("The average is not less than a");
       }
    }
}