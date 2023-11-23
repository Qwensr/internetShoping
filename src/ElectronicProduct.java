 public class ElectronicProduct implements Product {
        private String name;
        private Double price;
        private Double weight;


        public ElectronicProduct(String name, double price, double weight) {
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

        @Override
        public void displayInfo() {
            System.out.println("\n" + name);
            System.out.println("Price: " + price + "$");
            System.out.println("Weight: " + weight + " kg");
        }

        @Override
        public double CalculateShippingCost(double distance) {
            return distance * weight * 0.5;
        }

        @Override
        public String isFreeShipping() {
                return "К сожалению, для электронных товаров у нас нет БЕСПЛАТНОЙ ДОСТАВКИ.";
        }

        @Override
        public double discountPrice(double discountPercentage) {
            return price - (price * (discountPercentage / 100));
        }
    }
