import java.util.Scanner;

public class bankmain {
	public static int menu() {
		Scanner in = new Scanner (System.in);
		System.out.println("What do you wish to do?");
		System.out.println("1: Become a User");
		System.out.println("2: Withdraw Funds");
		System.out.println("3: Add Funds");
		System.out.println("4: Quit");
		System.out.println("> ");
		int choice = in.nextInt();
		return choice;
	}
	
	public static void print_clients (Client[] list) {
		for (int i = 0; i<list.length; i++) {
			System.out.println("Client " + list[i].get_name() + " Details");
			System.out.println("Gender: " + list[i].get_gender());
			System.out.println("Age: " + list[i].get_age());
			System.out.println("Balance: $" + list[i].get_balance());
			System.out.println("------------------------------------");
		}
	}
	
	// Will return index of location of person
	public static int search (String name, Client[] x) {
		int index = -1;
		
		for (int i = 0; i<x.length; i++) {
			if (name.equals(x[i].get_name())) {
				index = i;
			}
		}
		return index;
	}
	
	// TO DO
	// Commenting
	// Pin code
	// Search and avoid duplicate names 
	// Maybe do some file IO to keep track of the names
	// and save it to a file you can read through
	
	
	public static boolean pin_check (Client x) {
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int option;
		Client[] client_list = new Client[0];
		
		System.out.println("Welcome to the Bank!");
		System.out.println("-------------------------------------");
		
		do {
			option = menu();
			if (option == 1) {	
				System.out.println("Enter Name: ");
				String name = in.next();
				System.out.println("Enter Gender: ");
				String gender = in.next();
				System.out.println("Enter Age: ");
				int age = in.nextInt();
				while (age<16) {
					System.out.println("Please enter a valid age: ");
					age = in.nextInt();
				}

				Client[] temp = new Client [client_list.length+1];
				
				for (int i = 0; i<client_list.length; i++) {
					temp[i] = client_list[i];
				}
				
				temp[client_list.length] = new Client(name, gender, age); 
				client_list = temp;

				System.out.println("You have been successfully added to the system!");
			}
			else if (option == 2) {
				System.out.println("Enter your name: ");
				String name = in.next();
				int index = search(name, client_list);
				
				if (index == -1) {
					System.out.println("Your name cannot be found! Please Try Again!");
				}
				else {
					System.out.println("Hi " + name + "!");
					System.out.println("Current Balance: $" + client_list[index].get_balance());
					System.out.println("Enter the amount you would like to withdraw: ");
					float amount = in.nextFloat();
					float balance = client_list[index].withdraw_funds(amount);
					System.out.println("Current Balance: $" + balance);
				}
			}
			else if (option == 3) {
				System.out.println("Enter your name: ");
				String name = in.next();
				int index = search(name, client_list);
				
				if (index == -1) {
					System.out.println("Your name cannot be found! Please Try Again!");
				}
				else {
					System.out.println("Hi " + name + "!");
					System.out.println("Current Balance: $" + client_list[index].get_balance());
					System.out.println("Enter the amount you would like to add: ");
					float amount = in.nextFloat();
					float balance = client_list[index].add_funds(amount);
					System.out.println("Current Balance: $" + balance);
				}
			}
			else if (option == 4) {
				
			}
			else {
				System.out.println("Invalid option please try again!");
			}	
		} while (option!=4);
	
		System.out.println("Please Come Again!");
		
	}

}
