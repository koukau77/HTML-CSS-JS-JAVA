package InnerClass;



public abstract class Car {

    private int a = 10;

    public Car() {
    }

    public Car(int a) {
        this.a = a;
    }


    /**
     * 获取
     * @return a
     */
    public int getA() {
        return a;
    }

    /**
     * 设置
     * @param a
     */
    public void setA(int a) {
        this.a = a;
    }

    public abstract void eat();

    class Innner{
        private int a = 20;
        public void show(){
            int a = 30;
            System.out.println(Car.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }

}
