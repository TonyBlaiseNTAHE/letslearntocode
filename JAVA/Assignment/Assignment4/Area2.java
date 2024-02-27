import java.util.Scanner;
public class Area2 {
    private double length;
    private double breadth;

    public void setArea(double length, double breadth)
    {
        this.breadth = breadth;
        this.length = length;
    }

    // length getter
    public double getLength(){
        return length;
    }
    // width setter
    public void setLength(double length){
        this.length = length;
    }
    // width getter
    public double getBreath(){
        return breadth;
    }
    // breath setter
    public void setBreath(double breadth){
        this.breadth = breadth;
    }
    public double returnArea(){
        return length * breadth;
    }

    public static void main(String[] args) {
        Area2 area = new Area2();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the breadth: ");
        double breadth = Double.parseDouble(scanner.nextLine());

        area.breadth = breadth;
        area.length = length;

        System.out.println("The area is "+area.returnArea());
    }
}