package Person;

public class LazyPerson extends Person{
    private String name;
    private double weight;
    private int age;
    private String gender;

    public LazyPerson(String name, String gender, int age, double weight)
    {
        this.age = age; 
        this.gender = gender;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    @Override
    public void eat() {
        System.out.println("eat unhealthy");
    }

    @Override
    public void exercise() {
        System.out.println("workout once a month");
    }
}