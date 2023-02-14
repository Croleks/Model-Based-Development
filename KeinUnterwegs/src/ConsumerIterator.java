
public class ConsumerIterator implements Iterator{
	private Node node;
	private Tree tree;

	public ConsumerIterator(){
		node = null;
		this.tree = null;
	}
	
	public ConsumerIterator(Tree tree){
		node = null;
		this.tree = tree;
	}

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

	public void removeConnection(int idConnection){

	}
}
