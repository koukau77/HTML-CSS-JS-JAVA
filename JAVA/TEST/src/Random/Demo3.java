package Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "4060", "4070", "4080", "4090", "4070ti");
        Random r = new Random();
        while (! list.isEmpty()){
            int Index = r.nextInt(list.size());
            String s = list.remove(Index);
            System.out.println(s);
        }

    }
}
