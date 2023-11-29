public class MyCalc {
    private int persons;
    public String products = "";
    public double total_price = 0;

    private int total = 0;
    MyCalc(int persons){
        this.persons = persons;
    }

    public void addProduct(){

        ProductItem item = new ProductItem();

        item.askProductData();

        System.out.println("Добавлен товар " + item.name + " стоимостью "+item.getPrice());

        products += item.getNameAndPrice() + "\n";

        this.total_price += item.price;
        this.total++;
    }

    public void calculateAndPrint(){
        System.out.println("\n");
        System.out.println("Заказанные товары:");
        System.out.println(products.trim());

        //продавец и копейки не простит, так что если поровну не поделится будут чаевые
        double price_per_person = Math.ceil(100*total_price/persons)/100;

        System.out.println("Итого "+AddFormat.format(total, "товар", "товара","товаров", true)+" на сумму "+AddFormat.rub(total_price));
        System.out.println("Делим счет на "+ AddFormat.format(persons, "человека", "человек","человек", true));
        System.out.println("Каждый должен заплатить по "+ AddFormat.rub(price_per_person));
    }
}
