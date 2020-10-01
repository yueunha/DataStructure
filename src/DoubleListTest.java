
public class DoubleListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       DoubleList<String> dl= new DoubleList();
       
       dl.insertfront("금");
       dl.insertfront("목");
       dl.insertfront("월");
       dl.insertlast("토");
       dl.insertafter("월", "화");
       dl.insertprevious("목","수");
       dl.printAll();
       
       dl.deleteLast();
       dl.printAll();
       
       dl.deleteAfter("월");
       dl.printAll();
       
       dl.deleteprevious("목");
       dl.printAll();
       
       
      
       
      
	}

}
