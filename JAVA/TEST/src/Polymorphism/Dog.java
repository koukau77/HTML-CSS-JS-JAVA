package Polymorphism;

public class Dog extends Animal{


    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void lookHome(){
        System.out.println("Dog is looking home");
    }
    @Override
    public void eat(String something){
        int age = getAge();
        String color = getColor();
        System.out.println("a " + age + " years old " + color + " dog is eating " + something);
    }
}
