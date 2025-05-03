# Türkiye Deprem İzleme Sistemi (TDIS)

## Proje Hakkında

TDIS (Türkiye Deprem İzleme Sistemi), Türkiye ve çevre bölgelerdeki sismik aktiviteleri izleyen, analiz eden ve kullanıcılara bilgi sunan basit bir Java konsol uygulamasıdır. Bu proje, özellikle Git ve ekip çalışması konusunda deneyim kazanmak isteyen yazılımcılar için eğitim amaçlı hazırlanmıştır.

![Deprem İzleme](https://placeholder.svg?height=200&width=600&query=Türkiye+Deprem+İzleme+Sistemi)

## İçindekiler

- [Proje Özellikleri](#proje-özellikleri)
- [Geliştirme Ortamının Kurulumu](#geliştirme-ortamının-kurulumu)
- [Git ile Çalışma](#git-ile-çalışma)
- [Proje Yapısı](#proje-yapısı)
- [Ekip Çalışması İş Akışı](#ekip-çalışması-iş-akışı)
- [Görev Dağılımı](#görev-dağılımı)
- [Sık Karşılaşılan Sorunlar ve Çözümleri](#sık-karşılaşılan-sorunlar-ve-çözümleri)

## Proje Özellikleri

TDIS aşağıdaki temel özelliklere sahiptir:

- **Deprem Kaydı Ekleme**: Yeni deprem verilerini sisteme ekleyebilme
- **Deprem Listeleme**: Tüm kayıtlı depremleri görüntüleyebilme
- **Büyüklüğe Göre Arama**: Belirli bir büyüklüğün üzerindeki depremleri listeleyebilme
- **Konuma Göre Arama**: Belirli bir bölgedeki depremleri arayabilme
- **İstatistikler**: Deprem kayıtlarına ilişkin temel istatistikleri görüntüleyebilme

## Geliştirme Ortamının Kurulumu

### Gereksinimler

- Java Development Kit (JDK) 8 veya üzeri
- Git
- Tercihen bir Java IDE (IntelliJ IDEA, Eclipse, VS Code vb.)

### Kurulum Adımları

1. **JDK Kurulumu**:
   - [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) veya [OpenJDK](https://adoptopenjdk.net/) adresinden JDK'yı indirin ve kurun.
   - Kurulumdan sonra, komut satırında `java -version` komutu ile Java'nın doğru kurulduğunu kontrol edin.

2. **Git Kurulumu**:
   - [Git'in resmi sitesinden](https://git-scm.com/downloads) işletim sisteminize uygun Git sürümünü indirin ve kurun.
   - Kurulumdan sonra, komut satırında `git --version` komutu ile Git'in doğru kurulduğunu kontrol edin.

3. **IDE Kurulumu** (İsteğe bağlı):
   - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (Community Edition ücretsizdir)
   - [Eclipse](https://www.eclipse.org/downloads/)
   - [Visual Studio Code](https://code.visualstudio.com/) + Java Extension Pack

## Git ile Çalışma

### Git Nedir?

Git, yazılım geliştirme süreçlerinde kullanılan, sürüm kontrol sistemlerinden biridir. Projenizdeki değişiklikleri takip etmenizi, farklı sürümleri yönetmenizi ve ekip arkadaşlarınızla işbirliği yapmanızı sağlar.

### Temel Git Komutları

#### İlk Kurulum

Git'i ilk kez kullanıyorsanız, kimlik bilgilerinizi ayarlamanız gerekir:

```bash
git config --global user.name "Adınız Soyadınız"
git config --global user.email "email@adresiniz.com"