package Interface;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void tech() {
        System.out.println("BasketballCoach is teach");
    }


}
