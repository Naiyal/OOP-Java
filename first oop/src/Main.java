public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product("banan", "null", 150, 15, 5, 2005);
        System.out.println(product.getName());

        Product p = new Product(product);
        product.setName("apple");
        System.out.println(p.getName());
        System.out.println(product.getName());

    }
}
