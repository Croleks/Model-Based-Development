

/**
 * @author Crole
 * @version 1.0
 * @created 13-feb.-2023 03:02:59 p. m.
 */
public interface Node {

	public Node getConnection(int id);
	public float getConsumed();
	public int getPos();
	public void setConnection(int id, int t);
	public void setPos(int pos);
	public int getLength();
	public int getFlag();
	public void setFlag(int f);
}//end Node