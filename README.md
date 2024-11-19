# Application Android SOAP TP 📱

Application Android pour la gestion des comptes bancaires via un service web SOAP. Développée en Kotlin avec KSOAP2.

## 🌟 Fonctionnalités

- Récupération des comptes
- Création de nouveaux comptes
- Suppression de comptes existants
- Interface moderne avec RecyclerView

## 📂 Structure du Projet

```
├── app/src/main/
│   ├── java/com/example/soapapp/
│   │   ├── models/
│   │   │   ├── Compte.kt
│   │   │   └── TypeCompte.kt
│   │   ├── services/
│   │   │   └── SoapService.kt
│   │   └── ui/
│   │       └── adapters/
│   │           └── CompteAdapter.kt
│   └── res/
│       └── layout/
```

## 🔧 Prérequis

- Android Studio (dernière version)
- SDK Android minimum: API 21
- Service web SOAP opérationnel
- JDK 8+

## ⚙️ Configuration

1. Cloner le projet:
```bash
git clone https://github.com/ilyassman/Gestion-des-comptes-Soap.git
```

2. Configurer `local.properties`:
```properties
sdk.dir=/chemin/vers/android-sdk
```

3. Ajouter les permissions dans `AndroidManifest.xml`:
```xml
<uses-permission android:name="android.permission.INTERNET" />
```

## 📦 Dépendances

```gradle
dependencies {
    implementation 'com.google.code.ksoap2-android:ksoap2-android:3.6.4'
    implementation 'androidx.recyclerview:recyclerview:1.2.1'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'
}
```





