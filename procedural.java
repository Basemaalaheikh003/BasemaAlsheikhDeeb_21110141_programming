package eventDriven;

public class Procedural {
	 

	// Data for the  variables
	String[] carModels = { "Sedan", "SUV", "Sports" };
	int[] carStock = { 10, 5, 8 };

	//  display available cars
	void displayAvailableCars() {
	    System.out.println("Available Cars:");
	    for (int i = 0; i < carModels.length; i++) {
	        System.out.println(carModels[i] + ": " + carStock[i]);
	    }
	}

	//  sell car Function
	void sellCar(int modelIndex) {
	    if (carStock[modelIndex] > 0) {
	        carStock[modelIndex]--;
	        System.out.println("Sold one " + carModels[modelIndex] + ".");
	    } else {
	        System.out.println("Sorry, no more " + carModels[modelIndex] + " available.");
	    }
	}

	//  add new cars to stock function
	void addCars(int modelIndex, int quantity) {
	    carStock[modelIndex] += quantity;
	    System.out.println("Added " + quantity + " " + carModels[modelIndex] + " to stock.");
	}

	// Main function
	public static void main(String[] args) {
		Procedural dealership = new  Procedural();
	    dealership.displayAvailableCars();
	    dealership.sellCar(0);
	    dealership.displayAvailableCars();
	    dealership.addCars(1, 3);
	    dealership.displayAvailableCars();
	}
}
