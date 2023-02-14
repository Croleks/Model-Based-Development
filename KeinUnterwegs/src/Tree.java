

/**
 * @author Crole
 * @version 1.0
 * @created 13-feb.-2023 03:03:00 p. m.
 */
public class Tree {

	private Node root;
	private float totalConsume;
	//private TreeIterator m_TreeIterator;

	public Tree(){
		root = new Extension(1);
		totalConsume = 0;
	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param idOld
	 * @param idNew
	 */
	public void addConnection(int idOld, int idNew){

	}

	public Iterator createTreeIterator(){
		return new TreeIterator(this);
	}

	public float getTotalConsume(){
		return 0;
	}

	/**
	 * 
	 * @param idConnection
	 */
	public void removeConnection(int idConnection){

	}
	
	public Node getRoot() {		
		return root;
	}
}//end Tree