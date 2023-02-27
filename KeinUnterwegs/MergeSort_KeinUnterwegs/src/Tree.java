import java.util.ArrayList;

public class Tree {

	private Node root;
	
	public Tree() {
		root = null;
	}
	
	public Tree(ArrayList<Double> data) {
		root = new Composite(data);
	}
	
	public void startSorting() {
		Thread task = new Thread(root);
		task.start();
		try {
			task.join();
		}catch(InterruptedException ex) {System.out.println("Error al sincronizar hilo");}
	}
	
	public ArrayList<Double> getSorted() {
		return root.merged();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree;
		//double[] example = {2, 5, 7, 8, 3, 9, 1, 4, 6, 0, 10};
		ArrayList<Double> example = new ArrayList<Double>();
		example.add(2.0);
		example.add(5.0);
		example.add(7.0);
		example.add(8.0);
		example.add(3.0);
		example.add(9.0);
		example.add(1.0);
		example.add(4.0);
		example.add(6.0);
		example.add(0.0);
		example.add(10.0);
		tree = new Tree(example);
		tree.startSorting();
		ArrayList<Double> result = tree.getSorted();
		for(int i = 0; i < result.size(); i ++) {
			System.out.println(result.get(i));
		}
	}

}
