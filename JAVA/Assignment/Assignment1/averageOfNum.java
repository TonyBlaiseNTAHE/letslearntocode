/**
 * averageOfNum
 */
public class averageOfNum {

    public static void main(String[] args) {
        int a = 2, b = 4, c =60 , d = 7, e = 10;

        int av = a + b + c  + d + e / 5;
        System.out.println("the average is " +av);
        if (a > av)
        {
            System.out.println("a is the greatest");
        }
        else if(b > av)
        {
            System.out.println("b is the greatest");
        }
        else if(c > av)
        {
            System.out.println("c is the greatest");
        }
        else if (d > av)
        {
            System.out.println("d is the greatest");
        }
        else if (e > av)
        {
            System.out.println("e si the greatest");
        }
        else{
            System.out.println("av is the greatest");
        }
}
}