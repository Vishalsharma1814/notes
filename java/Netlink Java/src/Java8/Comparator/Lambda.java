package Java8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        List<String> lt = new ArrayList<>();
        lt.add("TATA");
        lt.add("I10");
        lt.add("PUNCH");
        lt.add("I20");
        lt.add("Audi2");
        lt.add("ALTO800");

        Collections.sort(lt, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        }
        );
    }
}
