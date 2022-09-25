package arrays;

public class Main {

	public static void main(String[] args) {

		String[] ogrenciler = new String[3];
		
		ogrenciler[0]="Can";
		ogrenciler[1]="Mahir";
		ogrenciler[2]="Yücel";

		System.out.println("for döngüsü");	


		for(int i=0;i<ogrenciler.length;i++) {
		System.out.println(ogrenciler[i]);	
		
		}
		System.out.println("for-each döngüsü");	
		
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);	
		}
		
		
		
	}

}
