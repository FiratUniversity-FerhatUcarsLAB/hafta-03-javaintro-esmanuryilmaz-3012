public class ParaBozma {
    public static void main(String[] args) {
        // Önce bozulacak para miktarını yazdırıyoruz.
        int bozulacakMiktar= 278;
        System.out.println("Miktar: "+bozulacakMiktar);
        // Hangi banknottan kaçar tane olduğunu bulmak için gerekli matematiksel işlemleri yaptırıyoruz.
        int sonuc = bozulacakMiktar/100;
        int kalan = bozulacakMiktar%100;
        int sonuc1 = kalan/50;
        int kalan1 = kalan%50;
        int sonuc2 = kalan1/20;
        int kalan2 = kalan1%20;
        int sonuc3 = kalan2/10;
        int kalan3 = kalan2%10;
        int sonuc4 = kalan3/5;
        int kalan4 = kalan3%5;
        int sonuc5 = kalan4/1;
        int kalan5 = kalan4%1;
        //Şimdi ise sadece ekrana yazdırmak kaldı. (niyeyse ekrana yazdırmaya çalışmak kodu yazmaktan daha uzun sürdü T~T)
        System.out.println(bozulacakMiktar + "TL=" + sonuc + "x100," + sonuc1 + "x50," + sonuc2 + "x20," + sonuc3 + "x10," + sonuc4 + "x5," + sonuc5 + "x1");
    }
}
