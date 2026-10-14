package Problem2.PreRefactoring;

public class ShippingCalculator {
    public double cost(String carrier, double weightKg) {
        if (carrier.equals("STANDARD")) {
            return 20 + 5 * weightKg;
        } else if (carrier.equals("EXPRESS")) {
            return 50 + 8 * weightKg;
        } else if (carrier.equals("DRONE")) {
            if (weightKg > 2) throw new IllegalArgumentException("Too heavy");
            return 80;
        }
        throw new IllegalArgumentException("Unknown carrier: " + carrier);
    }
}
