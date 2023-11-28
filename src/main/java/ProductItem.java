import java.util.Scanner;

public class ProductItem {

    public String name;
    public double price;

    public void askProductData(){

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите название товара:");

            name = scanner.nextLine();

            if(!name.trim().equals("")){
                break;
            }

            System.out.println("Ошибка! Название не должно быть пустой строкой");
        }

        while(true) {

            System.out.println("Введите стоимость товара:");

            try {

                price = scanner.nextDouble();

                if (price > 0) {
                    break;
                }

            } catch (Exception e) {

                if(scanner.hasNextLine()) scanner.nextLine();
                //scanner = new Scanner(System.in);
            }

            System.out.println("Введите число в формате 0.00");
        }
    }


    public String getNameAndPrice(){
         return  name + " " + AddFormat.format(price);
    }

    public String getPrice(){
        return  AddFormat.format(price);
    }
}
