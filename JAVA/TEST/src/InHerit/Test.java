package InHerit;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001", "gaohuayu", 15000, 8000);
        System.out.println(m.getId() + "," + m.getName() + "," + m.getSalary() + "," + m.getBonus());
        m.work();
        m.eat();

        Cooker c = new Cooker("002", "gaohuayu", 10000);
        System.out.println(c.getId() + "," + c.getName() + "," + c.getSalary());
        c.work();
        c.eat();
    }
}
