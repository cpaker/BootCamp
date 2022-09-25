public class Main {

    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();

        int sonuc = dortIslem.Topla(3, 4);
        System.out.println(sonuc);

        int sonuc2 = dortIslem.Carp(33, 3);
        System.out.println(sonuc2);

        double sonuc3 = dortIslem.Bol(100, 33);
        System.out.println(sonuc3);

        int sonuc4 = dortIslem.Cikar(20, 10);
        System.out.println(sonuc4);
    }
}