
public class Car {
	private String brand;
	private String model;
	private int cilinders;
	private int cc;
	private int passengers;
	private String wheelDrive;
	private String vin;
	private String plate;
	
	public Car() {
		brand = "";
		model = "";
		cilinders = 0;
		cc = 0;
		passengers = 0;
		wheelDrive = "";
		vin = "";
		plate = "";
	}
	
	public Car(String brand, String model, int cilinders, int cc, int passengers, String wheelDrive, String vin, String plate) {
		this.brand = brand;
		this.model = model;
		this.cilinders = cilinders;
		this.cc = cc;
		this.passengers = passengers;
		this.wheelDrive = wheelDrive;
		this.vin = vin;
		this.plate = plate;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getCilinders() {
		return cilinders;
	}
	
	public int getCC() {
		return cc;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	public String getWheelDrive() {
		return wheelDrive;
	}
	
	public String getVIN() {
		return vin;
	}
	
	public String getPlate() {
		return plate;
	}
}
