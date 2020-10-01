
public class StackListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackList<String> sl=new StackList();
		sl.push("월");
		sl.push("화");
		sl.push("수");
		sl.printAll();
		
		System.out.println(sl.pop());
		sl.printAll();
		
		System.out.println(sl.peek());
		sl.printAll();
	}

}
