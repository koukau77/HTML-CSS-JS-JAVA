public class Regular {
    public static void main(String[] args) {

        System.out.println("a".matches("[abc]"));
        System.out.println("ab".matches("[abc]"));
        System.out.println("ab".matches("[abc][abc]"));
        System.out.println("z".matches("[abc]"));
    }
}
