package Collections_Stage_1.Q5;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedList;

public class SearchCollectionElement {

    static String months[] = new DateFormatSymbols().getShortMonths();

    static LinkedList<String> strings = new LinkedList<>();

    public static void main(String[] args) {

        for(int i=0;i<months.length-1;i++){
            strings.add(months[i]);
        }
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(Collections.binarySearch(strings,"Sep"));
        System.out.println(Collections.binarySearch(strings,"Monday"));
    }
}
