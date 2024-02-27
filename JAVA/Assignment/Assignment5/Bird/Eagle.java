package Bird;

public class Eagle extends Bird{
    private String color;
    
    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }



    public Eagle(String color)
    {
        this.color = color;
    }

    

    @Override
    public void fly() {
        System.out.println("flies long distance");
    }

    @Override
    public void makeSound() {
        System.out.println("iiihihihiihihihih");
    }
}
