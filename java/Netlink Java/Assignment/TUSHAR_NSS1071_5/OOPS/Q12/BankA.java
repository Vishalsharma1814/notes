package OOPS.Q12;

public class BankA extends Bank{

    @Override
    void getBalance() {
        System.out.println("$100");
    }

    public static void main(String[] args) {
        BankA a = new BankA();
        a.getBalance();
    }
}
