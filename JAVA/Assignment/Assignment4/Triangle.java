public class Triangle {
    
    private double side1;
    private double side2;
    private double side3;
    
    public void setTriangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // side1 getter
    public double getSide1(){
        return side1;
    }

    public void setSide1(double side1)
    {
        this.side1 = side1;
    }

    public double getSide2(){
        return side2;
    }

    public void setSide2(double side2)
    {
        this.side2 = side2;
    }

    public double getSide3(){
        return side3;
    }

    public void setSide3(double side3)
    {
        this.side3 = side3;
    }
    
    public double perimeter()
    {
        return side1 + side2 + side3;
    }
    public double area()
    {
         return side1 * side2 * side3;
    }
    
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle();

        triangle.setTriangle(4, 2, 5);
        System.out.println("the perimeter is "+ triangle.perimeter());
        System.out.println("the area is " +triangle.area());

    }
}