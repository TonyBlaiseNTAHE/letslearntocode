package BeautySaloon;

import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Customer m = new Customer("Melissa");

        m.setMember(true);
        m.setMemberType("Silver");

        System.out.println(m);

        DiscountRate melissaDiscount = new DiscountRate("Melissa", true, "Silver");

        System.out.println("service discount rate: " +melissaDiscount.getServiceDiscountRate());
        System.out.println("Product discount rate: " +melissaDiscount.getProductDiscountRate());
    }
}
