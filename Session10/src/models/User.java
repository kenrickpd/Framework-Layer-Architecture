package models;

import mediators.UserMediator;

public class User {
	private String userID; 
	private String username;
	private UserMediator media;
	
	public User(String userID, String username, UserMediator media) {
		super();
		this.userID = userID;
		this.username = username;
		this.media = media;
		media.addUser(this);
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void recieveMsg(String sender, String message) {
		System.out.println("Getting message from " + sender + ": " + message);
	}
	
	public void sendMsg(String to, String message) {
		media.sendMsg(this.userID, to, message);
	}
}
