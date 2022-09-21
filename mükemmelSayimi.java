package enginDemirogProjeleri;

public class mükemmelSayimi {

	public static void main(String[] args) {
int toplam =0;
int sayi =6;
for ( int i =1; i<sayi; i++) {
	if (sayi %i ==0) { toplam = toplam +i;
		
	} }
	if ( toplam == sayi ) {
		System.out.println("mükemmel sayıdır");
	}
	else { System.out.println("mükemmel sayı değildir");
	}

	}

}
