/**
 * Deprem sınıfı - Bir depremin temel özelliklerini içerir
 */
public class Deprem {
    private String tarih;
    private String saat;
    private double buyukluk;
    private String konum;
    private double derinlik;

    /**
     * Deprem sınıfı yapıcı metodu
     * 
     * @param tarih    Depremin gerçekleştiği tarih
     * @param saat     Depremin gerçekleştiği saat
     * @param buyukluk Depremin büyüklüğü (Richter ölçeği)
     * @param konum    Depremin konumu
     * @param derinlik Depremin derinliği (km)
     */
    public Deprem(String tarih, String saat, double buyukluk, String konum, double derinlik) {
        this.tarih = tarih;
        this.saat = saat;
        this.buyukluk = buyukluk;
        this.konum = konum;
        this.derinlik = derinlik;
    }

    // Getter ve Setter metodları
    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public double getBuyukluk() {
        return buyukluk;
    }

    public void setBuyukluk(double buyukluk) {
        this.buyukluk = buyukluk;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public double getDerinlik() {
        return derinlik;
    }

    public void setDerinlik(double derinlik) {
        this.derinlik = derinlik;
    }

    /**
     * Deprem bilgilerini düzenli bir şekilde döndürür
     */
    @Override
    public String toString() {
        return String.format("Tarih: %s | Saat: %s | Büyüklük: %.1f | Konum: %s | Derinlik: %.1f km",
                tarih, saat, buyukluk, konum, derinlik);
    }
}
