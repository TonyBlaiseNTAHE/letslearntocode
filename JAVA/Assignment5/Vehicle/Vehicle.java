package Vehicle;

import java.sql.Date;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected Date year;

    public abstract void startEngine();
    public abstract void stopEngine();
}
