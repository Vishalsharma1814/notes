package OOPS.Q6;

public class Triangle {
    int a;
    int b;
    int c;
    Triangle(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Perimeter(){
        System.out.println("Perimeter of triangle: "+(a+b+c));
    }

    public static void main(String[] args) {
        Triangle tt = new Triangle(3,4,5);
        tt.Perimeter();
    }
}
