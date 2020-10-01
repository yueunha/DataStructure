import java.util.NoSuchElementException;

public class SingleList<E> {   
    public Node<E> head; //연결리스트 첫 노드가리킴.
    public int size;
    
    public SingleList() { //연결리스트 생성
    	head =null;
    	size =0;
    } 
    
    
    
    public void insertFront(E newItem) { //연결리스트 맨 앞에 새 노드삽입.
    	Node<E> newNode= new Node(newItem, head);//new node생성(head를 가리키고 있는) 
    	head =newNode; //head가 newNode가리킴
    	size++;
    	}
    public void insertafter(E newData, Node<E> p) { //노드p 다음에 노드 삽입.
    	Node<E> newNode= new Node(newData,p.link); //new node 생성 후 이전노드의 링크 필드 값을 new 링크 필드 저장/
    	p.link= newNode;//이전노드 링크 필드에 new의 값 저장.
    	size++;
    }
    
    public void deleteFront() {
    	if(size==0)throw new NoSuchElementException();		//삭제할 원소 앞노드찾는데 없다면 ,리스트의 첫 노드 삭제
    	head =head.link;      //헤드가 헤드의 링크를 가리킴.자기자신 가리킴.    
    	size--;
    }
    public void deleteAfter(Node<E> p) {      //p가 가리키는 다음노드 삭제하는 함수 
    	if(size==0)throw new NoSuchElementException();
    	Node<E> t =p.link; //임시로t t설정. 삭제할 노드의 앞노드 찾음.
    	p.link=t.link;  // 앞노드의 링크필드에 삭제할 원소 수의 링크필드 값 저장.
    	t.link=null; 
    	size--;//삭제한 노드 값 없어짐.
    }
    public int search(E target) {
    	Node<E> p=head;
    	int i=0;
    	while(p !=null) {
    	if(target==p.data) //검색값이랑 p노드가 가리키는 다음노드의 데이터값이 같으면 리턴 
    		return i;
    	 p =p.link;    //p의 링크는 다음 노드 가리
    	i++;
    	}
    	return -1; //탐색 실패하면 -1리
    }
    
    
    
    public void printAll() {
    	Node p= head; //node 이동하는 화살
    	System.out.print("List =[");
    	while(p !=null) {
    		System.out.print(p.data+" ,");
    		p=p.link;   		
    	}
    	System.out.println(" ]");
    }
}
