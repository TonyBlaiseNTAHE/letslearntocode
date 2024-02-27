package Person;

public class Athlete extends Person{
    private String name;
    private int age;
    private double weight;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Athlete(String name, int age, double weight)
    {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("eat heathly");
    }

    @Override
    public void exercise() {
        System.out.println("Workout everyday");
    }
}
