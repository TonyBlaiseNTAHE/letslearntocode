package BeautySaloon;

import java.sql.Date;

public class Visit extends Customer{
    
    private double serviceExpense;
    private double productExpense;
    public Date date;

    public Visit(String name, Date date) {
        super(name);
        this.date = date;
    }
    public String getName(){
        return super.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        return serviceExpense + productExpense;
    }

    public String toString()
    {
        return "Hi, I am " +name + ", the total expense is " + getTotalExpense();
    }
}

