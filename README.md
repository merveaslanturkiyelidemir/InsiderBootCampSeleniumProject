# Insider Test Automation Project

## Tanım
Bu proje, Insider şirketinin web sitesindeki kariyer sayfasının ve iş başvuru süreçlerinin otomasyonunu gerçekleştirir. 
Page Object Model (POM) prensiplerine uygun olarak geliştirilmiş, modüler ve genişletilebilir bir test framework'üdür.

## Teknolojiler
- Java 17
- Selenium WebDriver 4.34.0
- JUnit Jupiter 5.13.4
- Maven
- JSON for configuration
- Commons IO 2.20.0

## Test Senaryoları

### 1. Ana Sayfa Kontrolü
- useinsider.com adresine gidilir
- Sayfanın düzgün açıldığı kontrol edilir
- Announce bar'ın görünürlüğü kontrol edilir

### 2. Kariyer Sayfası Kontrolü
- Navigation bar'dan "Company" menüsüne tıklanır
- "Careers" seçeneği seçilir
- Kariyer sayfasının açıldığı doğrulanır
- Locations, Teams ve Life at Insider bloklarının varlığı kontrol edilir
- "See All Teams" butonuna tıklanır ve tüm takımların görüntülendiği doğrulanır

### 3. QA İş İlanları Kontrolü
- Quality Assurance kariyer sayfasına gidilir
- "See all QA jobs" butonuna tıklanır
- Location filtresinden "Istanbul, Turkiye" seçilir
- İş listesinin görüntülendiği kontrol edilir
- Listelenen pozisyonların QA ile ilgili olduğu doğrulanır
- İş lokasyonlarının Istanbul, Turkiye olduğu doğrulanır

### 4. Başvuru Formu Kontrolü
- İlk iş ilanının üzerine hover yapılır
- "View Role" butonuna tıklanır
- Lever Application form sayfasına yönlendirildiği kontrol edilir

## Framework Özellikleri

### ElementHelper
- JSON tabanlı locator yönetimi
- Güvenilir element etkileşimi
  - Retry mekanizması
  - Element görünürlük kontrolleri
  - Animasyon handling
  - Scroll ve click optimizasyonları
- Smooth scrolling ve highlighting
- Screenshot capture
- Multi-tab desteği
- Gelişmiş hata yönetimi

### Özel Metodlar ve Yetenekler
- Akıllı element bulma stratejileri
- Dinamik bekleme süreleri
- Element vurgulama (highlighting)
- Otomatik cookie ve notification handling
- Detaylı loglama
- Hata durumunda otomatik screenshot
- Cross-browser hazırlığı

## Proje Yapısı
````markdown
src
├── main
│   ├── java
│   │   └── com
│   │       └── insider
│   │           ├── pages
│   │           ├── tests
│   │           └── utils
│   └── resources
│       ├── config
│       └── locators
└── test
    ├── java
    │   └── com
    │       └── insider
    │           └── tests
    └── resources
        └── testdata
````

## Kurulum ve Çalıştırma

### Gereksinimler
- Java 17
- Maven
- Chrome Browser

### Kurulum
```bash
git clone [repo-url]
cd testautomation
mvn clean install
```

Test Çalıştırma
```
mvn test
```

### Test Sonuçları
Test raporları: test-output/ klasöründe
Screenshot'lar: test-output/screenshots/ klasöründe
Her screenshot timestamp ile kaydedilir

## Özellikler

- Highlight özelliği config.properties'den açılıp kapatılabilir
- Chrome notification'ları otomatik kapatılır
- Cookie banner'ı otomatik kapatılır
- Smooth scroll ile element bulma
- Element vurgulanması (highlight)
- Detaylı log mesajları

## Author
Merve Aslantürkiyeli Demir