package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {

        Map<String, String> m = new HashMap<>();
        m.put("apple","1");
        m.put("4070ti","2");
        m.put("4090","3");

        Set<String> keys = m.keySet();
        System.out.println(keys);
//        1
        System.out.println("---------key + for----------");
        for (String key : keys) {
            System.out.println(key);
            System.out.println(m.get(key));
        }
//        2
        System.out.println("---------key+iterator----------");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }
//        3
        System.out.println("---------key+lambda----------");
        keys.forEach((String key) -> {
            String value = m.get(key);
            System.out.println(key + "=" + value);
        })  ;
//        4
        System.out.println("---------entries----------");
        Set<Map.Entry<String, String>> entries = m.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
//        5
        System.out.println("---------entries + iterator----------");
        Iterator<Map.Entry<String, String>> it1 = entries.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
//        6
        System.out.println("---------entries + lambda----------");
        m.forEach((String key, String value) -> {
            System.out.println(key + "=" + value);
        });
    }
}
