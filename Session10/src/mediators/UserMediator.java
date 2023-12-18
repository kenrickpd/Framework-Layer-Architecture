package mediators;

import java.util.HashMap;

import models.User;

public class UserMediator {
	private HashMap<String, User> userMap;
	
	public UserMediator() {
		userMap = new HashMap<>();
	}
	
	public void addUser(User user) {
		userMap.put(user.getUserID(), user);
	}
	
	public void sendMsg(String sender, String to, String message) {
		User user = userMap.get(to);
		if(user == null) {
			System.out.println("User not found with id: " + to);
			return;
		}
		user.recieveMsg(sender, message);
	}
}
