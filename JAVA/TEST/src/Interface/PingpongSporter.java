package Interface;

public class PingpongSporter extends Sportsman implements SpeakEnglish{
    public PingpongSporter() {
    }

    public PingpongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("PingpongSporter is studying");
    }

    @Override
    public void speakEnglish() {
        System.out.println("PingpongSporter is speaking English");
    }
}
