public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Product 1", 10.99, "P001");
        Product product2 = new Product("Product 2", 20.99, "P002", 3);
        Product product3 = new Product("Product 3", 30.75, "P003");

        product1.changePrice(12.99);

        product3.changeNumberOfPieces(5);

        displayProductInfo(product1);
        displayProductInfo(product2);
        displayProductInfo(product3);
    }

    public static void displayProductInfo(Product product) {
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Product Code: " + product.getProductCode());
        System.out.println("Number of Pieces: " + product.getNumberOfPieces());
        System.out.println();
    }
}
