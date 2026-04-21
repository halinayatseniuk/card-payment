# Payment page and order test

## Prerequisites
- Java 21+
- Gradle
- Secrets (SECRET_KEY & API_KEY) can be requested from halina.yatseniuk@gmail.com

---

## Run tests via JUnit 5 Runner with environment variables

1. Open the project in IntelliJ IDEA.
2. Create a **JUnit Run Configuration**.
3. Select:
     - **Test runner**: JUnit 5
     - **Test type**: Class: org.automation.PaymentTests
4.  Add environment variables:
    - `API_KEY=api_pk_`
    - `SECRET_KEY=api_sk_`
5. Click **Run** ▶

## Run test via Gradle with environment variables

PowerShell (Windows)
```bash
$env:API_KEY="api_pk_"; $env:SECRET_KEY="api_sk_"; ./gradlew test
```

Mac/Linux
```bash
API_KEY=api_pk_ SECRET_KEY=api_sk_ ./gradlew test
```

---

### Libraries used
- JUnit5
- Rest Assured
- Selenide
- AssertJ
- Lombok
- Jackson
- Faker