package proxy;

import database.Database;
import model.Executable;
import model.User;

public class DatabaseProtectionProxy implements Executable{
	private boolean isAuth = false;
	private Database db;
	
	public DatabaseProtectionProxy(User user) {
		if(user.getRole().equals("Admin")) {
			isAuth = true;
		}
		db = new Database();
	}

	@Override
	public int executeQuery(String query) throws Exception{
		if(isAuth) {
			return db.executeQuery(query);
		}else {
			if(query.contains("SELECT")) {
				return db.executeQuery(query);
			} else {
				throw new Exception("you are not allowed to execute this query");
			}
		}
	}
}
