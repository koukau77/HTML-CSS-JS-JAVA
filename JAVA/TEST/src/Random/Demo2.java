package Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);

        Collections.shuffle(list);
        System.out.println(list);


        Random r = new Random();
        int index = r.nextInt(list.size());
        Integer i = list.get(index);
        System.out.println(i);

        // boys
        ArrayList<String> boysList = new ArrayList<>();
        // girls
        ArrayList<String> girlsList = new ArrayList<>();

        Collections.addAll(boysList, "4060", "4070", "4080", "4090", "4070ti");
        Collections.addAll(girlsList, "guci", "naike", "dio", "dsa", "erd");

        if (i == 1){
            int boyIndex = r.nextInt(boysList.size());
            String bn = boysList.get(boyIndex);
            System.out.println(bn);
        }else {
            int girlIndex = r.nextInt(girlsList.size());
            String gn = girlsList.get(girlIndex);
            System.out.println(gn);
        }
    }
}
