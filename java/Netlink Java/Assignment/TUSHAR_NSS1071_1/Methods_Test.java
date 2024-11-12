public class Methods_Test {
    public static void main(String[] args)
    {
        Methods_Test mt = new Methods_Test();
        // Calling instance method
        mt.greet();
        mt.show();
        // Calling static method
        Methods_Test.play();
        Methods_Test.display();

    }
    // Instance Method
    public void greet()
    {
        System.out.println("Welcome To Java!!");
    }
    public void show()
    {
        System.out.println("Instance Method");
    }
    // Static Method
    static public void play()
    {
        System.out.println("Playing with Java!!");
    }
    static public void display()
    {
        System.out.println("Static Method");
    }

}
