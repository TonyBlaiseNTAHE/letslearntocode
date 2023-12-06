package BeautySaloon;

public class DiscountRate extends Customer {
    
    public DiscountRate(String name, Boolean member, String memberType) {
        super(name);
        setMember(member);
        setMemberType(memberType);
    }
    public double serviceDiscountPremium = 0.2;
    public double serviceDiscountGold = 0.15;
    public double serviceDiscountSilver = 0.1;
    public double productDiscountPremium = 0.1;
    public double productDiscountGold = 0.1;
    public double productDiscountSilver = 0.1;

    public double getServiceDiscountRate()
    {
        if ("Premium".equals(memberType))
        {
            return serviceDiscountPremium;
        }
        else if ("Gold".equals(memberType))
        {
            return serviceDiscountGold;
        }
        else if ("Silver".equals(memberType))
        {
            return serviceDiscountSilver;
        }

        else{
            return 0.0;
        }
            
    }
    public double getProductDiscountRate(){
        if ("Premium".equals(memberType))
        {
            return productDiscountPremium;
        }
        else if ("Gold".equals(memberType))
        {
            return productDiscountGold;
        }
        else if ("Silver".equals(memberType))
        {
            return productDiscountSilver;
        }
        else{
            return 0.0;
        }
    }
}
