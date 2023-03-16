import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> array = new ArrayList<Car>();
		array.add(new Car("Acura", "TL", 6, 3200, 5, "FWD", "JH4UA2641VC001425", "8FWN473"));
		array.add(new Car("Volvo", "XC90", 6, 3200, 5, "4WD", "YV4CY982981446117", "HNK1309"));
		array.add(new Car("Mazda", "CX-5", 4, 2500, 5, "FWD", "JM3KFACL4H0195607", "SC20479"));
		array.add(new Car("BMW", "M4", 6, 3000, 4, "RWD", "WBS3R9C56HK7099924", "DEL3257"));
		array.add(new Car("Ford", "Fiesta", 4, 1600, 5, "FWD", "3FADP4BJ2HM119905", "8JBW259"));

		GasCatalog gas = new GasCatalog(array);
		
		gas.addCar(new Car("Toyota", "Corola", 4, 1600, 5, "FWD", "1NXBR18E4WZ083448", "6HHA679"));	
		
		GasIterator iterator = (GasIterator) gas.createIterator();
		
		while(iterator.hasNext() == true) {
			Car car = iterator.getNext();
			System.out.println("Out Gas Car");
			printData(car);
		}
		
		iterator.print();
		
		System.out.println("");
		System.out.println("Searching VIN: 1NXBR18E4WZ083448...");
		System.out.println("Retriving VIN: 1NXBR18E4WZ083448 data...");
		System.out.println("VIN: 1NXBR18E4WZ083448 data:");
		printData(iterator.findVIN("1NXBR18E4WZ083448"));
		
		System.out.println("");
		System.out.println("Searching Plate: 8JBW259...");
		System.out.println("Retriving Plate: 8JBW259 data...");
		System.out.println("VIN: 8JBW259 data:");
		printData(iterator.findPlate("8JBW259"));
	}
	
	public static void printData(Car car) {
		System.out.println("Brand: " + car.getBrand());
		System.out.println("Model: " + car.getModel());
		System.out.println("Number of cilinders: " + car.getCilinders());
		System.out.println("CC: " + car.getCC());
		System.out.println("Passengers: " + car.getPassengers());
		System.out.println("Wheel Drive: " + car.getWheelDrive());
		System.out.println("VIN: " + car.getVIN());
		System.out.println("Plate Number: " + car.getPlate());
		System.out.println("");
	}

}
