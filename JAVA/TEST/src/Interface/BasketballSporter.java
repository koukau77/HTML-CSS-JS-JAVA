package Interface;

public class BasketballSporter extends Sportsman implements SpeakEnglish{
    public BasketballSporter() {
    }

    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("BasketballSporter is studying");
    }


    @Override
    public void speakEnglish() {
        System.out.println("BasketballSporter is speaking English");
    }

    @Override
    public void show() {
        System.out.println("show time");
    }
}
