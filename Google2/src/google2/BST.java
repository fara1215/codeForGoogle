package google2;

public class BST {
	Node root;
	BST(){
		root=null;
	}
	
	public void insert(int id) {
		Node newId = new Node(id);
		if(root == null) {
			root = newId;
		}else {
			
			Node current= root;
			Node parent;
			while(true) {
				parent=current;
				if (id<current.value) {
					current=current.left;
					if(current ==null) {
						parent.left=newId;
						return;
					}
				}else {
					current=current.right;
					if(current==null) {
						parent.right=newId;
						return;
					}
				}
			}
		}
	}
public Node iInsert(Node node, int id) {
	
	if(node==null) {
		return new Node(id);
		
	}
	if(id<node.value) {
		node.left= iInsert(node.left, id);
		
	}
	else if (id>node.value) {
		node.right=iInsert(node.right, id);
		
	}
	return node;
	
}

public void inOrder(Node node) {
	if (node!=null) {
		inOrder(node.left);
		System.out.println(node.value);
		inOrder(node.right);
		
	}
}
}


