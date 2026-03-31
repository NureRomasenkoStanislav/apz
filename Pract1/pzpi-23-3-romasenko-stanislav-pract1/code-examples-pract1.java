public interface PaymentStrategy {
    void pay(int amount);
}

public class CreditCardStrategy implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " грн за допомогою Credit Card.");
    }
}

public class PayPalStrategy implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Оплачено " + amount + " грн за допомогою PayPal.");
    }
}

public class ShoppingCart {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int amount) {
        strategy.pay(amount);
    }
}
