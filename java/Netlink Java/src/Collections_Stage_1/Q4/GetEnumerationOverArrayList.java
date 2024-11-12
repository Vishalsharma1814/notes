package Collections_Stage_1.Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class GetEnumerationOverArrayList {

    public static ArrayList integers = new ArrayList<>();

    public static void get_data(){
        integers.add(45);
        integers.add(88);
        integers.add(44);
        integers.add(67);
        integers.add(76);
        integers.add(45);
        integers.add(56);
    }

    public static void main(String[] args) {

        GetEnumerationOverArrayList.get_data();

        Enumeration integerEnumeration = Collections.enumeration(integers);

        while(integerEnumeration.hasMoreElements()){
            System.out.println(integerEnumeration.nextElement());
        }
    }


}
