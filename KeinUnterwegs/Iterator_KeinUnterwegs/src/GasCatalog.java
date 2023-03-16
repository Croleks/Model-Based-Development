import java.util.ArrayList;

public class GasCatalog implements Catalog{
	private ArrayList<Car> cars;
	
	public GasCatalog() {
		cars = new ArrayList<Car>();
	}
	
	public GasCatalog(ArrayList<Car> array) {
		cars = array;
	}
	
	@Override
	public CarIterator createIterator() {
		// TODO Auto-generated method stub
		return new GasIterator(cars);
	}
	@Override
	public void addCar(Car car) {
		// TODO Auto-generated method stub
		cars.add(car);
	}
}
