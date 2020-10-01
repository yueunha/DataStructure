public class StackArray <E>{
	public E[] array;
    public int top;// 제일 위에 데이터가르키는 
    final static int STACK_size=5; 
	
    public StackArray() {
    	array=(E[]) new Object[STACK_size]; //-자바 최상위 객체로 생성해줌.사이즈 10으로 설정.
    	top=-1;
    	
    }
    
    public boolean isEmpty() {
    if(top==-1)
    	return true;
    else 
    	return false;
     // return (top == -1)
    }
    
    public boolean isFull() {
    	return (top== STACK_size-1);
    }
    
    public void push(E data ) {
    	if(isFull())
    		System.out.println("stack is full"); //스택이 가득찼을때 에러사항 발생 알림. 
    	else {
    	array[top+1]=data;//top다음에 데이터 삽입
    	top++; 
    	}
    } 
    public E pop() { //삭제하고 원래있던 공간을 반환해야 함.
    	if(isEmpty()) {
    		System.out.print("Stack is Empty");
    		return null;
    	}else {
    	E returnData =array[top];//탑에 있는 데이터 값 저장.
    	top--; //top 사이즈 줄이면서 탑에 있는 값 삭제.
    	return returnData; //다시 탑 반환하면서 원래 스택의 탑에 있던 다음 배열값이 탑이 됨. 
    }
    }
     public E peek() {
    	 if(isEmpty()) {
    		 System.out.println("Stack is Empty");
    		 return null;
    	 }else {
    	 return array[top];
     }
     }
     public void printAll() {
    	 
     	for(int i=top; i>-1; i--) {
     		if(i==top) {
     			System.out.print(array[i]);
     			System.out.println("<=top");
     		}else
     		System.out.println(array[i]);
     	}
     }
    }
