


public class StackArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StackArray <String> sa= new StackArray();
         sa.push("월");
         sa.push("화");
         sa.push("수");
         sa.push("목");
         sa.push("금");
         sa.push("토");
         sa.printAll();
         
         System.out.println();
         System.out.println(sa.peek());
         sa.printAll();
	}

}
