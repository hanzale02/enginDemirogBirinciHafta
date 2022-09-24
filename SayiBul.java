package enginDemirogProjeleri;

public class SayiBul {

	public static void main(String[] args) {

		int[] sayilar = { 1, 2, 3, 4, 5, 6, 0 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;

			}
		}

		if (varMi == true) {
			System.out.println("Sayı Mevcuttur.");

		} else {
			System.out.println("sayı yoktur.");
		}
	}
}
