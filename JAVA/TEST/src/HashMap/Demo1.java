package HashMap;

import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {

        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("john0", 32);
        Student s2 = new Student("john1", 42);
        Student s3 = new Student("john2", 11);
        Student s4 = new Student("john3", 24);

        hm.put(s1, "shanghai");
        hm.put(s2, "xinjiang");
        hm.put(s3, "hainan");
        hm.put(s4, "jiangsu");

        hm.forEach((Student s, String area) -> {
            System.out.println(s + "=" + area);
        });
    }
}
