import java.util.ArrayList;
import java.util.List;

/**
 * DepremKayit sınıfı - Deprem kayıtlarını yönetir
 */
public class DepremKayit {
    private List<Deprem> depremListesi;

    /**
     * DepremKayit yapıcı metodu - Boş bir deprem listesi oluşturur
     */
    public DepremKayit() {
        this.depremListesi = new ArrayList<>();
        // Örnek veriler ekle
        ornekVerileriEkle();
        System.out.println("Kayıtlar eklendi.");
    }

    /**
     * Sisteme örnek deprem verileri ekler
     */
    private void ornekVerileriEkle() {
        depremEkle(new Deprem("01.05.2023", "14:30", 4.2, "İzmir, Seferihisar", 7.5));
        depremEkle(new Deprem("15.06.2023", "08:45", 3.8, "Muğla, Bodrum", 5.2));
        depremEkle(new Deprem("22.07.2023", "23:15", 5.1, "Elazığ, Merkez", 12.3));
        depremEkle(new Deprem("10.08.2023", "11:20", 2.9, "Bursa, Gemlik", 4.8));
        depremEkle(new Deprem("05.09.2023", "17:55", 4.7, "Antalya, Kaş", 8.6));
    }

    /**
     * Listeye yeni bir deprem ekler
     * 
     * @param deprem Eklenecek deprem nesnesi
     */
    public void depremEkle(Deprem deprem) {
        depremListesi.add(deprem);
        System.out.println("Deprem kaydı başarıyla eklendi.");
    }

    /**
     * Tüm deprem kayıtlarını listeler
     */
    public void tumDepremleriListele() {
        if (depremListesi.isEmpty()) {
            System.out.println("Kayıtlı deprem bulunmamaktadır.");
            return;
        }

        System.out.println("\n----- TÜM DEPREM KAYITLARI -----");
        for (int i = 0; i < depremListesi.size(); i++) {
            System.out.println((i + 1) + ". " + depremListesi.get(i));
        }
        System.out.println("--------------------------------");
    }

    /**
     * Belirli bir büyüklüğün üzerindeki depremleri listeler
     * 
     * @param minBuyukluk Minimum deprem büyüklüğü
     */
    public void buyuklugeGoreListele(double minBuyukluk) {
        boolean bulundu = false;
        System.out.println("\n----- " + minBuyukluk + " VE ÜZERİ DEPREMLER -----");
        
        for (Deprem deprem : depremListesi) {
            if (deprem.getBuyukluk() >= minBuyukluk) {
                System.out.println(deprem);
                bulundu = true;
            }
        }
        
        if (!bulundu) {
            System.out.println(minBuyukluk + " büyüklüğünde veya üzerinde deprem kaydı bulunamadı.");
        }
        System.out.println("--------------------------------");
    }

    /**
     * Belirli bir konumdaki depremleri listeler
     * 
     * @param konum Aranacak konum
     */
    public void konumaGoreListele(String konum) {
        boolean bulundu = false;
        System.out.println("\n----- " + konum.toUpperCase() + " BÖLGESİNDEKİ DEPREMLER -----");
        
        for (Deprem deprem : depremListesi) {
            if (deprem.getKonum().toLowerCase().contains(konum.toLowerCase())) {
                System.out.println(deprem);
                bulundu = true;
            }
        }
        
        if (!bulundu) {
            System.out.println(konum + " bölgesinde deprem kaydı bulunamadı.");
        }
        System.out.println("--------------------------------");
    }

    /**
     * Deprem istatistiklerini gösterir
     */
    public void istatistikleriGoster() {
        if (depremListesi.isEmpty()) {
            System.out.println("İstatistik göstermek için kayıtlı deprem bulunmamaktadır.");
            return;
        }

        double toplamBuyukluk = 0;
        double enBuyuk = Double.MIN_VALUE;
        double enKucuk = Double.MAX_VALUE;
        Deprem enBuyukDeprem = null;

        for (Deprem deprem : depremListesi) {
            double buyukluk = deprem.getBuyukluk();
            toplamBuyukluk += buyukluk;
            
            if (buyukluk > enBuyuk) {
                enBuyuk = buyukluk;
                enBuyukDeprem = deprem;
            }
            
            if (buyukluk < enKucuk) {
                enKucuk = buyukluk;
            }
        }

        double ortalamaBuyukluk = toplamBuyukluk / depremListesi.size();

        System.out.println("\n----- DEPREM İSTATİSTİKLERİ -----");
        System.out.println("Toplam Kayıt: " + depremListesi.size());
        System.out.println("Ortalama Büyüklük: " + String.format("%.2f", ortalamaBuyukluk));
        System.out.println("En Büyük Deprem: " + String.format("%.1f", enBuyuk));
        System.out.println("En Küçük Deprem: " + String.format("%.1f", enKucuk));
        
        if (enBuyukDeprem != null) {
            System.out.println("\nEn Büyük Depremin Detayları:");
            System.out.println(enBuyukDeprem);
        }
        
        System.out.println("--------------------------------");
    }
}
