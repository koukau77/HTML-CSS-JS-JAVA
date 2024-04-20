package Goods;

import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Please input id");
//            String id = sc.next();
//            System.out.println("Please input name");
//            String name = sc.next();
//            System.out.println("Please input price");
//            double price = sc.nextDouble();
//            System.out.println("Please input count");
//            int count = sc.nextInt();
//            arr[i] = new Goods(id, name, price, count);
//        }
        Goods g1 = new Goods("01", "4070", 7000, 100);
        Goods g2 = new Goods("02", "4070Ti", 8000, 100);
        Goods g3 = new Goods("03", "4080", 8000, 180);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        Goods g4 = new Goods("04", "4090", 15000, 100);

        printArr(arr);
        Goods[] narr = addGood(arr, g4);
        printArr(narr);
        revisePrice(narr, "04", 20000);
        printArr(narr);

    }

    // 通过id修改商品价格
    public static void revisePrice(Goods[] arr, String id, double price){
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                if (arr[i].getId().equals(id)){
                    System.out.println("将" + arr[i].getName() + "的价格重新设置为" + price);
                    arr[i].setPrince(price);
                    flag = false;
                }
            }
        }
        if (flag){
            System.out.println("此id不存在，请检查后重新输入id");
        }
    }


    // 添加一个新的成员到数组
    public static Goods[] addGood(Goods[] arr, Goods good){
        Goods[] narr = new Goods[arr.length];
        if (contains(arr, good.getId())){
            System.out.println("仓库中已有相同id的物品，无法添加。");
        }else {
            System.out.println("将添加" + good.getName() + "到数组中");
            // 判断有没有满
            int count = getCount(arr);
            if (count == arr.length){
                // 满了就新建一个数组
                System.out.println("数组已满，创建新数组");
                Goods[] newArr = creatNewArr(arr);
                newArr[count] = good;
                narr = newArr;
            }else {
                // 没满直接添加
                System.out.println("数组没满，直接添加");
                arr[count] = good;
                narr = arr;
            }
        }
        return narr;
    }

    // 通过id删除成员
    public static Goods[] deleteGood(Goods[] arr, String id){
        int index = getIndex(arr, id);
        if (index >= 0){
            arr[index] = null;
        }else {
            System.out.println("当前id不存在，删除失败");
        }
        return arr;
    }

    // 打印数组
    public static void printArr(Goods[] arr){
        System.out.println("打印数组:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                System.out.println(arr[i].getId() + ", " + arr[i].getName() + ", " +
                        arr[i].getPrince() + " , " + arr[i].getCount());
            }
        }
    }

    // 判断数组中是否有该id
    public static boolean contains(Goods[] arr, String id){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                if (arr[i].getId().equals(id)){
                    return true;
                }
            }
        }
        return false;
    }

    // 获取数组中非空的长度
    public static int getCount(Goods[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                count++;
            }
        }
        return count;
    }

    // 通过id获得id对应的索引
    public static int getIndex(Goods[] arr, String id){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                if (arr[i].getId().equals(id)){
                    return i;
                }
            }
        }
        return -1;
    }

    // 创建新数组
    public static Goods[] creatNewArr(Goods[] arr){
        Goods[] newArr = new Goods[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    // 得到平均价格
    public static double avgPrince(Goods[] arr){
        double avg_price = 0;
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            avg_price += goods.getPrince() / arr.length;
        }
        return avg_price;
    }
}
