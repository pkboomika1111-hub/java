package compile1;

public class CharCount {
	
		public static void main(String[] args) {
		String s = "Hello world";
		int count = 0;
		for (char c : s.toCharArray()) {
		if (c != ' ') {
		count++;
		}
		}
		System.out.println(count);
		}
		}


