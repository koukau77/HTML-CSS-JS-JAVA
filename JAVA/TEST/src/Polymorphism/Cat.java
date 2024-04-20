package Polymorphism;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void catchMouse(){
        System.out.println("Cat is catching a mouse");
    }

    @Override
    public void eat(String something){
        int age = getAge();
        String color = getColor();
        System.out.println("a " + age + " years old " + color + " cat is eating " + something);
    }
}
