package fightergame;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    private String gender;
    private String face;

    String[] boyface = {"风流俊雅", "一塌糊涂", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "面目狰狞"};
    String[] girlface = {"美轮美奂", "沉鱼落雁", "亭亭玉立", "身材姣好", "相貌平平", "相貌简陋", "惨不忍睹"};

    public Role() {
    }

    public Role(String name, int blood, String gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
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
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     * @param face
     */
    public void setFace(String gender) {
        Random r = new Random();
        if (gender == "female"){
            int index = r.nextInt(girlface.length);
            this.face = girlface[index];
        } else if (gender == "male") {
            int index = r.nextInt(boyface.length);
            this.face = boyface[index];
        }else {
            this.face = "面目狰狞";
        }
    }

    // 显示角色信息
    public void showRoleInfo(){
        System.out.println("姓名：" + this.getName());
        System.out.println("性别：" + this.getGender());
        System.out.println("血量：" + this.getBlood());
        System.out.println("容貌：" + this.getFace());
    }

    // attack
    // r1.attack(r2)
    public void attack(Role role){
        // 计算造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
        if (remainBlood < 0){
            remainBlood = 0;
        }
        role.setBlood(remainBlood);
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，造成了" + hurt + "点伤害，" +
                role.getName() + "还剩下了" + role.getBlood() + "点血");
    }
}
