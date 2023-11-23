public interface ElectronictProduct {
    void displayInfo();
    void CalculateShippingCost(double distance);
    void isFreeShipping();

    void DiscountPrice(double DiscountPercentage);
}
