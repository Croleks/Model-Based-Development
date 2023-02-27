import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Composite implements Node{
	private ArrayList<Double> data;
	
	private Node lC;
	private Node rC;
	
	public Composite() {
		data = null;
		lC = null;
		rC = null;
	}
	
	public Composite(ArrayList<Double> data) {
		this.data = new ArrayList<Double>();
		this.data.addAll(data);
		createChildren();
	}
	
	public Composite(List<Double> data) {
		this.data = new ArrayList<Double>();
		this.data.addAll(data);
		createChildren();
	}

	@Override
	public ArrayList<Double> merged() {
		// TODO Auto-generated method stub
		System.out.println("Merged: " + data.size());
		return data;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		System.out.println("Sort: " + data);
		Thread task1 = new Thread(lC);
		Thread task2 = new Thread(rC);
		task1.start();
		task2.start();
		try {
			task1.join();
			task2.join();
		}catch(InterruptedException ex) {System.out.println("Error al sincronizar hilos");}
		Collections.sort(data, Collections.reverseOrder());
		System.out.println("Sorted: " + data);
	}
	
	@Override
    public void run() {
		sort();
    }
	
	public void createChildren() {
		int middle;
		middle = data.size() / 2;
		switch(data.size()) {
		case 0:
			System.out.println(data.get(0) + " !!!!!?????");
			break;
		case 1:
			System.out.println("Case 1: [" + data.get(0) + "]");
			break;
		case 2:
			System.out.println(data.size());
			System.out.println("Case 2: [" + data.get(0) + "]");
			System.out.println("Case 2: [" + data.get(1) + "]");
			lC = new Leaf(data.get(0));			
			rC = new Leaf(data.get(1));
			break;
		case 3:
			System.out.println(data.size());
			System.out.println("Case 3: [" + data.get(0) + "]");
			System.out.println("Case 3: " + data.subList(1, data.size()));
			lC = new Leaf(data.get(0));
			rC = new Composite(data.subList(1, data.size()));
			break;
			default:
				System.out.println(data.size());
				System.out.println("Default: " + data.subList(0, middle));
				System.out.println("Default: " + data.subList(middle, data.size()));
				lC = new Composite(data.subList(0, middle));
				rC = new Composite(data.subList(middle, data.size()));
		}
	}
}
