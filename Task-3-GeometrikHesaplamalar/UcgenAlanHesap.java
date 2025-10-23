public class UcgenAlanHesap {

    public static void main(String[] args) {
        // Kenar uzunlukları
        int a = 3;
        int b = 4;
        int c = 5;

        // Yarı çevreyi hesaplama
        int s = (a + b + c) / 2;

        // 2. Alanı Heron formülü ile hesaplama
        // Math.sqrt() metodu karekök alma işlemini yapar.
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Sonucu ekrana yazdırma
        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Yarı Çevre: " + s);
        System.out.println("Alan: " + alan);
    }
}
