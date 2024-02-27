import java.util.Scanner;

class Area {

    private double length;
    private double breadth;

    // method to set dimensions
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate and return area
    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area area = new Area();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the breadth: ");
        double breadth = Double.parseDouble(scanner.nextLine());

        area.setDim(length, breadth);
        System.out.println("Area: " + area.getArea());
    }
}
