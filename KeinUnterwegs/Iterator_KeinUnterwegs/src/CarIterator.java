
public interface CarIterator {
	public boolean hasNext();
	public Car getNext();
	public void reset();
	public Car findVIN(String vin);
	public Car findPlate(String plate);
	public void print();
}
