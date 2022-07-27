
public class Client {
	
	private String name;
	private int age;
	private String gender;
	private float balance;
	
	// Constructors
	public Client (String client_name, String client_gender, int client_age) {
		name = client_name;
		age = client_age;
		gender = client_gender;
		balance = 0;
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
