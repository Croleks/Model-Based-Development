import java.util.ArrayList;

public class GasIterator implements CarIterator{
	
	private ArrayList<Car> cars;
	private int pos;
	
	public GasIterator() {
		cars = null;
		pos = 0;
	}
	
	public GasIterator(ArrayList<Car> array) {
		cars = new ArrayList<Car>();
		cars.addAll(array);
		pos = 0;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return pos < cars.size();
	}

	@Override
	public Car getNext() {
		// TODO Auto-generated method stub
		if (!hasNext()) {
			reset();
            return null;
        }
		Car car = cars.get(pos);
		pos++;
		return car;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		pos = 0;
	}
	
	@Override
	public Car findVIN(String vin) {
		// TODO Auto-generated method stub
		for(Car car : cars) {
			if(car.getVIN() == vin)
				return car;
		}
		return null;
	}

	@Override
	public Car findPlate(String plate) {
		// TODO Auto-generated method stub
		for(Car car : cars) {
			if(car.getPlate() == plate)
				return car;
		}
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(Car car : cars) {
			System.out.println("Gas Car #" + pos);
			System.out.println("Brand: " + car.getBrand());
			System.out.println("Model: " + car.getModel());
			System.out.println("Number of cilinders: " + car.getCilinders());
			System.out.println("CC: " + car.getCC());
			System.out.println("Passengers: " + car.getPassengers());
			System.out.println("Wheel Drive: " + car.getWheelDrive());
			System.out.println("VIN: " + car.getVIN());
			System.out.println("Plate Number: " + car.getPlate());
			System.out.println("");
			pos++;
		}
	}
}
