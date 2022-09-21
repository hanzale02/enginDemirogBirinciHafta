package veriTipleri;

public class switchCases {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A' :
			System.out.println("Mükemmel : Geçtiniz"); 
			break;
			
		case 'B' :
			System.out.println("Çok iyi : Geçtiniz");
			break;

		case 'C' :
			System.out.println("Orta : Geçtiniz");
			break;

		case 'D' :
			System.out.println("Kötü : Geçtiniz");
			break;

		case 'F' :
			System.out.println("Çok Kötü : Geçtiniz");
			break;

		default: System.out.println("Geçersiz not girdiniz");
		break;
			
		}
	}

}
