package BeautySaloon;

public class Customer {
    protected String name;

    protected Boolean member = false;
    protected String memberType;

    public Customer(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Boolean isMember(){
        return member;
    }
    public void setMember(Boolean member) {
        this.member = member;
    }
    public String getMemberType(){
        return memberType;
    } 
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String toString(){
        return "Hi, I am " +name + " my membership is " +getMemberType();
    }   
    
}
