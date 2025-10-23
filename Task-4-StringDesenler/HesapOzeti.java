public class HesapOzeti {

            public static void main(String[] args) {

                // Alışveriş listesi verileri
                String[] urunler = {"defter", "Kitap çıktısı", "Tükenmez kalem"};
                int[] miktarlar = {2, 1, 3}; // Adet
                double[] fiyatlar = {44.99, 160.0, 25.5}; // Birim fiyat (TL)

                double genelToplam = 0.0;

                // ----------------------------------------------------------------------
                // 1. Başlıkları Yazdırma
                // %-20s: 20 karakter sola hizalı string (metin)
                // %-10s: 10 karakter sola hizalı string
                // %10s: 10 karakter sağa hizalı string
                System.out.printf("+%s+%s+%s+%s+\n",
                        "-".repeat(20), "-".repeat(10), "-".repeat(10), "-".repeat(15)
                );
                System.out.printf("| %-18s | %-8s | %8s | %13s |\n",
                        "ÜRÜN", "MİKTAR", "BİRİM FİYAT", "TOPLAM"
                );
                System.out.printf("+%s+%s+%s+%s+\n",
                        "-".repeat(20), "-".repeat(10), "-".repeat(10), "-".repeat(15)
                );

                // ----------------------------------------------------------------------
                // 2. Liste İçeriğini Döngü ile Yazdırma
                for (int i = 0; i < urunler.length; i++) {

                    double satirToplami = miktarlar[i] * fiyatlar[i];
                    genelToplam += satirToplami;

                    // %-18s: Ürün adı (Sola hizalı)
                    // %-8d: Miktar (Sola hizalı tamsayı)
                    // %10.2f: Birim Fiyat (Sağa hizalı, 2 ondalık basamaklı double)
                    // %13.2f: Toplam Fiyat (Sağa hizalı, 2 ondalık basamaklı double)
                    System.out.printf("| %-18s | %-8d | %8.2f TL | %11.2f TL |\n",
                            urunler[i], miktarlar[i], fiyatlar[i], satirToplami
                    );
                }

                // ----------------------------------------------------------------------
                // 3. Alt Toplam ve Çizgileri Yazdırma
                System.out.printf("+%s+%s+%s+%s+\n",
                        "-".repeat(20), "-".repeat(10), "-".repeat(10), "-".repeat(15)
                );

                // Genel Toplam Satırı
                // %-31s: Genel Toplam metni için boşluk ve hizalama
                // %11.2f: Genel Toplam değeri (Sağa hizalı)
                System.out.printf("| %-42s | %11.2f TL |\n", "GENEL TOPLAM:", genelToplam);
                System.out.printf("+%s+%s+%s+%s+\n",
                        "-".repeat(20), "-".repeat(10), "-".repeat(10), "-".repeat(15)
                );
            }
        }
