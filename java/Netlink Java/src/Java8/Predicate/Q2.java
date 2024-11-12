package Java8.Predicate;

import java.util.function.Predicate;

public class Q2 {

    static int x[] = {45,20,66,10,80,48,23};
    public static void predicate(Predicate<Integer> predicate, int[] x){
        for(Integer i:x){
            if(predicate.test(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Predicate<Integer> p1 = x -> (x>10);
        Predicate<Integer> p2 = x -> (x%2==0);

        System.out.println("Numbers greater than 10........");
        predicate(p1,x);
        System.out.println("Numbers divisible by 2.........");
        predicate(p2,x);
        System.out.println("Negate Operation.........");
        predicate(p1.negate(),x);
        System.out.println("AND Operation.........");
        predicate(p1.and(p2),x);
        System.out.println("OR Operation.........");
        predicate(p1.or(p2),x);

    }
}
