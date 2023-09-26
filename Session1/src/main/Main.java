package main;

import java.util.ArrayList;
import java.util.Scanner;

import sushi.MakiSushi;
import sushi.NigiriSushi;
import sushi.Sushi;
import sushi.ToySushi;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	//yang di dalam <> = tipe data yang di simpen di array list
	ArrayList<Sushi> sushiList = new ArrayList<>();
	
	void createSushiMenu() {
		System.out.println("Menu 1 - Sushi Creation");
		//name, price
		String name = "";
		do {
			System.out.print("Input sushi name [min. 3 char]: ");
			name = scan.nextLine();
		} while (name.length() < 3);
		
		int price;
		do {
			System.out.print("Input sushi price: ");
			price = scan.nextInt();
			scan.nextLine();
		} while (price < 1000);
		
		String type = "";
		do {
			System.out.print("Input sushi type [maki | nigiri | toy]: ");
			type = scan.nextLine();
		} while (!type.equals("maki") && !type.equals("nigiri") && !type.equals("toy"));
		
		Sushi sushi = null;
		if(type.equals("maki")){
			sushi = new MakiSushi(name, price);
		}else if(type.equals("nigiri")) {
			sushi = new NigiriSushi(name, price);
		}else if(type.equals("toy")) {
			sushi = new ToySushi(name, price);
		}
		
		System.out.println("Created sushi: " + name + " IDR" + price + "\n\n");
		
		sushiList.add(sushi);
		System.out.println("Created sushi: " + sushi.getName() + " IDR" + sushi.getPrice());
	}
	
	void showSushiMenu() {
		System.out.println("Menu 2 - Sushi Showcase");
		int i = 1;
		//class, sebutan object, dan list nya yang mana
		for (Sushi sushi : sushiList) {
			System.out.println(i + ". " + sushi.getName() + " IDR" + sushi.getPrice());
			
			if(sushi instanceof ToySushi) {
				((ToySushi) sushi).hugSushi();
			}
			i++;
		}
	}
	
	void mainMenu() {
		int choice = -1;
		
		while(choice != 0) {
			System.out.println("Sushi Program");
			System.out.println("1. Create Sushi Menu");
			System.out.println("2. Show Sushi Menu");
			System.out.println("0. Exit");
			System.out.print(">>");
			
			choice = scan.nextInt();
			scan.nextLine();
			System.out.println("The chosen menu: menu " + choice + "\n");
			if(choice == 1) {
				createSushiMenu();
			}else if(choice == 2) {
				showSushiMenu();
			}			
		}

	}
	
	public Main() {
		System.out.println("Ini constructor");
		
		mainMenu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syso + ctrl + space buat SOUT
		
		new Main();
	}

}
