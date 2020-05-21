package algorithm.study;

public class Recursive {

	public static void print(int n) {
		if (n >= 10) {
			print(n / 10);
		}
		System.out.println(n % 10);

	}

	public static void main(String[] args) {

		Recursive.print(48987);
	}
}
