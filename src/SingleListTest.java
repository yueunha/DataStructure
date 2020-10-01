
public class SingleListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SingleList<String> sl=new SingleList();
       sl.insertFront("월");
       sl.insertFront("화");
       sl.insertFront("수");
       
      sl.insertafter("목",sl.head.link.link);
       //sl.printAll();
       //sl.deleteAfter(sl.head.link);
       sl.printAll();
       
      System.out.println(sl.search("수")+"번째");
      //sl.printAll();
	}

}
