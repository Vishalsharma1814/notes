package OOPS.Q13;

public class A extends Marks{
    float a;
    float b;
    float c;
    A(float a,float b,float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    float getPercentage() {
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        A a = new A(56,89,56);
        System.out.println(a.getPercentage());
    }
}
