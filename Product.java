public class Product {
    private String name;
    private double price;
    private String productCode;
    private int numberOfPieces;

    public Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = 0;
    }

    public Product(String name, double price, String productCode, int numberOfPieces) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = numberOfPieces;
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    public void changeNumberOfPieces(int newNumberOfPieces) {
        if (newNumberOfPieces >= 0) {
            this.numberOfPieces = newNumberOfPieces;
        } else {
            System.out.println("Number of pieces cannot be less than 0!");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }
}
