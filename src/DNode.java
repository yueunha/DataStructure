
public class DNode<E> {
  public DNode<E> leftlink;
  public E data;
  public DNode<E> rightlink;
  
  public DNode(DNode<E> leftlink,E data,DNode<E> rightlink) {
	 this.leftlink=leftlink;
	 this.data=data;
	 this.rightlink=rightlink; //더블노드 생성
	
  }
  //getter,setter 생성

public DNode<E> getLeftlink() {
	return leftlink;
}

public void setLeftlink(DNode<E> leftlink) {
	this.leftlink = leftlink;
}

public E getData() {
	return data;
}

public void setData(E data) {
	this.data = data;
}

public DNode<E> getRightlink() {
	return rightlink;
}

public void setRightlink(DNode<E> rightlink) {
	this.rightlink = rightlink;
}

  
}
