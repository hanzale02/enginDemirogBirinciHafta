
public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		String [] [] sehirler = new String [ 3] [3 ];
		sehirler [0] [0]= "istanbul";
		sehirler [0] [1]= "yalova";
		sehirler [0] [2]= "bursa";
		sehirler [1] [0]= "konya";
		sehirler [1] [1]= "karaman";
		sehirler [1] [2]= "kırşehir";
		sehirler [2] [0]= "adıyaman";
		sehirler [2] [1]= "urfa";
		sehirler [2] [2]= "antep";

		for (int i =0; i <=2; i++) {
			System.out.println("***********");
			for ( int j =0 ; j<=2 ; j++) {
				System.out.println(sehirler[i] [j]);
			}
		}
		System.out.println("***********");
	}

}
