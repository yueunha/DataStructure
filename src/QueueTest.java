
public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new Queue<String>();
		q.enQueue("A");
		q.enQueue("B");
		q.enQueue("C");
		q.enQueue("D");
		q.enQueue("E");
		q.enQueue("f");
		q.printAll();
		
		System.out.println("Dequeue data="+q.deQueue());
		System.out.println("Dequeue data="+q.deQueue());
		System.out.println("Dequeue data="+q.deQueue());
		
		q.printAll();
	}

}
