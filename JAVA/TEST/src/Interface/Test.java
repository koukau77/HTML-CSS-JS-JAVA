package Interface;

public class Test {
    public static void main(String[] args) {

        PingpongSporter p = new PingpongSporter("koukau", 23);
        p.study();
        p.speakEnglish();

        BasketballSporter b = new BasketballSporter("kaka", 23);
        b.show();
        b.study();
    }
}
