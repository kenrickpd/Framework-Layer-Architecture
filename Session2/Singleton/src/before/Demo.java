package before;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseManager db1 = new DatabaseManager();
		DatabaseManager db2 = new DatabaseManager();
		
		System.out.println(System.identityHashCode(db1));
		System.out.println(System.identityHashCode(db2));
		
		db1.setConf(true);
		
		db1.getConf();
		db2.getConf();
	}

}
