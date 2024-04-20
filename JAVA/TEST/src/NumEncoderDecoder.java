import java.util.Scanner;

public class NumEncoderDecoder {
    public static void main(String[] args) {
        int NumEncoder = encoder();
        System.out.println("NumEncoder=" + NumEncoder);
        int NumDecoder = decoder(NumEncoder);
        System.out.println("NumDecoder=" + NumDecoder);
    }
    
    public static int encoder(){
        //        数字加密，规则：先得到每一位数，然后每一位数加上5，再对10求余，最后将所有数字反转。
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input an integer:");
        int num = sc.nextInt();
        int len = String.valueOf(num).length();
        int weishu = 0;
        int[] arr = new int[len];
        int NumEncoder = 0;
        for (int i = 0; i < len; i++) {
            weishu = (int)(num / Math.pow(10, i) % 10);
            arr[i] = (weishu + 5) % 10;
            NumEncoder += (int)(arr[i] * Math.pow(10, len - i - 1));
        }

        return NumEncoder;
    } 
    
    public static int decoder(int num){
        int len = String.valueOf(num).length();
        int[] arr = new int[len];
        int weishu = 0;
        int NumDecoder = 0;
        for (int i = 0; i < len; i++) {
            weishu = (int)(num / Math.pow(10, i) % 10);
            if (weishu < 5){
                arr[i] = weishu + 10 - 5;
            }else {
                arr[i] = weishu - 5;
            }
            NumDecoder += (int)(arr[i] * Math.pow(10, len - i - 1));
        }

        return NumDecoder;
    }
}
