package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Chef;
import state.ChefIdleState;

public class Main {
	
	public static void addChef(ArrayList<Chef> chefList) {
		Scanner sc = new Scanner(System.in);
		String newChefName;
		int age;
		do {
			System.out.print("Masukan nama Chef [4-20 char]: ");
			newChefName = sc.nextLine();
		} while (newChefName.length() < 4 || newChefName.length() > 20);
		do {
			System.out.print("Masukan umur chef [18-45]: ");
			age = sc.nextInt();
			sc.nextLine();
		} while (age < 18 || age > 45);
		Chef newChef = new Chef(newChefName, age);
		chefList.add(newChef);
		System.out.println("Inserted new chef !");
	}
	
	public static void orderFood(ArrayList<Chef> chefList) {
		for (int i = 0; i < chefList.size(); i++) {
			Chef c = chefList.get(i);
			System.out.println(i + " " + c.getName());
		}
		System.out.print("Input chef id = ");
		int option;
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		sc.nextLine();
		Chef c = chefList.get(option);
		if(c.getCurr_state() instanceof ChefIdleState) {
			do {
				c.getCurr_state().changeState();
			} while (c.getCurr_state() instanceof ChefIdleState == false);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int options = -1;
		Scanner scan = new Scanner(System.in);
		ArrayList<Chef> chefList = new ArrayList<>();
		do {
			System.out.println("======SRestaurant=======");
			System.out.println("1. Add new Chef");
			System.out.println("2. Order food");
			System.out.println("3. Exit");
			System.out.print(">>");
			options = scan.nextInt();
			scan.nextLine();
			if(options == 1) {
				addChef(chefList);
			}else if(options == 2) {
				orderFood(chefList);
			}
		} while (options != 3);
	}

}
