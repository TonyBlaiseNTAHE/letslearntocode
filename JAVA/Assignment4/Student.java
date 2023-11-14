public class Student {
 
    private String name;
    private int roll_no;

    public void set(String name, int roll_no)
    {
        this.name = name;
        this.roll_no = roll_no;
    }
    public static void main(String[] args) {
        Student student = new Student();

        student.set("tony", 23379);
        System.out.println("The Student is " + student.name +" and his roll number is "+student.roll_no);
    }
}
