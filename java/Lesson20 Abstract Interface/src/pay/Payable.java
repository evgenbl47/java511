package pay;

public interface Payable {

    void processPayment(double amount);
    void refoundPayment(double amount);

    default void printReceipt(){
        System.out.println("Чек распечатан");
    }


}
