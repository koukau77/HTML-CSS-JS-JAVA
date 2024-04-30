package TreeMap;

import java.util.TreeMap;

public class Demo2 {

    public static void main(String[] args) {

        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("zhangsan", 32);
        Student s2 = new Student("lisi", 12);
        Student s3 = new Student("wangwu", 35);

        tm.put(s1, "jiangsu");
        tm.put(s2, "hainan");
        tm.put(s3, "zhejiang");

        System.out.println(tm);

    }
}
