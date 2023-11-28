
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

                if(persons>1){
                    break;
                }

                System.out.println("Число человек должно быть больше 1\nВведите корректное значение:");

            }catch (Exception e) {
                //System.out.println(e);
                //scanner = new Scanner(System.in);
                if(scanner.hasNextLine()) scanner.nextLine();
                System.out.println("Введите число, а не строку:");
            }
        }

        System.out.println("Вы ввели "+persons+" человек");

        MyCalc calc = new MyCalc(persons);

        System.out.println("Теперь давайте добавим товары в счет");

        if(scanner.hasNextLine()) scanner.nextLine();

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