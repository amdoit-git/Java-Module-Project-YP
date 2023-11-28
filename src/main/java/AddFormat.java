import java.util.Formatter;
import java.util.Locale;
public class AddFormat {
    public static String format(int total){

        int count = total%100;

        String result;

        if (count >= 5 && count <= 20) {
            result = "товаров";
        } else {
            count = count % 10;
            if (count == 1) {
                result = "товар";
            } else if (count >= 2 && count <= 4) {
                result = "товара";
            } else {
                result = "товаров";
            }
        }

        return String.format("%d %s", total, result);
    }

    public static String format(double price){

        int count = ((int)Math.floor(price))%100;

        String result;

        if (count >= 5 && count <= 20) {
            result = "рублей";
        } else {
            count = count % 10;
            if (count == 1) {
                result = "рубль";
            } else if (count >= 2 && count <= 4) {
                result = "рубля";
            } else {
                result = "рублей";
            }
        }

        return String.format("%.2f %s", price, result);
    }
}
