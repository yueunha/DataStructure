
public class 

<T> implements ICircularDoubleLinkedList<T> {

	public CDNode<T> last; // 원형리스트의 마지막 노드
	public int size;

	public void CDlinkedList() {
		last = null;
		size = 0;
	}

	public void insertfront(T data) { // 맨 앞에 노드 추가하는 메소드
		CDNode<T> newNode = new CDNode(null, data, null);// 새 노드 생성

		if (last == null) { // 리스트가 비어있는 경우 ,
			newNode.setRightlink(newNode);
			newNode.setLeftlink(newNode);
			last = newNode; // 노드가 자기 자신을 가리키게 함.
		} else { // 리스트 비어있지 않은 경
			CDNode<T> f = last.leftlink; // last 이전노드 임의로 f로 가정함.
			newNode.setRightlink(last); // 새노드의 오른쪽링크값은 last 가리킴.
			newNode.setLeftlink(f); // 새노드의 왼쪽링크값은 이전노드f 가리킴.
			last.leftlink = newNode; // last의 왼쪽링크는 새노드 가리키게됨.
			f.rightlink = newNode; // 이전 노드의 오른쪽링크 노드 가리키게 됨.
			last = newNode; // newNode주소값 //라스트는 새노드가 됨.
		}
		size++; // 삽입되므로 사이즈 증
	}

	public void insertlast(T data) { // 맨 마지막에 노드 추가하는 함수
		CDNode<T> newNode = new CDNode(null, data, null);

		if (last == null) { // 리스트 비어있는경우
			newNode.setRightlink(newNode);
			newNode.setLeftlink(newNode);
			last = newNode; // 노드 자기자신 가리킴.
		} else {
			CDNode<T> f = last.leftlink;
			newNode.setRightlink(last); // 새노드의 오른쪽링크값은 last 가리킴.
			newNode.setLeftlink(f);

			last.leftlink = newNode;
			f.rightlink = newNode;
		}
		size++;
	} // 원형리스트는 마지막 노드가 첫번째 노드를 가리켜 계속 순환되는 함수이기 때문에 마지막에 추가하던지 앞에 추가하던지 큰 차이 없음.

	@Override
	public void insertAfter(T target, T data) { // 타겟 뒤에 데이터 넣기
		CDNode<T> newNode = new CDNode(null, data, null);
		if (last == null) { // 리스트가 빈 경우
			newNode.setRightlink(newNode);
			newNode.setLeftlink(newNode);
			last = newNode; // 자기자신 가리킴.
			size++;
		} else { // 리스트가 비지 않은 경우
			if (search(target)) { // 타겟 찾음.
				CDNode t = findNode(target); // 타겟 찾음.
				CDNode A = t.rightlink; // 타겟 이후에 노드를 임의로 A로 지정.

				newNode.setLeftlink(t); // 새노드의 왼쪽링크는 타겟가리킴.
				newNode.setRightlink(A); // 새노드의 오른쪽 링크는타겟 이후노드 a가리킴.

				t.rightlink = newNode; // 타겟의 오른쪽 링크는새노드 가리킴.
				A.leftlink = newNode; // 타겟의 왼쪽 링크는 새노드 가리킴.
				size++; // 삽입되어 리스트 사이즈 증가.
			}
		}
	}

	@Override
	public void insertPrevious(T target, T data) { // 타겟앞에 데이터 삽입
		CDNode<T> newNode = new CDNode(null, data, null);
		if (last == null) { // 리스트가 빈 경우
			newNode.setRightlink(newNode);
			newNode.setLeftlink(newNode);
			last = newNode;
			size++;
		} else { // 리스트가 비지 않은 경우
			if (search(target)) {
				CDNode t = findNode(target);
				CDNode f = t.leftlink; // 타겟에 이전 노드를 F로 지정.

				newNode.setLeftlink(f); // 새노드에 왼쪽링크는 이전노드 가리킴.
				newNode.setRightlink(t); // 새노드에 오른쪽링크는 타겟 가리킴.

				f.rightlink = newNode; // 이전 노드에 오른쪽링크는 새 노드 가리킴.
				t.leftlink = newNode; // 타겟에 왼쪽 링크는 새노드 가리킴.

				size++; // 새노드 삽입되어 리스트 사이즈 증가됨.
			}
		}
	}

	public void removefront() {
		if (last == null) { // 리스트가 비어있을 ,
			System.out.println("데이터가 없습니다.");
		}
		if (size == 1)
			last = null;
		else {
			CDNode<T> x = last.rightlink;

			x.leftlink = null; // p의 왼쪽링크 널로 바꿈.
			last.rightlink = null; // 헤드의 오른쪽 링크 널로 바꿈.
			last = x; // 헤드가 피를 가리키게 함.
			size--; // 삭제할때 --밖에넣으면 데이터 없을 때도 작동하기 때문에 데이터 있을 때만 작동하게 하기 위해 else 문 안에 지정.
		}

	}

	public void removelast(T data) {
		if (last == null) { // 리스트가 비어있을 ,
			System.out.println("데이터가 없습니다.");
		}
		if (size == 1)
			last = null;
		else {
			CDNode<T> x = last.rightlink;

			x.leftlink = null; // p의 왼쪽링크 널로 바꿈.
			last.rightlink = null; // 헤드의 오른쪽 링크 널로 바꿈.
			last = x; // 헤드가 피를 가리키게 함.
			size--; // 삭제할때 --밖에넣으면 데이터 없을 때도 작동하기 때문에 데이터 있을 때만 작동하게 하기 위해 else 문 안에 지정.
		}

	}

	@Override
	public void removePrevious(T target, T data) { // 타겟 앞에 데이터 삭제
		if (size == 0) {
			System.out.println("데이터가 없습니다.");
		}
		if (size == 1) {
			last = null;
			size--;
		} else {
		if (search(target)) {
			CDNode<T> t = findNode(target); //
			CDNode<T> p = t.leftlink.leftlink;// 타겟에 옆옆 노드
			p.rightlink = t;
			t.leftlink = p;
			size--;
		}
		}
	}

	@Override
	public void removeAfter(T target, T data) { // 타겟 뒤에 데이터 삭제
		if (size == 0) { // 사이즈가 0일
			System.out.println("데이터가 없습니다.");
		}
		if (size == 1) { // 사이즈가 하나일 때 라스트가 자기 자신일 때
			last = null; 
			size--;
		} else {
			if (search(target)) { // 리스트 여러개 일 때
				CDNode<T> t = findNode(target);
				CDNode<T> p = t.rightlink.rightlink; // 타겟에 옆옆노드
				t.rightlink = p;
				p.leftlink = t;
				size--;
			}
		}
	}

	public CDNode findNode(T data) {
		CDNode<T> p = last;
		for (int i = 0; i < size; i++) {
			if (data == p.data)
				return p;
			p = p.rightlink;
		}
		return null;
	}

	@Override
	public boolean search(T data) { // data 가지고 있는지 탐색하는 메소드
		CDNode<T> p = last;
		for (int i = 0; i < size; i++) {
			if (data == p.data)
				return true; // 찾는데이터p의 데이터 값과 같으면 트루 반환.
			p = p.rightlink; // p는 라스트의 오른쪽 링크 값 가리킴.
		}
		System.out.println("해당하는 데이터가 없습니다.");
		return false;//
	}

	@Override
	public void printAll() {
		CDNode<T> p = last; // node 이동하는 화살
		System.out.print("CDLinkedList =[");
		for (int i = 0; i < size; i++) {
			System.out.print(p.data + ",");
			p = p.rightlink;
		}
		System.out.println("]");
	}

}
