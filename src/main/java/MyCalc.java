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

        System.out.println("Добавлен продукт: " + item.name + " стоимостью "+item.getPrice());

        products += item.getNameAndPrice() + "\n";

        this.total_price += item.price;
        this.total++;
    }

    public void calculateAndPrint(){
        System.out.println("Заказанные товары:");
        System.out.println(products);
        System.out.println("Итого "+AddFormat.format(total)+" на сумму "+AddFormat.format(total_price));
        System.out.println("Каждый человек должен заплатить по "+ total_price/persons);
    }
}
