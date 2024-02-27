public class compare2 {
    public static void main(String[] args) {
        int mark1 = 40;
        int mark2 = 55;
        int total = mark1 + mark2;

        if (total > 90)
        {
            System.out.println("The student is excellent");
        }
        else if (total > 80 && total < 90 ){
            System.out.println("Very good");
        }
        else if (total > 50 && total < 80)
        {
            System.out.println("Pass");
        }
        else{
            System.out.println("Failed");
        }
    }

}
