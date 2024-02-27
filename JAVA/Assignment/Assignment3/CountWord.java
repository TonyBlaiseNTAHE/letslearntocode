public class CountWord {
    public static void main(String[] args) {
        String c = "borah";
        int count = getLength(c);

        System.out.println("the lenght of the string is " + count);

    }
    public static int getLength(String string)
    {
        int len = string.length();

        return len;
    }
}
