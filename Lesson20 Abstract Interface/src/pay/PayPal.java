package pay;

public class PayPal implements Payable{
    @Override
    public void processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Sum can't be less than 1. REJECTED\n");
            return;
        }
        System.out.printf("Payment %.2f from PayPal was SUCCESS\n", amount);
    }


    @Override
    public void refoundPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Sum can't be less than 1. REJECTED");
            return;
        }
        System.out.println("Cash back to PayPal. SUCCESS");

    }

}
