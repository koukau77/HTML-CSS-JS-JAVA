import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
//        huiwen();
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr1 = copyOfRange(arr, 1, 3);
        printarr(arr1);
    }
    public static void huiwen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input one numebr");
        int num = sc.nextInt();
        String str_num = String.valueOf(num);
        int len = str_num.length();
        int[] temp = new int[num];
        int flag = 1;

        for(int i = 0; i < len; i++){
            temp[i] = (int)(num / Math.pow(10, i)) % 10;
            if(temp[i] == Character.getNumericValue(str_num.charAt(i))){
                continue;
            }
            else {
                System.out.printf("\n%d is not huiwen", num);
                flag = 0;
                break;
            }
        }
        if(flag == 1) {
            System.out.printf("\n%d is huiwen", num);
        }
    }
    public static void feng7Pass(){
        int num = 200;
        for(int i = 0; i < num; i++){
            String str = String.valueOf(i + 1);
            if((i + 1) % 7 == 0 || str.contains("7")){
                System.out.printf("\nI AM %d, PASS!", i + 1);
            }
        }
    }

    public static void printarr(int[] arr){
        System.out.print('[');
        for(int i = 0; i<arr.length; i++){
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }

        }
        System.out.print(']');
    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] new_arr = new int[to - from];
        int j = 0;
        for(int i = from; i < to; i++){
            new_arr[j] = arr[i];
            j++;
        }
        return new_arr;
    }

}