package domain;

public class Student {
    public int id; 
    public String firstName;
    public String lastName;

    public Student(int id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(int id){ 
        this.id = id;
    }
    public int getId(int id) { 
        
        return this.id;
    }
    public void setLastName(String lastName){ 
        this.lastName = lastName;
    }
    public String getLastName() { 
        return this.lastName;
    }
    public void setFirstname(String firstname){ 
        this.firstName = firstname;
    }
    public String getFirstName(String firstname) { 
        return this.firstName;
    }
}