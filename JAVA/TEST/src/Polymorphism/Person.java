package Polymorphism;

public class Person {

    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }

    public void keepPet(Animal a, String something){
        if (a instanceof Dog d){
            System.out.println(age + " years old " + name + " is feeding a "
                    + d.getAge() + " years old " + d.getColor() + " dog");
            d.lookHome();
        }else if (a instanceof Cat c){
            System.out.println(age + " years old " + name + " is feeding a "
                    + c.getAge() + " years old " + c.getColor() + " cat");
            c.catchMouse();
        }else {
            System.out.println("no this animal");
        }

    }
}
