package main;

import java.util.ArrayList;

import iterators.UserIterator;
import mediators.UserMediator;
import models.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserMediator media = new UserMediator();
		User user1 = new User("US01", "Test1", media);
		User user2 = new User("US02", "Test2", media);
		
		user1.sendMsg("US02", "Ini test buat ngirim message");
		
		ArrayList<User> userList = new ArrayList<>();
		
		userList.add(user1);
		userList.add(user2);
		UserIterator<User> userIterator = new UserIterator<>(userList);	
		while(userIterator.hasNext()) {
			User user = userIterator.getNext();
			System.out.println("ID: " + user.getUserID() + " Name: " + user.getUsername());
		}
	}

}
