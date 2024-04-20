package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("laowang", 30);
        Cat c = new Cat(3, "grey");
        p1.keepPet(c, "fish");

        Person p2 = new Person("laoli", 34);
        Dog d = new Dog(5, "black");
        p2.keepPet(d, "meat");

    }


}
