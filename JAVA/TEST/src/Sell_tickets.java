public class Sell_tickets {
    public static void main(String[] args){
        int orig_price = 1670;
        int month = 6;
        String flag = "economy_class";
        double price = get_price(orig_price, month, flag);
        System.out.printf("The final price is %.2f", price);
    }
    public static double get_price(int orig_price, int month, String flag){
        double price = 0.0;
        if(month >= 5 && month <= 10){
            if (flag.equals("economy_class")){
                price = orig_price * 0.85;
            }
            else {
                price = orig_price * 0.9;
            }

        }
        else {
            if (flag.equals("first_class")){
                price = orig_price * 0.7;
            }
            else {
                price = orig_price * 0.65;
            }

        }
        return price;
    }

}

