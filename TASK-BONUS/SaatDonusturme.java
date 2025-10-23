public class SaatDonusturme {
    public static void main(String[] args) {
        //İlk önce saniye değerini tanımlayarak başlayalım.
        int saniye= 3665;
        //Buradan sonra saat, dakika ve kalan saniye belli olmadığı için onların değerlerini bulmak amacıyla gerekli işlemleri yaptım.
        int dakika= saniye/60;
        int saat = dakika/60;
        int kalan = dakika%60;
        int sonuc = saniye%60;
        //Şimdi ekrana yazdıralım.
        System.out.println(saat + ":" + kalan + ":" + sonuc);
    }
}
