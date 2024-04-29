package Map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {

        Map<String, String> m = new HashMap<>();

        m.put("dsa", "da0");
        m.put("213", "da1");
        m.put("sadf", "da2");
        String value = m.put("213", "da4");
        System.out.println(m);
        System.out.println(value);
        m.remove("213");
        System.out.println(m);

        m.clear();

    }
}
