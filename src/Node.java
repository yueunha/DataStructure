
public class Node<E> {
     public E data; //데이터 
     public Node<E> link; //주소 가리키는 포인터 
     
     public Node(E data, Node<E> link) {
    	 this.data= data;//파라미터 변수와 선언변수 구분위해 this사
    	 this.link= link;
     }
     //getter,setter

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getLink() {
		return link;
	}

	public void setLink(Node<E> link) {
		this.link = link;
	}
          
}

