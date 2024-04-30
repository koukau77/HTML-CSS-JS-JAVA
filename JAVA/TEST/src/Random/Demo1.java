package Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list ,"4060", "4070", "4080", "4090", "4070ti");

        Random r = new Random();
        int index = r.nextInt(list.size());
        String s = list.get(index);
        System.out.println(s);

        Collections.shuffle(list);
        String s1 = list.get(0);
        System.out.println(s1);
    }
}
