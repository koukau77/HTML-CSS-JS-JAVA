package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("fa");
        list.add("asd");

//        list.add(1,"rew");
//        System.out.println(list);
//
//        list.remove(1);
//        System.out.println(list);
//
//        Integer i = Integer.valueOf(1);
//        list.remove(i);
//        System.out.println(list);
//
//        list.set(0, "lll");
//        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        for (String s : list){
            System.out.println(s);
        }

        list.forEach(s -> System.out.println(s));

        ListIterator<String> it1 = list.listIterator();

        while (it1.hasNext()){
            String s = it1.next();
            System.out.println(s);
            if ("1".equals(s)){
                it1.add("eee");
            }
        }
        System.out.println(list);
    }
}
