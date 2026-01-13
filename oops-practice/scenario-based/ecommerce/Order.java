package ecommerce;

public class Order {

    private int orderId;
    private Product product;
    private String status;
    public Order(int orderId, Product product){
        this.orderId=orderId;
        this.product=product;
        this.status="placed";

    }

    public void cancelOrder(){
        status="cancelled";
        System.out.println("the order has been cancelled ");
    }

    public void trackOrder(){
        System.out.println("the order has been "+status);
    }

    public double getAmount(){
        return product.getPrice();
    }
    
}
