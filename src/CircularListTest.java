
public class CircularListTest {

	public static void main(String[] args) {
       CircularList<String> cl=new CircularList();
       cl.insert("월");
       cl.insert("화");
       cl.insert("수");       
       cl.printAll();
       
       //cl.delete();
       cl.printAll();
       
       cl.insertafter("목",cl.last.link.link);   
       cl.printAll();
       
       
       
       System.out.println("데이터개수"+cl.getSize());
       System.out.println("Last 데이터는"+cl.getLastData());
       
      
       cl.deleteAfter(cl.last.link.link);
       
       cl.printAll();
       
	}

}
