public class Students {
    private String name;
    private int roll_no;
    private int phone_num;
    private String address;

    public void setStudent(String name, int roll_no, int phone_num, String address)
    {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_num = phone_num;
        this.address = address; 
    }
    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students();

        student1.setStudent("Sam", 23, 123435, "Kimironko-234");
        student2.setStudent("John", 22, 1234322, "Kabeza-012");

        System.out.println("The first student is "+student1.name+"! His roll number is "+student1.roll_no+" and he lives "+ student1.address +". and his phone number is "+student1.phone_num); 
        System.out.println("The Second student is "+student2.name+"! His roll number is "+student2.roll_no+" and he lives "+student2.address+". and his phone number is "+student2.phone_num);  
    }
}
