import java.util.Scanner;
public class Score {
    public static void main(String[] args){

        // input scores
        int[] score = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 6 numebr");
        for (int i = 0; i < 6; i++) {
            int num = sc.nextInt();
            if (num >= 0 && num <= 100) {
                score[i] = num;
            }else {
                System.out.println("Please input one numebr in 0-100 again ");
                if (i > 0){
                    i--;
                }else {
                    i = 0;
                }
            }
        }
        // calculate score
        // find max
        int max = score[0];
        int min = score[0];
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]){
                max = score[i];
            }
            if (min > score[i]){
                min = score[i];
            }

            sum += score[i];
        }

        double final_score = (double)((sum - min - max) / 4);

        System.out.println(final_score);
    }
}
