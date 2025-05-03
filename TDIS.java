import java.util.Scanner;

/**
 * TDIS (Türkiye Deprem İzleme Sistemi) Ana Sınıfı
 * Bu sınıf, kullanıcı arayüzünü ve ana program akışını yönetir
 */
public class TDIS {
    private static Scanner scanner = new Scanner(System.in);
    private static DepremKayit depremKayit = new DepremKayit();

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("  TÜRKİYE DEPREM İZLEME SİSTEMİ (TDIS)");
        System.out.println("===========================================");
        
        boolean devam = false;
        
        while (devam) {
            menuGoster();
            int secim = kullaniciSeciminiAl();
            
            switch (secim) {
                case 1:
                    yeniDepremEkle();
                    break;
                case 2:
                    depremKayit.tumDepremleriListele();
                    break;
                case 3:
                    buyuklugeGoreAra();
                    break;
                case 4:
                    konumaGoreAra();
                    break;
                case 5:
                    depremKayit.istatistikleriGoster();
                    break;
                case 0:
                    devam = false;
                    System.out.println("Programdan çıkılıyor. İyi günler!");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
            
            if (devam) {
                System.out.println("\nDevam etmek için ENTER tuşuna basın...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }

    /**
     * Ana menüyü gösterir
     */
    private static void menuGoster() {
        System.out.println("\n----- TDIS ANA MENÜ -----");
        System.out.println("1. Yeni Deprem Kaydı Ekle");
        System.out.println("2. Tüm Depremleri Listele");
        System.out.println("3. Büyüklüğe Göre Deprem Ara");
        System.out.println("4. Konuma Göre Deprem Ara");
        System.out.println("5. Deprem İstatistiklerini Göster");
        System.out.println("0. Çıkış");
        System.out.print("Seçiminiz: ");
    }

    /**
     * Kullanıcıdan menü seçimini alır
     * 
     * @return Kullanıcının seçimi
     */
    private static int kullaniciSeciminiAl() {
        try {
            int secim = Integer.parseInt(scanner.nextLine());
            return secim;
        } catch (NumberFormatException e) {
            return -1; // Geçersiz giriş
        }
    }

    /**
     * Kullanıcıdan yeni deprem bilgilerini alır ve sisteme ekler
     */
    private static void yeniDepremEkle() {
        System.out.println("\n----- YENİ DEPREM KAYDI -----");
        
        System.out.print("Tarih (GG.AA.YYYY): ");
        String tarih = scanner.nextLine();
        
        System.out.print("Saat (SS:DD): ");
        String saat = scanner.nextLine();
        
        double buyukluk = 0;
        boolean gecerliBuyukluk = false;
        while (!gecerliBuyukluk) {
            System.out.print("Büyüklük (Richter): ");
            try {
                buyukluk = Double.parseDouble(scanner.nextLine());
                gecerliBuyukluk = true;
            } catch (NumberFormatException e) {
                System.out.println("Hata: Geçerli bir sayı giriniz!");
            }
        }
        
        System.out.print("Konum (İl, İlçe): ");
        String konum = scanner.nextLine();
        
        double derinlik = 0;
        boolean gecerliDerinlik = false;
        while (!gecerliDerinlik) {
            System.out.print("Derinlik (km): ");
            try {
                derinlik = Double.parseDouble(scanner.nextLine());
                gecerliDerinlik = true;
            } catch (NumberFormatException e) {
                System.out.println("Hata: Geçerli bir sayı giriniz!");
            }
        }
        
        Deprem yeniDeprem = new Deprem(tarih, saat, buyukluk, konum, derinlik);
        depremKayit.depremEkle(yeniDeprem);
    }

    /**
     * Kullanıcıdan minimum büyüklük değeri alır ve o büyüklüğün üzerindeki depremleri listeler
     */
    private static void buyuklugeGoreAra() {
        System.out.print("\nMinimum deprem büyüklüğünü girin: ");
        try {
            double minBuyukluk = Double.parseDouble(scanner.nextLine());
            depremKayit.buyuklugeGoreListele(minBuyukluk);
        } catch (NumberFormatException e) {
            System.out.println("Hata: Geçerli bir sayı giriniz!");
        }
    }

    /**
     * Kullanıcıdan konum bilgisi alır ve o konumdaki depremleri listeler
     */
    private static void konumaGoreAra() {
        System.out.print("\nAramak istediğiniz konumu girin (İl veya ilçe): ");
        String konum = scanner.nextLine();
        depremKayit.konumaGoreListele(konum);
    }
}
