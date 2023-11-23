public class ClothingProduct implements Product {
    private String brand;
    private String size;
    private String color;
    private Double price;


    public ClothingProduct(String brand, String size, String color, Double price) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    @Override
    public void displayInfo() {
        System.out.println("\n" + brand);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
    }

    @Override
    public double CalculateShippingCost(double distance) {
        return distance * 0.02;
    }

    @Override
    public String isFreeShipping() {
        return "Ваша одежда будет доставлена бесплатно.";
    }

    @Override
    public double discountPrice(double discountPercentage) {
        return price - (price * (discountPercentage / 100));
    }

    @Override
    public double applyAdditionalDiscount(double extraDiscount) {
        price = price - (price * (extraDiscount / 100));
        return price;
    }
}
