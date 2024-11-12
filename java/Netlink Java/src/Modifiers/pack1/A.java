package Modifiers.pack1;

class A {

    public void fun(){
        System.out.println("Instance Method for A");
    }

    public static void main(String[] args) {
        A a = new A();
        a.fun();
    }
}
