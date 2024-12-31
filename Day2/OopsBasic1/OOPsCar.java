//Create a class Car with attributes like brand, model, and price. Write methods to display details of a car and calculate the discounted price.

package Day2.OopsBasic1;
public class OOPsCar {
        private static String brand;
        private static String model;
        private static double price;

        public OOPsCar(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }
        public static void displayDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: $" + price);
        }
        public double calculateDiscountedPrice(double discountPercentage) {
            return price - (price * discountPercentage / 100);
        }
        public static void main(String[] args) {
            OOPsCar car = new OOPsCar("Toyota", "Camry", 30000);
            OOPsCar.displayDetails();
            System.out.println("Discounted Price: $" + car.calculateDiscountedPrice(10));
        }
    }