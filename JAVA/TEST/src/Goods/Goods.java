package Goods;

public class Goods {
    private String id;
    private String name;
    private double prince;
    private int count;


    public Goods() {
    }

    public Goods(String id, String name, double prince, int count) {
        this.id = id;
        this.name = name;
        this.prince = prince;
        this.count = count;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
     * @return prince
     */
    public double getPrince() {
        return prince;
    }

    /**
     * 设置
     * @param prince
     */
    public void setPrince(double prince) {
        this.prince = prince;
    }

    /**
     * 获取
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        return "Goods{id = " + id + ", name = " + name + ", prince = " + prince + ", count = " + count + "}";
    }
}

