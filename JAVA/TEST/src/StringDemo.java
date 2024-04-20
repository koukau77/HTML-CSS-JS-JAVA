import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String Username = "Gao Huayu";
        String Password = "ppyy541880";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int time = 3 - i;
            System.out.println("Please input your Username.");
            String username = sc.nextLine();
            System.out.println("Please input your Password.");
            String password = sc.nextLine();
            if (password.equals(Password) && username.equals(Username)){
                System.out.println("Login successfully.");
                break;
            }else {
                if ((! username.equals(Username)) || (! password.equals(Password))){
                    time--;
                    System.out.println("Username or Password is wrong, " + time + " times left.");
                }
            }
            if (time == 0){
                System.out.println("输入错误次数过多，请稍后再试!");
            }
        }
    }
}
