package Lectures;

public class Area {
    double length;
    double breath;


    public void setDim(double length, double breath){
        this.breath = breath;
        this.length = length;
    }
    public void getArea()
    {
        double area = length * breath;
        System.out.println("the area is " + area);
    }
}
