package Interface;

public class PingpongCoach extends Coach implements SpeakEnglish{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void tech() {
        System.out.println("PingpongCoach is teaching");
    }

    @Override
    public void speakEnglish() {
        System.out.println("PingpongCoach is speaking English");
    }
}
