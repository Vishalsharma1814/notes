package OOPS.Q14;

abstract class Abstract {
    Abstract(){
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void non_abstract(){
        System.out.println("This is normal method of abstract class");
    }
}
