package eventDriven;
public class object {
    //  class for Car 
    static class Car {
        private String model;
        private int stock;

        public Car(String model, int stock) {
            this.model = model;
            this.stock = stock;
        }

        public String getModel() {
            return model;
        }

        public int getStock() {
            return stock;
        }

        public void sell() {
            if (stock > 0) {
                stock--;
                System.out.println("Sold one " + model + ".");
            } else {
                System.out.println("Sorry, no more " + model + " available.");
            }
        }

        public void addStock(int quantity) {
            stock += quantity;
            System.out.println("Added " + quantity + " " + model + " to stock.");
        }
    }

    //  classes for CarDealership 
    static class CarDealership {
        private Car[] cars;

        public CarDealership() {
            cars = new Car[3];
            cars[0] = new Car("Sedan", 10);
            cars[1] = new Car("SUV", 5);
            cars[2] = new Car("Sports", 8);
        }

        public void displayAvailableCars() {
            System.out.println("Available Cars:");
            for (Car car : cars) {
                System.out.println(car.getModel() + ": " + car.getStock());
            }
        }

        public void sellCar(int modelIndex) {
            cars[modelIndex].sell();
        }

        public void addCars(int modelIndex, int quantity) {
            cars[modelIndex].addStock(quantity);
        }
    }

    //  main function
    public static void main(String[] args) {
        CarDealership dealership = new CarDealership();
        dealership.displayAvailableCars();
        dealership.sellCar(0);
        dealership.displayAvailableCars();
        dealership.addCars(1, 3);
        dealership.displayAvailableCars();
    }
}
