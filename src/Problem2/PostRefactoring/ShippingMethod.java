package Problem2.PostRefactoring;

public interface ShippingMethod {
    public String name();
    public double cost(double weight);
}

class StandardShipping implements ShippingMethod{
    public String name(){
        return "Standard";
    }
    public double cost(double weightKg){
        return 20 + 5*weightKg;
    }
}

class ExpressShipping implements ShippingMethod{
    public String name(){
        return "Express";
    }
    public double cost(double weightKg){
        return 50 + 8*weightKg;
    }
}

class DroneShipping implements ShippingMethod{
    public String name(){
        return "Drone";
    }
    public double cost(double weightKg){
        if (weightKg > 2) throw new IllegalArgumentException("Too heavy");
        return 80;
    }
}

class Parcel{
    private double weight;

    public Parcel(double weight){
        this.weight = weight;
    }
    public double shippingCost(ShippingMethod methode){
        return methode.cost(weight);
    }
}

class PickupShipping implements ShippingMethod{
    public String name(){
        return "Pickup";
    }
    public double cost(double weightKg){
        if (weightKg < 5){
            return 0.0;
        }
        return 10.0;
    }
}




