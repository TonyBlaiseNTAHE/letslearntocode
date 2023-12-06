package Person;

public class Main {
    public static void main(String[] args) {
        Athlete a = new Athlete("Tony", 25, 70);
        LazyPerson l = new LazyPerson("Mike", "male", 23, 120);
        
        a.exercise();
        l.exercise();
        a.eat();
        l.eat();
    }
}
