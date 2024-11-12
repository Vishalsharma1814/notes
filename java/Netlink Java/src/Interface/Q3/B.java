package Interface.Q3;

public class B extends A{

    public void d(){
        System.out.println("D");
    }

    public void f(){
        System.out.println("F");
    }

    public void x(){
        System.out.println("X");
    }

    public void y(){
        System.out.println("Y");
    }

    public static void main(String[] args) {
        B bb = new B();
        bb.d();
        bb.f();
        bb.x();
        bb.y();

    }
}
