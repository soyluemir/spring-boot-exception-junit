Proje Adı: Exception Management REST API

Bu proje, Spring Boot kullanılarak geliştirilmiş, veritabanı bağlantılı ve DTO yapılı sektöre uygun bir RESTful API uygulamasıdır.

🚀 Teknik Özellikler

Java & Spring Boot tabanlı kurumsal mimari

Exception Handling Mimarisi: GlobalExceptionHandler ile standart JSON hata cevapları

DTO Kullanımı: Controller katmanında veri transferi için DTO nesneleri

@Scheduled Görevleri: Belirli aralıklarla çalışan zamanlanmış görevler

JUnit 5 Testleri: Birim ve entegrasyon testleri

Veritabanı Bağlantısı: PostgreSQL entegrasyonu

Lombok ile sade kod yazımı

Katmanlı Mimari: Controller, Service, Repository

📂 Katmanlar

Controller – İstekleri karşılayan REST endpoint’leri

Service – İş mantığı katmanı

Repository – JPA/Hibernate tabanlı veri erişim katmanı

Model/DTO – Veri transfer ve model nesneleri

Exception – Global hata yönetimi

🛠 Kullanılan Teknolojiler

Java 17+

Spring Boot (Web, Data JPA, Validation, Scheduling)

PostgreSQL

Lombok

JUnit 5

Maven

Örnek cevap formatı:
{
  "result": true,
  "errorMessage": null,
  "data": {
    "id": 1,
    "name": "Ali Veli",
    "department": "IT"
  }
}
 
