package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();

        coll.add("asd");
        coll.add("312");
        coll.add("3sds");
        System.out.println(coll);

        coll.remove("3sds");
        System.out.println(coll);

        System.out.println(coll.isEmpty());
    }
}
