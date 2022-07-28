import java.util.Random;
public class Client {
	Random r = new Random();
	
	private String name;
	private int age;
	private String gender;
	private float balance;
	private int pin;
	
	// Constructors
	public Client (String client_name, String client_gender, int client_age, int client_pin) {
		name = client_name;
		age = client_age;
		gender = client_gender;
		balance = 0;
		pin = client_pin;
	}
	
	// Accessors
	public float get_balance () {
		return balance;
	}
	
	public String get_name() {
		return name;
	}
	
	public int get_age() {
		return age;
	}
	
	public String get_gender() {
		return gender;
	}
	
	public int get_pin () {
		return pin;
	}
	
	// Mutators
	public float add_funds (float amount) {
		balance = balance + amount;
		return balance;
	}
	
	public float withdraw_funds (float amount) {
		if (amount > balance) {
			System.out.println("Withdraw cannot be completeted");
			System.out.println("Problem: Insufficient Funds");
		}
		else {
			System.out.println("Withdraw has been successfully completed");
			balance = balance - amount;	
		}
		return balance;
	}
	
}
