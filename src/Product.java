public interface Product {
    void displayInfo();
    double CalculateShippingCost(double distance);
    default String isFreeShipping(){
        return null;
    }
    default double discountPrice(double discountPercentage) {
        return 0;
    }
    default double applyAdditionalDiscount(double extraDiscount) {
        return extraDiscount;
    }
}
