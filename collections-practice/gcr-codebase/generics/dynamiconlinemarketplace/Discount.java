package dynamiconlinemarketplace;

public class Discount{

    public static <T extends Product<?>> void applyDiscount(T product, double discountPercentage){
 

        double newPrice = product.getPrice() - (product.getPrice() * discountPercentage / 100);
        product.setPrice(newPrice);
        System.out.println("Discount percentage "+discountPercentage);
    }

    }
