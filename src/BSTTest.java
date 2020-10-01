
import Dnode.java.BinarySearchTree;

public class BSTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BinarySearchTree bst=new BinarySearchTree();
		
		bst.insert(4);
		bst.insert(3);
		bst.insert(5);
		bst.insert(2);
		bst.insert(1);
		bst.inOrder(bst.root);
		
		System.out.println("Max="+bst.findMax(bst.getRoot()));
		System.out.println("Min="+bst.findMax(bst.getRoot()));
	}

}
