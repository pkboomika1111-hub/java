package compile1;

	import java.util.Scanner;

	public class SimpleBankingApplication {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double balance = 0.0;
	        boolean running = true;

	        while (running) {
	            System.out.println("\nSimple Banking Application");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to deposit: $");
	                    double depositAmount = scanner.nextDouble();
	                    if (depositAmount > 0) {
	                        balance += depositAmount;
	                        System.out.println("Deposited: $" + depositAmount);
	                    } else {
	                        System.out.println("Invalid deposit amount.");
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter amount to withdraw: $");
	                    double withdrawAmount = scanner.nextDouble();
	                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
	                        balance -= withdrawAmount;
	                        System.out.println("Withdrawn: $" + withdrawAmount);
	                    } else {
	                        System.out.println("Invalid withdrawal amount or insufficient balance.");
	                    }
	                    break;

	                case 3:
	                    System.out.println("Current balance: $" + balance);
	                    break;

	                case 4:
	                    System.out.println("Exiting the application.");
	                    running = false;
	                    break;

	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }

	        scanner.close();
	    }
	}


