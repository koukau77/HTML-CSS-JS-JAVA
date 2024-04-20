package InHerit;

public class Manager extends Employee {

    private double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("manage other employees");
    }

    @Override
    public void eat() {
        System.out.println("manage is eating rice");
    }
}
