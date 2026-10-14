package Problem2.PostRefactoring;
import java.util.ArrayList;
import java.util.List;

public class Test {
   public static void main(String[] argv){
       List<ShippingMethod> l = new ArrayList<>();

       ExpressShipping express = new ExpressShipping();
       PickupShipping pickUp = new PickupShipping();
       StandardShipping standard = new StandardShipping();
       DroneShipping drone = new DroneShipping();

       l.add(express);
       l.add(pickUp);
       l.add(drone);
       l.add(standard);

       Parcel p = new Parcel(2);

       for (ShippingMethod sM : l){
            System.out.println(sM.name() + ": " + p.shippingCost(sM) + " MAD");
       }
   }

}
