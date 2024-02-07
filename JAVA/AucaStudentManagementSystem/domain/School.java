package domain;
public class School {
    public int id; 
    public String schoolName;
    public String location;


    public School(int id, String schoolName, String location) {
        this.id = id;
        this.schoolName = schoolName;
        this.location = location;
    }

    public void setId(int id) { 
        this.id = id;
    }
    public int getId(int id) {
        return this.id;
        
    }
    public void setSchoolName(String schoolName) { 
        this.schoolName = schoolName;
    }
    public String getSchoolName(String schoolName) {
        return this.schoolName;
        
    }
    public void setLocation(String location) { 
        this.location = location;
    }
    public String getLocation(String location) {
        return this.location;
        
    }

}
