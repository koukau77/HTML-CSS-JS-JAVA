package InnerClass;

public class Test {
    public static void main(String[] args) {

        method(
                new Car() {
                    @Override
                    public void eat() {
                        System.out.println("eaast");
                    }
                }

        );


    }

    public static void method(Car c){
        c.eat();
    }
}
