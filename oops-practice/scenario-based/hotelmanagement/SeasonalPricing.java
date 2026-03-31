package hotelmanagement;

public class SeasonalPricing  implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 1.5;
    }
}   
    


