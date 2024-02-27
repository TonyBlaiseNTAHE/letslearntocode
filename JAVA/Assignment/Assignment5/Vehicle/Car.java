package Vehicle;

public class Car extends Vehicle{
    private String make;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Car(String make){
        this.make = make;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine Start...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine Stop...");
    }
}