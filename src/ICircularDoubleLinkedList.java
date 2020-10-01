
public interface ICircularDoubleLinkedList<T> {
	
	
	public void insertAfter(T target, T data) ;
		
	
	
	public void insertPrevious(T target, T data) ;
		
	
	
	public void removeAfter(T target, T data) ;
		
	
	
	public void removePrevious(T target, T data) ;
		
	
	
	public boolean search(T data) ;
		
	
	
	public void printAll() ;
}
