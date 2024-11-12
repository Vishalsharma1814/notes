package Collections_Stage_1.Q1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q1 {

    static String[] str = {"Apple", "Mango", "Guava", "Pineapple", "Grapes"};

    static List<String> stringList = Arrays.asList(str);



    public static void main(String[] args) {
        Iterator<String> it = stringList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


}
