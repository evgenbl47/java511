package pay;

public class PayPal implements Payable{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment to card 1111-2222-3333-4444 is done");
    }

    @Override
    public void refoundPayment(double amount) {
    }

    @Override
    public void printReceipt() {

    }
}
