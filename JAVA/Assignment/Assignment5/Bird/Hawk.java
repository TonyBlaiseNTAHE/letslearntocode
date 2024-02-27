package Bird;

public class Hawk extends Bird{
    
    private String color;

    public Hawk(String color)
    {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void fly() {
        System.out.println("flies short distance");
    }

    @Override
    public void makeSound() {
        System.out.println("ouououououohhh");
    }
} 