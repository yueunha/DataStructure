package Dnode.java;

public class DNode {
	 public DNode leftlink;
	 public int data;
	 public DNode rightlink;
	 
	public DNode (DNode leftlink,int data, DNode rightlink){
		super();
		this.leftlink=leftlink;
		this.data=data;
		this.rightlink=rightlink;
		
	}
	public DNode getLeftlink() {
		return leftlink;
	}
	public void setLeftlink(DNode leftlink) {
		this.leftlink = leftlink;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DNode getRightlink() {
		return rightlink;
	}
	public void setRightlink(DNode rightlink) {
		this.rightlink = rightlink;
	}
	 
	 
}
