package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class IterateThough {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        list.add("!23");list.add("213");list.add("dfg");


//        1 Iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
//            it.remove();
        }
        System.out.println(list);

        // 2 for
        for (String s : list){
            System.out.println(s);
            s = "111";
        }
        System.out.println(list);

        // 3 lambda

        list.forEach((String s) -> {
                System.out.println(s);
        });
        // ?
        list.forEach(s -> System.out.println(s));


    }
}
