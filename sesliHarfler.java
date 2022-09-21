package enginDemirogProjeleri;

public class sesliHarfler {

	public static void main(String[] args) {
char harf = 'E';

switch (harf) {
case 'A':
case 'O': 
case 'I': 
case 'U': 
	System.out.println("Kalın sesli harflerdir"); break;
	
case 'E': 
case 'İ': 
case 'Ö': 
case 'Ü': 
System.out.println("ince sesli harflerdir"); 
break;

default: System.out.println("Lütfen uygun bir değer giriniz. ");


}

	}

}
