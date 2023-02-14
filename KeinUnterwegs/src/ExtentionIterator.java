
public class ExtentionIterator {
	private Node node;
	private Tree tree;

	public ExtentionIterator(){
		node = null;
		this.tree = null;
	}
	
	public ExtentionIterator(Tree tree){
		node = null;
		this.tree = tree;
	}

	public void finalize() throws Throwable {

	}
	
	public void addConnection(int idOld, int idNew){

	}

	public Node getCurrentNode(){
		return null;
	}

	public Node next(){
		return next(tree.getRoot());
	}
	
	public Node next (Node nod){
		if(nod.getFlag() == 0) {
			nod.setFlag(1);
			return nod;
		}
		else {
			while(true) {
				if(nod.getPos() < nod.getLength()) {
					Node aux1 = nod.getConnection(nod.getPos());
					if(aux1.getClass() == Extension.class) {
						return next(aux1);
					}
					else {
						nod.setPos(nod.getPos() + 1);
					}
				}
				else {
					nod.setPos(0);
					nod.setFlag(0);
					return null;
				}
			}
		}
		//return null;
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
