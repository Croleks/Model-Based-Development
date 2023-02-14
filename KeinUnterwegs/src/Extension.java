import java.util.ArrayList;

public class Extension implements Node {

	private ArrayList<Node> connections;
	private int pos;
	private int id;
	int flag;
	
	public Extension(){
		connections = new ArrayList<Node>();
		pos = 0;
		this.id = -1;
		flag = 0;
	}

	public Extension(int id){
		connections = new ArrayList<Node>();
		pos = 0;
		this.id = id;
		flag = 0;
	}
	
	public int getFlag() {
		return flag;
	}
	
	public void setFlag(int f) {
		flag = f;
	}
	
	public void setId(int id){
		this.id = id;;
	}
	
	public int getId(){
		return id;
	}
	
	public Node getConnection(int id){
		return connections.get(id);
	}

	public float getConsumed(){
		return 0;
	}

	public int getPos(){
		return pos;
	}
	
	public void setPos(int pos){
		this.pos = pos;
	}
	public void setConnection(int id, int t){
		if(t == 0)	connections.add(new Extension(id));
		else connections.add(new Consumer(id));
	}
	
	public int getLength() {
		return connections.size();
	}
}//end Extension