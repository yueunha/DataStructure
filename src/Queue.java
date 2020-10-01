
public class Queue<E> {
	private Node<E> front; //
	private Node<E> rear;
	private int size;
	
	public Queue() {
		front=null;
		rear=null;
		size=0;
	}
	
	public boolean isEmpty() {
		return(front==null);
		
	}
	
	public void enQueue(E data) {
		if(isEmpty()) {
			Node<E> newNode=new Node<E>(data,null);
			front=newNode;
			rear=newNode;
		}else {
		Node<E> newNode=new Node<E>(data,null); //새로운 노드 생
		rear.link=newNode; 
		rear=newNode;
		}
		size++;
	}
	public E deQueue() {
		if(isEmpty()) {
			System.out.println("there is no data");
			return null;
		}else {
		Node<E> old=front;//front가 가리키는 값 저장함. E old Data=front.data
		front=front.link;
		size--;
		return old.data;
		}
	}
	
	public E peek() {
		if(isEmpty()) {
			System.out.println("there is no data");
			return null;
		}else {
		return front.data;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public void printAll() {
		Node<E> ptr=front;
		while(ptr!=null) {
			System.out.print(" "+ptr.data);
			ptr= ptr.link;//한 칸씩 옆으로 움직이면서 출력.
		}
	}
	
}

