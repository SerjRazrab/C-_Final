package prakt_1;


public class Main {
    public static void main(String[] args) {
        VendingMashine vendingMashine = new VendingMashine();
        Product product1 = new Product("Twix",80.5);
        Product product2 = new Product("Snickers",85.5);
        Product product3 = new Product("Nuts",69.5);
        Product product4 = new Bottle("CocaCola", 100.0, 0.5);

        vendingMashine.addProduct(product1);
        vendingMashine.addProduct(product2);
        vendingMashine.addProduct(product3);
        vendingMashine.addProduct(product4);
        System.out.println(vendingMashine);
    }
    
}
