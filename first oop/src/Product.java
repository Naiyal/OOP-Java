public class Product {

    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private int year;

    // Product() {
    // name = "apple";
    // description = "AAA";
    // price = 100;
    // quantity = 10;
    // discount = 0;
    // }

    Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    Product(String name, String description, float price, int quantity, float discount, int year) {
        this(name, description, price, quantity, discount);
        this.year = year;
    }

    public Product(Product obj) {
        this.name = obj.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
