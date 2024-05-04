package TreeMap;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        ArrayList<String> city1 = new ArrayList<>();
        city1.add("nanjing");
        city1.add("hangzhou");
        city1.add("suzhou");

        ArrayList<String> city2 = new ArrayList<>();
        city2.add("shijiazhuang");
        city2.add("xiaogan");
        city2.add("yichang");

        ArrayList<String> city3 = new ArrayList<>();
        city3.add("tangshan");
        city3.add("baoding");
        city3.add("zhangjiakou");

        hm.put("jiangsu", city1);
        hm.put("hubei", city2);
        hm.put("hebei", city3);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",", "", "");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + "=" + sj);
        }

    }
}
