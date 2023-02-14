import java.util.Random;

/**
 * @author Crole
 * @version 1.0
 * @created 13-feb.-2023 03:02:54 p. m.
 */
public class Consumer implements Node {

	private float consumed;
	private int pos;
	private int id;

	public Consumer(int id){
		Random rand = new Random();
		consumed = rand.nextFloat();
		pos = 0;
		this.id = id;
	}

	public void finalize() throws Throwable {

	}
	
	@Override
	public float getConsumed(){
		return consumed;
	}

	@Override
	public int getPos(){
		return pos;
	}

	/**
	 * 
	 * @param consumed
	 */
	public void setConsumed(float consumed){
		this.consumed = consumed;
	}

	/**
	 * 
	 * @param pos
	 */
	@Override
	public void setPos(int pos){
		this.pos = pos;
	}

	@Override
	public Node getConnection(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConnection(int id, int t) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.id = id;;
	}
	
	public int getId(){
		return id;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}
}//end Consumer