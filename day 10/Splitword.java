package compile1;
import java.util.Scanner;
public class Splitword {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a sentence:");
	String s = scanner.nextLine();

	String[] words = s.split("\\s+");
	for (String word : words) {
	if (word.length() % 2 == 0) {
	System.out.println(word);
	}
	}
	scanner.close();
	}
	}

