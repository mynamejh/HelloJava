package co.edu.emp.list;

public class RectPrint {
	public static void main(String[] args) {
		int num = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", num = i + (j * 5));
			}
			System.out.println();
		}
		System.out.println();
		// #세로 계산!
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 26; j = j + 5) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}
}
