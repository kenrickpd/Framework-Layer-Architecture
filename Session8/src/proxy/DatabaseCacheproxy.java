package proxy;

import java.util.HashMap;

import database.Database;
import model.Executable;

public class DatabaseCacheproxy implements Executable{
	private HashMap<String, Integer> cache = new HashMap<>();
	private Database db = new Database();
	@Override
	public int executeQuery(String query) throws Exception {
		if(cache.get(query) == null) {
			int data = db.executeQuery(query);
			cache.put(query, data);
			return data;
		}else {
			return cache.get(query);
		}
	}
	
}
