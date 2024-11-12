package OOPS.Q13;

public class B extends Marks{
    float a;
    float b;
    float c;
    float d;
    B(float a,float b,float c,float d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    float getPercentage() {
        return (a+b+c+d)/4;
    }

    public static void main(String[] args) {
        B b = new B(45,67,78,98);
        System.out.println(b.getPercentage());
    }
}
