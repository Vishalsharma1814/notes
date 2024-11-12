package OOPS.Q12;

public class BankC extends Bank{

    @Override
    void getBalance() {
        System.out.println("$300");
    }

    public static void main(String[] args) {
        BankC c = new BankC();
        c.getBalance();
    }
}
