package ecommerce;
public interface Payment{
    void pay(double amount) throws PaymentFailedException;
}