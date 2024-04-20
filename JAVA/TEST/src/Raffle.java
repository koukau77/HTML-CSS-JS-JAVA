import java.util.Random;

public class Raffle {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        raffle(arr);
    }

    public static void raffle(int[] arr){
        int len = arr.length;
        int[] raffle = new int[len];
        Random r = new Random();
        for (int i = 0; i < len; ) {
            int randomIndex = r.nextInt(len);
            int prize = arr[randomIndex];
            boolean flag = contains(raffle, prize);
            if (!flag){
                raffle[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(raffle[i] + "的奖金被抽出");
        }
    }

    public static boolean contains(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
