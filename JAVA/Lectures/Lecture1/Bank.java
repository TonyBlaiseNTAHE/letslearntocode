package Lectures;
public class Bank {
    double deposit;
    double withdraw = 0;
    double balance = 0;

    public void cashDeposit(double deposit)
    {
        this.deposit = deposit;
        System.out.println("your deposit is " +deposit);
    }
    public void getBalance(double balance)
    {
            balance = balance  + deposit;
        System.out.println("your balance is " +balance);
    }

    public void cashWithdraw(double withdraw)
    {
        this.withdraw = withdraw;
    
    }
    public void getLoan()
    {
        if (deposit > 100000 && balance > 100000)
        {
            double loan = balance * 10;
            System.out.println("you can apply for a loan of "+ loan);
        }
        else
        {
            System.out.println("you can not get a loan because your balance and deposit are still low");
        }
    }


}