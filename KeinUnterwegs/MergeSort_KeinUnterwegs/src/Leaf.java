import java.util.ArrayList;

public class Leaf implements Node{
	private ArrayList<Double> data;
	
	public Leaf() {
		data = null;
	}
	
	public Leaf(double data) {
		this.data = new ArrayList<Double>();
		this.data.add(data);
		for(int i = 0; i < this.data.size(); i ++) {
			System.out.print(this.data.get(i) + " : ");
		}
		System.out.println();
	}

	@Override
	public ArrayList<Double> merged() {
		// TODO Auto-generated method stub
		System.out.println("Leaf: " + data.size());
		return data;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		//System.out.println("Sort Leaf: " + data);
		//System.out.println("Sorted Leaf: " + data);
	}
	
	@Override
    public void run() {
		sort();
    }
}