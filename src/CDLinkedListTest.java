
public class CDLinkedListTest {

	public static void main(String[] args) {
		
		CDLinkedList<String> cdl=new CDLinkedList();
		//insert front
		cdl.insertfront("수");
		cdl.insertfront("화");
		cdl.insertfront("월");
		cdl.printAll();
		
		//insert last
		cdl.insertlast("금");
		cdl.printAll();
		
		//insertAfter
		cdl.insertAfter("수","목" );
		cdl.printAll();
	    
		//insertPrevious
		cdl.insertPrevious("화", "토");
		cdl.printAll();
		
		cdl.removePrevious("목", "수");
		cdl.printAll();
		
		cdl.removeAfter("월","토");
		cdl.printAll();
		
	
	}
}
