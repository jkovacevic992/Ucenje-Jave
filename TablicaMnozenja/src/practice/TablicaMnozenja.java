package practice;

public class TablicaMnozenja {
	public static void main(String[] args) {
		System.out.format("%31s", "TABLICA MNOŽENJA");
		System.out.println();
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				System.out.format("%-5s", x * y + " ");
			}
			System.out.println();
		}
	}
}
