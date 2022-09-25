package dataType;

public class Main {

	public static void main(String[] args) {
		
		
// sayısal veriler -->
		
		byte     kucukVeri   = -128;
		byte     kucukVeri2  = 127;        // -128 ile 127 sınırları     //1 byte
		
		short    kısaVeri    = -32768;      //2 byte
		short    kısaVeri2   = 32767;
		
		int      buyukVeri   = -2147483648;
		int      buyukVeri2  = 2147483647;  // 4 byte
		
		long     uzunVeri    = -922337203;  //8byte
		     
		float    ondalikSayi = -3 ;      //4 byte
		double   ondalik2    = 13.2;     //8 byte
		
		// metinsel veriler
		
		char     karakter    = 'A'  ;           // unicode tutar
		String   mesaj       = "Char topluluğu";
		
		
		
		boolean  isIt       = true;       //    0-1   doğru-yanlış   
	}

}
