package pay;

public interface Payable {

    void processPayment(double amount);
    void refoundPayment(double amount);

    void printReceipt();
    //System.out.println("Чек распечатан");
}
