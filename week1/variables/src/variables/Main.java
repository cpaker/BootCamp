package variables;

public class Main {

	public static void main(String[] args) {
		System.out.println("Öğrenci sayım : 10");
		System.out.println("Öğrenci sayım : 11");
		System.out.println("Öğrenci sayım : 12");
		
		//reusability açısından uygun değil
		
		int ogrenciSayim = 12;       //camelcasing
		
		System.out.println("Öğrenci sayısı : " + ogrenciSayim);
		
		String mesaj = "Öğrenci sayısı : ";
		
		System.out.println(mesaj + ogrenciSayim);     
		
		
	}

}
