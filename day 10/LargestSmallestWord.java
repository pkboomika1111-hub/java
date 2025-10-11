package compile1;

	import java.util.Scanner;
	public class LargestSmallestWord {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a sentence:");
	String s = scanner.nextLine();

	String[] words = s.split("\\s+");
	String smallest = words[0];
	String largest = words[0];

	for (String word : words) {
	if (word.length() < smallest.length()) {
	smallest = word;
	}
	if (word.length() > largest.length()) {
	largest = word;
	}
	}

	System.out.println("Smallest word: " + smallest);
	System.out.println("Largest word: " + largest);

	scanner.close();
	}
	}

	

	