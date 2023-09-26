package after;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseManager db1 = DatabaseManager.getInstance();
		DatabaseManager db2 = DatabaseManager.getInstance();
		
		System.out.println(System.identityHashCode(db1));
		System.out.println(System.identityHashCode(db2));
	}

}
