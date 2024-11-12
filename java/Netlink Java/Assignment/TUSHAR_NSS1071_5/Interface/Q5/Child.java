package Interface.Q5;

public class Child extends Student{

    public static void main(String[] args) {
        Child c = new Child();
        c.setStdId(100);
        System.out.println(c.getStdId());
        c.setStdRollNo(12);
        System.out.println(c.getStdRollNo());
        c.setStdName("Tushar Srivastava");
        System.out.println(c.getStdName());
    }
}