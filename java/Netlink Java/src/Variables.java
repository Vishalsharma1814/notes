// Write a program for instance variable and access it from instance method. And call it from main method.

public class Variables {

    int a=20; // Instance Variable

    public static void main(String[] args)
    {
        Variables v = new Variables();
        v.inst();

    }
    public void inst() // Instance Method
    {
        System.out.println(a); // 20
    }
}

// Write a program for static variable and access it from static area.

//public class Variables {
//
//    static int a=40; // Static Variable
//
//    public static void main(String[] args)
//    {
//        System.out.println(a); // 40 // Accessing static variable
//
//    }
//}

// Write a program  declared the instance variable with the same name as local variable, and demonstrate the scope of local variables.

//public class Variables {
//
//    int x; // Instance Variable
//
//    public static void main(String[] args)
//    {
//        int x=100; // Local Variable
//        System.out.println(x); // 100
//
//    }
//}

// Create three objects of a class and access this static variable, it would be common for all, the changes made to the variable using one of the object would reflect when you access it through other objects.
//
//public class Variables {
//
//    static int x; // Static Variable
//
//    public static void main(String[] args)
//    {
//        Variables v = new Variables();
//        v.x = 45; // First Object
//        System.out.println("First Object: "+v.x); // 45
//        Variables vt = new Variables();
//        vt.x = 87; // Second Object
//        System.out.println("Second Object: "+vt.x); // 87
//        Variables vp = new Variables();
//        vp.x = 56; // Third Object
//        System.out.println("Third Object: "+vp.x); // 56
//    }
//}

// Create a program where you need to initialize a static variable x is equal to 0 and increment static variable by 1 for each object creation.
//
//public class Variables {
//
//    static int a; // Static Variable
//
//    Variables()
//    {
//        a++;
//        System.out.println(a);
//    }
//
//    public static void main(String[] args)
//    {
//        Variables v = new Variables(); // 1
//        Variables vt = new Variables(); // 2
//        Variables vp = new Variables(); // 3
//        Variables vb = new Variables(); // 4
//        Variables bn = new Variables(); // 5
//    }
//}

// Can we access instance members from static area directly? Elaborate it with program.
// We cannot access instance members from static area directly but by creating objects in the main method we can access instance members.

//public class Variables {
//
//    int s; // Instance Variable
//    public static void main(String[] args)
//    {
//        Variables v = new Variables();
//        System.out.println(v.s); // Accessing instance variables
//        v.inst(); // Accessing instance method
//    }
//    public void inst(){
//        System.out.println("Instance Method !!");
//    }
//}

// Can we access static variables from instance and static methods? Elaborate it with program.

//public class Variables {
//
//    static int p=87; // Static Variable
//    public static void main(String[] args)
//    {
//        Variables v = new Variables();
//        // Accessing static variable using static method
//        Variables.stm();
//        // Accessing static variable using instance method
//        v.inst();
//    }
//    static public void stm()
//    {
//        System.out.println(p); // 87
//    }
//    public void inst(){
//        System.out.println(p); // 87
//    }
//}

// How we can change value of static variable?

//public class Variables {
//
//    static int p; // Static Variable
//    public static void main(String[] args)
//    {
//        Variables.p = 23;
//        System.out.println("Original Value: "+p); // 23
//        Variables.p = 65;
//        System.out.println("Changed Value: "+p); // 65
//    }
//}

// Create a program where you will declare instance variables and will see how to access instance variables from the static and non-static area.
//
//public class Variables {
//    // Instance Variable
//    int t=21;
//    int m=45;
//    String name="Tushar";
//    public static void main(String[] args)
//    {
//        Variables.st(); // Accessing static method
//        Variables v = new Variables();
//        v.ins(); // Accessing instance method
//        // Accessing instance variables from main method
//        System.out.println(v.t); // 21
//        System.out.println(v.m); // 45
//        System.out.println(v.name); // Tushar
//
//    }
//    public static void st(){
//        // Instance variables can't be references from a static context
//        System.out.println(t);
//        System.out.println(m);
//        System.out.println(name);
//    }
//    public void ins(){
//        // Accessing instance variables from instance method
//        System.out.println(t); // 21
//        System.out.println(m); // 45
//        System.out.println(name); // Tushar
//    }
//}

// Write a program where you will create a local variable and access it on you static method.

//public class Variables {
//    public static void main(String[] args)
//    {
//        // Local Variables
//        int age=21;
//        String name = "Tushar";
//        System.out.println("My name is "+name+" "+"and age is "+age);
//
//    }
//
//}

