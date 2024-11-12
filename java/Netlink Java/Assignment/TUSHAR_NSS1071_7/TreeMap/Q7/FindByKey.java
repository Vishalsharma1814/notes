package TreeMap.Q7;

import java.util.Comparator;

public class FindByKey implements Comparator<Keys> {




    @Override
    public int compare(Keys o1, Keys o2) {
        return o1.getKey() - o2.getKey();
    }
}
