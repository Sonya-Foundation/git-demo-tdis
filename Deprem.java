/**
 * Deprem sınıfı - Bir depremin temel özelliklerini içerir
 */
public class Deprem {
    private String depremTarihi;
    private String depremSaati;
    private double depremBuyuklugu;
    private String depremKonumu;
    private double depremDerinligi;

    /**
     * Deprem sınıfı yapıcı metodu
     * 
     * @param depremTarihi    Depremin gerçekleştiği tarih
     * @param depremSaati     Depremin gerçekleştiği saat
     * @param depremBuyuklugu Depremin büyüklüğü (Richter ölçeği)
     * @param depremKonumu    Depremin konumu
     * @param depremDerinligi Depremin derinliği (km)
     */
    public Deprem(String depremTarihi, String depremSaati, double depremBuyuklugu, String depremKonumu, double depremDerinligi) {
        this.depremTarihi = depremTarihi;
        this.depremSaati = depremSaati;
        this.depremBuyuklugu = depremBuyuklugu;
        this.depremKonumu = depremKonumu;
        this.depremDerinligi = depremDerinligi;
    }

    // Getter ve Setter metodları
    public String getDepremTarihi() {
        return depremTarihi;
    }

    public void setDepremTarihi(String depremTarihi) {
        this.depremTarihi = depremTarihi;
    }

    public String getDepremSaati() {
        return depremSaati;
    }

    public void setDepremSaati(String depremSaati) {
        this.depremSaati = depremSaati;
    }

    public double getDepremBuyuklugu() {
        return depremBuyuklugu;
    }

    public void setDepremBuyuklugu(double depremBuyuklugu) {
        this.depremBuyuklugu = depremBuyuklugu;
    }

    public String getDepremKonumu() {
        return depremKonumu;
    }

    public void setDepremKonumu(String depremKonumu) {
        this.depremKonumu = depremKonumu;
    }

    public double getDepremDerinligi() {
        return depremDerinligi;
    }

    public void setDepremDerinligi(double depremDerinligi) {
        this.depremDerinligi = depremDerinligi;
    }

    /**
     * Deprem bilgilerini düzenli bir şekilde döndürür
     */
    @Override
    public String toString() {
        return String.format("Tarih: %s | Saat: %s | Büyüklük: %.1f | Konum: %s | Derinlik: %.1f km",
                depremTarihi, depremSaati, depremBuyuklugu, depremKonumu, depremDerinligi);
    }
}
