package main;
import java.util.ArrayList;
import java.util.Scanner;

import adapters.CryptoToCashAdapter;
import adapters.TransferToCashAdapter;
import database.Database;
import factory.CakeFactory;
import factory.CupcakeFactory;
import factory.TartFactory;
import models.Cake;
import models.Cupcake;
import payments.Cash;
import payments.Crypto;
import payments.Transfer;

public class Main {
	Scanner sc = new Scanner(System.in);
	Database db = Database.getDb();
	
	void menu() {
		System.out.println("Nom Nom Co.");
		System.out.println("=================");
		System.out.println("1. Bake Confectionary");
		System.out.println("2. View Confectionary Order");
		System.out.println("3. Exit");
		System.out.print(">>");
	}
	
	public void enterToContinue() {
		System.out.println("Enter to continue");
		sc.nextLine();
	}
	
	public void addTopping() {
		
	}
	
	public void bakeConfectionarry() {
		String type = "";
		String name = "";
		String softness = "";
		String checkTopping = "";
		boolean hasTopping = false;
		String topping1 = "";
		String topping2 = "";
		String topping3 = "";
		double price = 0.0;
		String paymentType = "";
		
		
		while(!type.equals("Cupcake") && !type.equals("Tart" ) ) {
			System.out.print("Input confectionary type [Cupcake | Tart][Case Sensitive]: ");
			type = sc.nextLine();
		}
		
		while(name.length() < 5 || name.length() > 15) {
			System.out.print("Input confectionary name [length between 5 - 15]: ");
			name = sc.nextLine();
		}
		
		while(!softness.equals("Fluffy") && !softness.equals("Medium") && !softness.equals("Hard")) {
			System.out.print("Input confectionary softness [Fluffy | Medium | Hard][Case Sensitive]: ");
			softness = sc.nextLine();
		}
		
		while(!checkTopping.equals("Y") && !checkTopping.equals("N")) {
			System.out.print("Adding additional topping [Y | N][Case Sensitive]");
			checkTopping = sc.nextLine();
		}
		
		if(checkTopping.equals("Y")) {
			hasTopping = true;
		}
		
		if(hasTopping) {
			while(topping1.length() < 1 || topping1.length() > 10) {
				System.out.print("Input topping 1[length between 1 - 10]: ");
				topping1 = sc.nextLine();
			}
			
			while(topping2.length() < 1 || topping2.length() > 10) {
				System.out.print("Input topping 1[length between 1 - 10]: ");
				topping2 = sc.nextLine();
			}
			
			while(topping3.length() < 1 || topping3.length() > 10) {
				System.out.print("Input topping 1[length between 1 - 10]: ");
				topping3 = sc.nextLine();
			}
		}else {
			topping1 = null;
			topping2 = null;
			topping3 = null;
		}
		
		while(price < 10.0 || price > 50.0) {
			System.out.print("input confectionary price [10.0 - 50.0]");
			price = sc.nextDouble();
			sc.nextLine();
		}
		
		while(!paymentType.equals("Cash") && !paymentType.equals("Transfer") && !paymentType.equals("Crypto")) {
			System.out.print("What kind of payment [Cash | Transfer | Crypto]: ");
			paymentType = sc.nextLine();
		}
		
		System.out.println("Confectionary baked!");
		Cake newCake = null;
		CakeFactory factory;
		
		if(type.equals("Cupcake")) {
			factory = new CupcakeFactory();
			if(paymentType.equals("Cash")) {
				newCake = factory.create(type, name, softness, checkTopping, hasTopping, topping1, topping2, topping3, price, paymentType, new Cash(price));
			}else if(paymentType.equals("Crypto")) {
				newCake = factory.create(type, name, softness, checkTopping, hasTopping, topping1, topping2, topping3, price, paymentType, new Crypto(price));
			}else if(paymentType.equals("Transfer")) {
				newCake = factory.create(type, name, softness, checkTopping, hasTopping, topping1, topping2, topping3, price, paymentType, new Transfer(price));
			}
		}else {
			factory = new TartFactory();
			if(paymentType.equals("Cash")) {
				newCake = factory.create(type, name, softness, checkTopping, hasTopping, topping1, topping2, topping3, price, paymentType, new Cash(price));
			}else if(paymentType.equals("Crypto")) {
				newCake = factory.create(type, name, softness, checkTopping, hasTopping, topping1, topping2, topping3, price, paymentType, new Crypto(price));
			}else if(paymentType.equals("Transfer")) {
				newCake = factory.create(type, name, softness, checkTopping, hasTopping, topping1, topping2, topping3, price, paymentType, new Transfer(price));
			}
		}
		
		db.addCake(newCake);
	}
	
	public void showConfentionary() {
		ArrayList<Cake> cakeList = db.getCakeList();
		if(cakeList.size() == 0) {
			System.out.println("=====================");
			System.out.println("confentionary data still empty!");
			enterToContinue();
			return;
		}
		
		for(int i = 0; i < cakeList.size(); i++) {
			printConfentionary(cakeList.get(i));
			System.out.println("=======================");
		}
		
		enterToContinue();
	}
	
	public void printConfentionary(Cake cake) {
		String type;

		if (cake instanceof Cupcake) {
			type = "Cupcake";
		} else {
			type = "Tart";
		}

		System.out.println("Name        : " + cake.getName() + " (" + type + ")");
		System.out.println("Softness    : " + cake.getSoftness());
		System.out.print("Topping     : ");
		
		if (!cake.isHasTopping()) {
			System.out.println("-");
		} else {
			System.out.println(cake.getTopping1() + " " + cake.getTopping2() + " "
					+ cake.getTopping3());
		}
		
		System.out.print("PaymentType : ");
		if(cake.getPaymentType().equals("Transfer")) {
			TransferToCashAdapter transferToCash = new TransferToCashAdapter((Transfer) cake.getPayment());
			System.out.println("");
			System.out.print("Price       : ");
			transferToCash.showPaymentInfo();
		}else if(cake.getPaymentType().equals("Crypto")) {
			CryptoToCashAdapter cryptoToCash = new CryptoToCashAdapter((Crypto) cake.getPayment());
			System.out.println("");
			System.out.print("Price       : ");
			cryptoToCash.showPaymentInfo();
		}else {
			System.out.println(cake.getPaymentType());
			System.out.print("Price       : ");
			System.out.println(cake.getPrice());
		}
	}
	
	public Main() {
		int choice = -1;
		while(true) {
			menu();
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				bakeConfectionarry();
			}else if(choice == 2) {
				showConfentionary();
			}else if(choice == 3){
				break;
			}else {
				System.out.println("Invalid input!");
				enterToContinue();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
