import java.util.NoSuchElementException;

public class StackList<E> {
   public Node<E> top;
   public int size;
   
   public StackList() {
	   top=null;
	   size=0;
   }
   
   public void push(E newData) {
	   Node<E> newNode=new Node(newData,top);
	   top=newNode;
	   size++;
   }
   
   public E pop() {
	   if(size==0) throw new NoSuchElementException();
	   E data=top.data;
	   top=top.link;
	   size--;
	   return data;// top 반환 
   }
   
   public boolean isEmpty() {
	   if(size==0)
		   return true;
	   else
	   return false; //return (size==0);
   }
   public E peek() {
	   return top.data;
   }
   public void printAll() {
	   System.out.println();
	   Node<E> p=top;
	   while(p!=null) {
		   if(p==top) {
			   System.out.println(p.data);
			   System.out.print("<=top");
		   }else
			  System.out.println(p.data); 
		     p=p.link;
		   }
		   
	   }
   }
   

