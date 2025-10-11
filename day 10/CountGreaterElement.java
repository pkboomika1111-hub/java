package compile1;
	import java.util.Scanner;

	public class CountGreaterElement {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	int N = scanner.nextInt();
	int[] Arr = new int[N];
	for (int i = 0; i < N; i++) {
	Arr[i] = scanner.nextInt();
	}

	int count = 1; // First element always counted
	int max = Arr[0];

	for (int i = 1; i < N; i++) {
	if (Arr[i] > max) {
	count++;
	max = Arr[i];
	}
	}

	System.out.println(count);
	scanner.close();
	}
	}
	