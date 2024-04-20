package InHerit;

public class Cooker extends Employee{
    public Cooker() {
    }

    public Cooker(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("cooker is frying");
    }

    @Override
    public void eat() {
        System.out.println("manage is eating mantou");
    }
}
