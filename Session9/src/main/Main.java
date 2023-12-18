package main;

import java.util.Scanner;

import object.Customer;
import object.Promo;
import observer.RegularCustomer;
import observer.VIPCustomer;
import publisher.Restaurant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant res = new Restaurant();
		int opt;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("== Burger Resto ==");
			System.out.println("1. Add Subscriber");
			System.out.println("2. Remove Subscriber");
			System.out.println("3. Notify Subscriber");
			System.out.println("4. Exit");
			opt = scan.nextInt();
			scan.nextLine();
			if(opt == 1) {
				String name;
				int type;
				System.out.println("Input name: ");
				name = scan.nextLine();
				System.out.println("Input type: (1 for regular and 2 for VIP)");
				type = scan.nextInt();
				scan.nextLine();
				Customer newCust = null;
				if(type == 1) {
					newCust = new RegularCustomer(name);
				}else if(type == 2) {
					newCust = new VIPCustomer(name);
				}
				res.addSubscriber(newCust);
				System.out.println("Added new customer!");
				//add subscriber
			}else if(opt == 2) {
				String name;
				int type;
				System.out.println("Input name: ");
				name = scan.nextLine();
				System.out.println("Input type: (1 for regular and 2 for VIP)");
				type = scan.nextInt();
				scan.nextLine();
				Customer newCust = null;
				if(type == 1) {
					newCust = new RegularCustomer(name);
				}else if(type == 2) {
					newCust = new VIPCustomer(name);
				}
				res.removeSubscriber(newCust);
				System.out.println("Removed customer!");
				//remove subscriber
			}else if(opt == 3) {
				//notify subscriber
				String name;
				String content;
				int type;
				System.out.println("Input promo name: ");
				name = scan.nextLine();
				System.out.println("Input promo content: ");
				content = scan.nextLine();
				System.out.println("Input type: (1 for all and 2 for VIP)");
				type = scan.nextInt();
				scan.nextLine();
				
				Promo newPromo = new Promo(name, content);
				res.notifySubscriber(newPromo, type);
			}
		} while (opt != 4);
	}

}
