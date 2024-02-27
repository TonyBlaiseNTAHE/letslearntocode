public class Rectangle {
    
    private double width;
    private double height;

    // construtor
    public void setRectangle(double width, double height)
    {
        this.height = height;
        this.width = width;
    }

    // width getter
    public double getWidth()
    {
        return width;
    } 
    // width setter
    public void setWidth(double width){
        this.width = width;
    }
    // height getter
    public double getheight()
    {
        return width;
    } 
    // width setter
    public void setHeight(double height){
        this.height = height;
    }

    public double are(){
        return width * height;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.height = 5;
        r.width = 4;
        System.out.println("the area of the first rectangle is "+r.are());
        
        Rectangle r2 = new Rectangle();
        r2.height = 8;
        r2.width=  5;
        
        System.out.println("The area of the second rectangle is "+r2.are());
    }

}
