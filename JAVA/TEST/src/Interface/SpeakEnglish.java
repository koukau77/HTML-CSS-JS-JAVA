package Interface;

public interface SpeakEnglish {
    public abstract void speakEnglish();

    public default void show(){
        System.out.println("show");
    }
}
