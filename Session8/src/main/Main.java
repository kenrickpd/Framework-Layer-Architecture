package main;

import model.Image;
import model.User;
import proxy.DatabaseCacheproxy;
import proxy.DatabaseProtectionProxy;
import proxy.ImageVirtualProxy;

public class Main {
	
	public Main() {
//		testingProtectionProxy();
//		testingCacheProxy();
		testingVirtualProxy();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	public void testingProtectionProxy() {
		User user1 = new User("dadang", "Admin");
		User user2 = new User("diding", "Guest");
		
		DatabaseProtectionProxy dbProxy1 = new DatabaseProtectionProxy(user1);
		DatabaseProtectionProxy dbProxy2 = new DatabaseProtectionProxy(user2);
		
		try {
			System.out.println("Data: " + dbProxy1.executeQuery("UPDATE MsUser"));
			System.out.println("Data: " + dbProxy2.executeQuery("UPDATE MsUser"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testingCacheProxy() {
		DatabaseCacheproxy dbProxy = new DatabaseCacheproxy();
		
		try {
			System.out.println("Data: " + dbProxy.executeQuery("SELECT * FROM MsUser"));
			System.out.println("Data: " + dbProxy.executeQuery("SELECT * FROM MsUser"));
			System.out.println("Data: " + dbProxy.executeQuery("SELECT * FROM MsUser"));
			System.out.println("Data: " + dbProxy.executeQuery("SELECT * FROM MsUser"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testingVirtualProxy() {
		Image image = new Image("Dog.jpg");
		ImageVirtualProxy imageProxy = new ImageVirtualProxy("Cat.jpg"); 
		
		image.display();
		imageProxy.display();
	}

}
