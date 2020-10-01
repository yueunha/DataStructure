
public class DoubleList<E> {
	public DNode<E> head;     //앞쪽 헤드
	public DNode<E> tail;     //꼬리 
	public int size;

	public DoubleList() { //연결리스트 생성
		head = null;
		tail = null;
		size = 0;
	}

	public void insertfront(E newData) {    //리스트 맨 앞에 데이터 삽입.
		DNode newNode = new DNode(null, newData, null); //새로운 노드 생성.
		if (head == null) {               //헤드가 널이면
			head = newNode;               //헤드는 새노드 가리킴.
			tail = newNode;               //꼬리는 새노드 가리킴.
		} else {
			newNode.rightlink = head;        //새노드의 오른쪽링크 헤드의 링크주소 저장
			head.leftlink = newNode;         //헤드의 왼쪽 주소는 새노드 값 저자
			head = newNode; // newNode주소값
		}
		size++;
	}

	public void insertlast(E newData) {            //리스트 맨 뒤에 데이터 삽입.
		DNode newNode = new DNode(null, newData, null);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.leftlink = tail;             //
			tail.rightlink = newNode;              //
			tail = newNode; // newNode주소값
		}
		size++;
	}

	public void insertafter(E target, E newData) {
		DNode newNode = new DNode(null, newData, null);

		if (head == null) {
			head = newNode;
			tail = newNode;

		} else {
			DNode t = findNode(target);
			DNode p = t.rightlink;

			newNode.leftlink = t;
			newNode.rightlink = p;

			t.rightlink = newNode;
			p.leftlink = newNode;
		}

		size++;
	}

	public void insertprevious(E target, E newData) {
		DNode newNode = new DNode(null, newData, null);

		if (head == null) {
			head = newNode;
			tail = newNode;

		} else {
			DNode t = findNode(target);
			DNode p = t.leftlink;

			newNode.leftlink = p;
			newNode.rightlink = t;

			p.rightlink = newNode;
			t.leftlink = newNode;
		}

		size++;
	}

	public DNode findNode(E data) {
		DNode<E> p = head;
		int i = 0;
		while (p != null) {
			if (data == p.data)
				return p;
			p = p.rightlink;
		}
		return null;

	}

	public void deleteFront() {          //맨 앞 데이터 삭제
		if (head == null) {                   //
			System.out.println("데이터가 없습니다.");  
		} else {
			DNode p = head.rightlink; //헤드가 가리키는 노드 

			p.leftlink = null;         //p의 왼쪽링크  널로 바꿈.
			head.rightlink = null;     // 헤드의 오른쪽 링크 널로 바꿈.
			head = p;                    //헤드가 피를 가리키게 함. 
			size--;        //삭제할때 --밖에넣으면 데이터 없을 때도 작동하기 때문에 데이터 있을 때만 작동하게 하기 위해 else 문 안에 지정.
		}

	}

	public void deleteprevious(E target) {  //타겟 앞에 데이터 삭제
		if (head == null) {
			System.out.println("데이터가 없습니다.");
		} else {
			DNode t = findNode(target);
			DNode p = t.leftlink.leftlink;

			p.rightlink = t;
			t.leftlink = p;
			size--;
		}
	}

	public void deleteAfter(E target) {   //타겟 뒤에 데이터 삭제
		if (head == null) {
			System.out.println("데이터가 없습니다.");
		} else {
			DNode t = findNode(target);
			DNode p = t.rightlink.rightlink;
			t.rightlink = p;
			p.leftlink = t;
			size--;
		}
	}

	public void deleteLast() {       //리스트의 마지막 데이터 삭제
		if (head == null) {
			System.out.println("데이터가 없습니다.");
		} else {
			DNode p = tail.leftlink;            // 꼬리 왼쪽링크는 p로 설정. 
			p.rightlink = null;
			tail.leftlink = null;
			tail = p;
			size--;
		}
	}

	public void printAll() {
		DNode<E> p = head; // node 이동하는 화살
		System.out.print("List =[");
		while (p != null) {
			System.out.print(p.data + " ,");
			p = p.rightlink;
		}
		System.out.println("]");
	}

}
