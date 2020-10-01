
public class CircularList<E> {
	 public Node<E> last;
	 public int size;
	    
	 public CircularList() {
	    	last =null; //선형연결리스트 생성.
	    	size =0;
	    } 
	 public void insert(E newData ) {
      Node newNode =new Node(newData,null);//새노드 생성.
		
      if(last ==null) {     //last가 가리키는 게 null이면 노드 하나생성해 last가 가리키게 함.즉,라스트가 empty일 
		newNode.link=newNode; //새노드의 주소값이 자기 자신을 가리키게 함. 그래야 원형 리스트가 됨. 
		last =newNode;//라스트가 새노드가리키게 함. 
      }else {    
    	 newNode.link=last.link; //새노드 주소값은 last link  라스트 뒤에 삽입
    	 last.link=newNode;  //라스트 주소값은 새 노드 가리키면서 새 노드가 라스트가 됨.
      }
		 size++;
   }
	 
	 public void insertafter(E newData, Node<E> p) {
	    	Node <E> newNode= new Node(newData,p.link);
	    	p.link= newNode;
	    }
	 
  public int delete() {
		 if(last==null) { // 라스트가 비어있는 경우 
			 System.out.println("There is no data");
		     return -1;
		 }
		 Node x=last.link;    //라스트가 있는 경우 x	는 라스트가 가리키는 노
		 if(last==x)last=null;  //라스트가 x와 같다면 라스트값 널해줌.
		 else {
			 last.link=x.link;    //라스트가 x랑 다르면 라스트링크는 x 링크 값 저장.
			 x.link=null;      //x링크값은 널
		 }
		 size--;
		 return 1;
	 }
  
  public void deleteAfter(Node<E> p) {
  	Node<E> o= p.link;
  	p.link= o.link;
  	o.link= null;
  	
  }
  
	 
      public void printAll() {
	    	Node p=last; 
	    	System.out.print("CircularList =[");
	    	for(int i=0; i<size; i++) {
	    		System.out.print(p.data+",");
	    		p= p.link;   		
	    	}
	    	System.out.println(" ]");
	    }	 
	 
      public int getSize() {
    	  return size;
      }
      
      public E getLastData() {
    	  return last.data;
      }
	 
}
