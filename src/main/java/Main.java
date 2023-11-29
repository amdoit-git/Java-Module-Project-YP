
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("На скольких человек необходимо разделить счёт?");

        int persons;

        while (true){
            try{
                persons = scanner.nextInt();

                if(!scanner.nextLine().trim().equals("")){
                    //100 раз! Уже 100 раз я повторял, что хочу поделить счет на 5 человек
                    System.out.println("Введите просто число без дополнительных знаков:");
                    continue;
                }

                if(persons>1){
                    break;
                }

                System.out.println("Введите число человек больше 1:");

            }catch (Exception e) {
                //System.out.println(e);
                //scanner = new Scanner(System.in);
                if(scanner.hasNextLine()) scanner.nextLine();
                System.out.println("Введите число, а не строку:");
            }
        }

        System.out.println("Будем делить счет на "+AddFormat.format(persons, "человека", "человека","человек", true));

        MyCalc calc = new MyCalc(persons);

        System.out.println("Теперь давайте добавим товары в счет");

        while (true){

            calc.addProduct();

            System.out.println("Хотите добавить ещё один товар? [да/завершить]");

            String str = scanner.nextLine();

            if(str.trim().equalsIgnoreCase("завершить")){
               break;
            }
        }

        calc.calculateAndPrint();
    }
}