

/**
 * @author Crole
 * @version 1.0
 * @created 13-feb.-2023 03:03:01 p. m.
 */
public class TreeIterator implements Iterator {

	private Node node;
	private Tree tree;
	//public Tree m_Tree;

	public TreeIterator(){
		node = null;
		this.tree = null;
	}
	
	/**
	 * 
	 * @param id
	 */
	public TreeIterator(Tree tree){
		node = null;
		this.tree = tree;
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

	public Node getCurrentNode(){
		return null;
	}

	public Node next(){
		if(node == null)
		{
			node = tree.getRoot();
			return node;
		}
		else
		{
			while(true)
			{
				if(node.getClass() == Extension.class && node.getPos() < node.getLength())
				{
					Node aux = node.getConnection(node.getPos());
					node = aux;
					return node;
				}
			}
		}
	}
	
	public boolean empty(){
		if(node == null)
		{
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param idConnection
	 */
	public void removeConnection(int idConnection){

	}
}//end TreeIterator