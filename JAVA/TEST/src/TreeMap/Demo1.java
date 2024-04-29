package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo1 {
    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        tm.put(1, "4060");
        tm.put(2, "4070");
        tm.put(3, "4080");
        tm.put(4, "4090");
        tm.put(5, "4090D");

        System.out.println(tm);
    }
}
