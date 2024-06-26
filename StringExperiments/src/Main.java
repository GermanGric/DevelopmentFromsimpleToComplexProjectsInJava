import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Product[] products = {
          new Product("молоко", 65),
          new Product("meet", 420),
          new Product("milk",65),
          new Product("bread",40),
          new Product("a carrot", 250),
          new Product("chicken", 250),
          new Product("melon",20),
          new Product("mixer", 1200),
          new Product("kettle", 1800),
                new Product("молоко", 65),
                new Product("meet", 420),
                new Product("milk",65),
                new Product("bread",40),
                new Product("a carrot", 250),
                new Product("chicken", 250),
                new Product("melon",20),
                new Product("mixer", 1200),
                new Product("kettle", 1800)
        };
        int MIN_PRICE_FOR_DISCOUNT = 1000;
        double discount = 0.2;
        for (Product product : products){
            int price = product.getPrice();
            if (price >= MIN_PRICE_FOR_DISCOUNT){
                product.setPrice((int) (price * (1 - discount)));
            }
        }
        for (Product product : products){
            System.out.println(product);
        }
    }
}