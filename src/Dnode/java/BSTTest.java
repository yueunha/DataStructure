package Dnode.java;
public class BSTTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BinarySearchTree bst=new BinarySearchTree();
		
		bst.insert(1);
		bst.insert(6);
		bst.insert(3);
		bst.insert(5);
		bst.insert(2);
		
		
		System.out.println("Max="+bst.findMax(bst.getRoot()));
		System.out.println("Min="+bst.findMin(bst.getRoot()));
	
		
		bst.inOrder(bst.getRoot());
		System.out.println();
		bst.preOrder(bst.getRoot());
		System.out.println();
		bst.postOrder(bst.getRoot());
		System.out.println();
		
		bst.delete(6);
		bst.inOrder(bst.getRoot());
		System.out.println();
		
		bst.preOrder(bst.getRoot());
		System.out.println();
		
		bst.postOrder(bst.getRoot());
		System.out.println();
		
		bst.delete(2);
		bst.inOrder(bst.getRoot());
		System.out.println();
		
		bst.preOrder(bst.getRoot());
		System.out.println();
		
		bst.postOrder(bst.getRoot());
		System.out.println();
	}

}
