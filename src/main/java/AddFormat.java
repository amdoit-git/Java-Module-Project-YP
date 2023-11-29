public class AddFormat {
    public static String format(int num, String s1, String s2, String s3, boolean print_num){

        int count = num%100;

        String result;

        if (count >= 5 && count <= 20) {
            result = s3;
        } else {
            count = count % 10;
            if (count == 1) {
                result = s1;
            } else if (count >= 2 && count <= 4) {
                result = s2;
            } else {
                result = s3;
            }
        }

        if(print_num){
            result = String.format("%d %s", num, result);
        }

        return result;
    }

    public static String rub(double price){

        int num = (int)Math.floor(price);

        String result = format(num, "рубль", "рубля", "рублей", false);

        return String.format("%.2f %s", price, result);
    }

    public static String rub(float price){
        return rub((double)price);
    }
}
