package Polymorphism.Q9;

public class Main {

    public static void main(String[] args) {
        Automatic am = new Automatic();
        am.g1('d'); // Auto promotion
        am.g1(76.45); // Double exact method
        am.g1(45); // Integer exact method
        am.g1(24876224); // Long exact method
    }
}
