package after;

public class DatabaseManager {
	//eager initialization
//	private static DatabaseManager instance = new DatabaseManager();
//	
//	public static DatabaseManager getInstance() {
//		return instance;
//	}
	
	//lazy initialization
//	private static DatabaseManager instance = null;
//	
//	public static DatabaseManager getInstance() {
//		if(instance == null) {
//			instance = new DatabaseManager();
//		}
//		return instance;
//	}	
	
	//Thread safe initialization
	private static volatile DatabaseManager instance = null;
	
	public static DatabaseManager getInstance() {
		if(instance == null) {
			synchronized (DatabaseManager.class) {
				if(instance == null) {
					instance = new DatabaseManager();
				}
			}
		}
		return instance;
	}
}
