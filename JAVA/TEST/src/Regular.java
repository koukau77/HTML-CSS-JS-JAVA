public class Regular {
    public static void main(String[] args) {
//        //1
//        System.out.println("a".matches("[abc]"));
//        //2
//        System.out.println("ab".matches("[abc]"));
//        //3
//        System.out.println("ab".matches("[abc][abc]"));
//        //4
//        System.out.println("z".matches("[abc]"));
//
//        //5
//        System.out.println("a".matches("[^abc]"));
//        //6
//        System.out.println("z".matches("[^abc]"));
//        //7
//        System.out.println("zz".matches("[^abc][^abc]"));
//
//        //8
//        System.out.println("a".matches("[a-d[m-p]]"));
//        //9
//        System.out.println("e".matches("[a-d||[m-p]]]"));
//
//        //10
//        System.out.println("e".matches("[a-d&&[m-p]]"));
//        //11
//        System.out.println("b".matches("[a-d&&[a-p]]"));
//
//        //12
//        System.out.println("a".matches("[a-z&&[^bc]]"));
//
//        //13
//        System.out.println("a".matches("[a-z&&[^m-p]]"));
//
//        //14
//        System.out.println("\"");
//        System.out.println("-----------15-------------");
//        //15
//        System.out.println("a".matches("."));
//        System.out.println("a".matches("\\D"));
//        System.out.println("3".matches("\\d"));
//        System.out.println("33".matches("\\d\\d"));
//        System.out.println("a".matches("\\w"));
//        System.out.println("a".matches("\\w{6,}"));
//        System.out.println("aaaaaaa".matches("\\w{6,}"));
//        System.out.println("ja2asdas".matches("\\w{6,}"));
//        System.out.println("jdw_".matches("[\\w&&[^_]]{4,}"));

//        moble phone number: 13113456778  1371234567 13769976319
//        telephone number: 070-2034-5635
//
        System.out.println("--------------moble phone number--------------");
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13113456778".matches(regex1));
        System.out.println("--------------telephone number--------------");
        String regex2 = "0\\d{2}-{1}\\d{4}-{1}\\d{4}";
        System.out.println("070-2034-5635".matches(regex2));
        System.out.println("070-2034-56235".matches(regex2));
        System.out.println("170-2034-5635".matches(regex2));
        System.out.println("070-2334-5635".matches(regex2));

        // email koukau77@gmail.com
        System.out.println("--------------email--------------");
        String regex3 = "\\w+@gmail\\.com";
        System.out.println("koukau77@gmail.com".matches(regex3));
        // 24h
        System.out.println("--------------time--------------");
        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("16:45:53".matches(regex4));
        System.out.println("16:75:53".matches(regex4));
    }
}
