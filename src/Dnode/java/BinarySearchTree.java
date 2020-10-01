package Dnode.java;
public class BinarySearchTree {
	 public DNode root;
	 private int count;
	 
	
     public BinarySearchTree() {
    	 root=null;
    	 count =0;
     }
     
     public void insert(int data) {
    	 if(isEmpty()) {
    		 DNode newNode=new DNode(null,data,null);
    		 root=newNode;
    		 count++;
    	 }else {
    	    root=insert(data,root);//재귀함수 사용//
    	 }    		
     }
     
     public DNode insert(int data,DNode node) {
    	 if(data < node.data) { //만일에 삽입하는 데이터가 현재 노드보다 작으면 
    		 if(node.leftlink!=null) {
    		 node.leftlink=insert(data, node.leftlink); 
    		 
    		 }else {         
    			 DNode newNode=new DNode(null,data,null);
        		 node.leftlink=newNode;
        		 count++;
    		 }
    		 
    	 }else if(data > node.data){   //삽입하는 데이터가 현 노드보다 크면
    		 if(node.rightlink!=null) {
    	     node.rightlink=insert(data,node.rightlink);
    	 }else {
    		 DNode newNode=new DNode(null,data,null);
    		 node.rightlink=newNode;
    		 count++;
		 }	 
    		    		 
    	 }else {//삽입하는 데이터가 현재 노드와 같으면
    		 System.out.println("삽입하려는 데이터가 이미 있습니다.");
    	   
     }
    	 return node;
     }
     public void delete(int data){
    	 if(root!=null) {
    	 root=delete(root,data);//재귀함수 사용//
     }else
    	 System.out.println("삭제하려는 데이터가 없습니다.");
     }
     
     public DNode delete(DNode node,int data) {
    	 if(data<node.data) {
    		 node.leftlink=delete(node.leftlink,data);	//왼쪽 서브트리
    		 count--;
    	 }else if(data>node.data) {
    		 node.rightlink=delete(node.rightlink,data);//오른쪽 서브트리
    		 count--;
    	 }else {
    		 if(node.leftlink==null && node.rightlink ==null) { //자식이 하나도 없는 경우//
    			return null;
    		 }else if(node.leftlink!= null && node.rightlink ==null){      //자식 하나만 있는 경우(왼쪽에만 있음)//
    			 DNode tNode=node.leftlink;
    			 node=null;            // 삭제하려는 원소 삭제//
    			 return tNode;      //삭제하려는 원소 왼쪽에 있던 노드 왼쪽링크 연결시켜줌.//
    		 }else if(node.leftlink == null &&node.rightlink!=null) {     //자식 하나만 있는 경우(오른쪽에만 있음)//
    			 DNode tNode=node.rightlink;
    			 node =null;          //삭제하려는 원소 삭제//
    			 return tNode;      //삭제하려는 원소 오른쪽에 있던 노드 오른쪽링크 연결시켜줌.//
    		 }else if(node.leftlink != null &&node.rightlink !=null) {     //자식 둘 다 있는 경우
    		         int min= findMin(node.rightlink); //오른쪽서브트리에서 최소값 찾아함. 왼쪽서브트리에서 찾을경우 max값 이용// 
    		         node.rightlink= delete(node.rightlink,min);
    		 }
    		 
    	 }
    	 return node;//나 자신을 리턴함.
     }
     
     
     
     public boolean isEmpty() {
    	 return root==null;
     }
     
     public int findMin(DNode node) {
    	 if(node.leftlink!=null) {
    		 return findMin(node.leftlink);
    	 }else {
    		 return  node.data;
    	 }
     }
     public int findMax(DNode node) {
    	 if(node.rightlink!=null) {
    		 return findMax(node.rightlink);
    	 }else {
    		 return  node.data;
    	 }
     }

	public DNode getRoot() {
		// TODO Auto-generated method stub
		return root;
	}
	
	public void inOrder(DNode node) {
	    	 if(node!=null) {
	    		 inOrder(node.leftlink);
	    		 System.out.print(node.data+"->");
	    		 inOrder(node.rightlink);
	    	 }
	    	 
	}
	
	public void preOrder(DNode node) {
		if(node!=null) {
			System.out.print(node.data+"->");	
			preOrder(node.leftlink);
			preOrder(node.rightlink);			
		}
	}
	
	public void postOrder(DNode node) {
		if(node!=null) {
			postOrder(node.leftlink);
			postOrder(node.rightlink);
			System.out.print(node.data+"->");
		}
	}
}



