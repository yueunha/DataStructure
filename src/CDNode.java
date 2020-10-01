
public class CDNode<T> {
  public CDNode<T>leftlink;
  public T data;
  public CDNode<T> rightlink;

public CDNode(CDNode<T> leftlink,T data,CDNode<T> rightlink) {
	 this.leftlink=leftlink;
	 this.data=data;
	 this.rightlink=rightlink; //더블노드 생성
	
 }
//getter,setter 생성
public CDNode<T> getLeftlink() {
	return leftlink;
}

public void setLeftlink(CDNode<T> leftlink) {
	this.leftlink = leftlink;
}

public T getData() {
	return data;
}

public void setData(T data) {
	this.data = data;
}

public CDNode<T> getRightlink() {
	return rightlink;
}

public void setRightlink(CDNode<T> rightlink) {
	this.rightlink = rightlink;
}

}