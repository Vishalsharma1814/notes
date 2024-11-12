package Collections_Stage_1.Q3;

import java.util.ArrayList;
import java.util.Vector;

public class Q3 {

    public static ArrayList<String> arrayList = new ArrayList<>();
    public static Vector<String> stringVector = new Vector<>();

    public static void get_list_data(){
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("C");
        arrayList.add("Machine Learning");
        arrayList.add("Advanced Java");
    }

    public static void get_vector_data(){
        stringVector.add("Tushar");
        stringVector.add("Harshit");
        stringVector.add("Mahesh");
        stringVector.add("Mohan");
        stringVector.add("Komal");
        stringVector.add("Lalit");

    }

    public static void main(String[] args) {

        Q3.get_list_data();
        Q3.get_vector_data();
        arrayList.addAll(1,stringVector);

        for(String s:arrayList){
            System.out.println(s);
        }

    }
}
