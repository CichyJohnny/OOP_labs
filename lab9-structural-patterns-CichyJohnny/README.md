[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/Mt0OvH1b)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17591179)
### **Laboratorium 9: Wzorce strukturalne (Structural Patterns) w programowaniu obiektowym**

---

#### **Cel laboratorium**  
Celem tego laboratorium jest poznanie i praktyczne zastosowanie wzorców strukturalnych, które umożliwiają organizowanie klas i obiektów w większe, bardziej elastyczne struktury. Studenci nauczą się implementować wybrane wzorce strukturalne w językach **Java** i **C++** oraz rozumieć ich zastosowanie w rzeczywistych projektach.

---

### **Przegląd wzorców strukturalnych**

1. **Adapter**  
   Konwertuje interfejs jednej klasy na interfejs oczekiwany przez klienta.  
   **Przykład:** Dopasowanie nowej biblioteki do istniejącego systemu.  

2. **Decorator**  
   Dynamicznie dodaje nowe funkcjonalności do obiektów, zachowując ich interfejs.  
   **Przykład:** Rozszerzanie funkcjonalności GUI (np. dodanie przewijania do okna).  

3. **Facade**  
   Uproszczenie dostępu do złożonego systemu poprzez dostarczenie uproszczonego interfejsu.  
   **Przykład:** Interfejs do systemu rezerwacji lotów.  

4. **Composite**  
   Organizacja obiektów w hierarchię drzewiastą, gdzie pojedyncze obiekty i grupy obiektów są traktowane w ten sam sposób.  
   **Przykład:** System plików (pliki i foldery).

5. **Proxy**  
   Klasa zastępcza, która kontroluje dostęp do innego obiektu.  
   **Przykład:** Zdalne wywoływanie metod na serwerze (Remote Proxy).

### **Zadania do wykonania**

---

#### **Zadanie 1: Implementacja wzorca Adapter**

**Opis:**  
Stwórz system obsługujący nową bibliotekę płatności, której interfejs różni się od oczekiwanego w istniejącym systemie.

##### **Java**
```java
// Interfejs płatności
interface PaymentProcessor {
   
}

// Istniejący system
class LegacyPaymentProcessor {
   
}

// Adapter
class PaymentAdapter implements PaymentProcessor {
   
    }

    @Override
    
}

// Klient
public class Main {
    public static void main(String[] args) {
       
    }
}
```

##### **C++**
```cpp
#include...

// Interfejs płatności
class PaymentProcessor {

};

// Istniejący system
class LegacyPaymentProcessor {

};

// Adapter


// Klient
int main() {
   
    return 0;
}
```

---

#### **Zadanie 2: Implementacja wzorca Decorator**

**Opis:**  
Stwórz system rozszerzania funkcjonalności okien GUI o dodatkowe elementy, takie jak ramka i przewijanie.

##### **Java**
```java
// Interfejs okna
interface Window {
  
}

// Klasa bazowa
class SimpleWindow implements Window {
    @Override
  
}

// Dekorator

    @Override
   

// Konkretne dekoratory

    @Override
    
}


    @Override
    
}

// Klient
public class Main {
    public static void main(String[] args) {
      
    }
}
```

##### **C++**
```cpp
#include...

// Interfejs okna
class Window {

};

// Klasa bazowa


// Dekorator


// Konkretne dekoratory



// Klient
int main() {
    
    return 0;
}
```
---

#### **Zadanie 3: Wzorzec Facade – Uproszczenie złożonego systemu**

**Opis:**  
Stwórz fasadę dla systemu rezerwacji lotów. System powinien składać się z kilku podsystemów, np.:  
1. **FlightSearch** – wyszukiwanie lotów.  
2. **BookingSystem** – rezerwacja lotów.  
3. **PaymentProcessor** – realizacja płatności.

Fasada powinna zapewniać jedną metodę `bookFlight()`, która wykonuje wszystkie te kroki w odpowiedniej kolejności.

**Cel:**  
- Poznanie zastosowania wzorca Facade do uproszczenia złożonych systemów.  
- Zrozumienie, jak ukrywać szczegóły implementacyjne systemu.

##### **Java**
```java
class FlightSearch {
    
}

class BookingSystem {
   
}

class PaymentProcessor {
   
}

class FlightFacade {
    
}

public class Main {
    public static void main(String[] args) {
       
    }
}
```

##### **C++**
```cpp
#include...

class FlightSearch {

};

class BookingSystem {

};

class PaymentProcessor {

};

class FlightFacade {

};

int main() {
  
    return 0;
}
```

---

#### **Zadanie 4: Wzorzec Composite – Organizacja struktury katalogów**

**Opis:**  
Zaprojektuj system, który pozwala zarządzać katalogami i plikami w strukturze drzewiastej.  
Każdy katalog może zawierać inne katalogi lub pliki. Zarówno pliki, jak i katalogi powinny wspierać metodę `display()`.

**Cel:**  
- Zrozumienie hierarchii drzewiastej w wzorcu Composite.  
- Implementacja wspólnego interfejsu dla różnych typów obiektów.

##### **Java**
```java
import java.util.ArrayList;
import java.util.List;

interface FileSystemComponent {
  
}

class File implements FileSystemComponent {
  
    @Override
   
}

class Directory implements FileSystemComponent {
    
    @Override
   
}

public class Main {
    public static void main(String[] args) {
    
}
```

---

### **Zadanie 5: Wzorzec Proxy – Zdalne zarządzanie dostępem**  

**Opis:**  
Stwórz system, który zarządza dostępem do danych użytkownika. Klasa **Proxy** powinna pośredniczyć w dostępie do danych, logując każde żądanie oraz chroniąc dane przed nieautoryzowanym dostępem. 

**Cel:**  
- Poznanie wzorca **Proxy** w kontekście zarządzania dostępem.  
- Zaimplementowanie klasy zastępczej z dodatkowymi funkcjami.  

---

### **Kod w Java**

```java
// Interfejs dostępu do danych
interface DataAccess {
    
}

// Klasa rzeczywista (RealSubject)
class RealDataAccess implements DataAccess {
    @Override
   
}

// Klasa Proxy
class DataAccessProxy implements DataAccess {
   

    @Override
   
}

// Klient
public class Main {
    public static void main(String[] args) {
      

         // Dostęp dozwolony
        // Dostęp zabroniony
    }
}
```

---

### **Kod w C++**

```cpp
#include <iostream>
#include <string>

// Interfejs dostępu do danych
class DataAccess {

};

// Klasa rzeczywista (RealSubject)
class RealDataAccess : public DataAccess {

};

// Klasa Proxy
class DataAccessProxy : public DataAccess {

};

// Klient
int main() {
   
     // Dostęp dozwolony
     // Dostęp zabroniony

    
    return 0;
}
```

---

1. **Mechanizm Proxy:**  
   Proxy działa jako klasa pośrednia, która decyduje, czy przekazać żądanie do rzeczywistej klasy (`RealDataAccess`).  
   Może dodać dodatkowe funkcje, takie jak logowanie, kontrola dostępu czy buforowanie.  

2. **Zastosowanie Proxy:**  
   - **Remote Proxy** – komunikacja z obiektami na serwerze.  
   - **Protection Proxy** – kontrola dostępu.  
   - **Virtual Proxy** – opóźnione ładowanie zasobów.  

3. **Korzyści:**  
   - Zwiększona kontrola nad dostępem do obiektów.  
   - Dodanie logiki bez modyfikacji klasy rzeczywistej.  

---

### **Przegląd zadań**

1. **Adapter:** Dopasowanie różnych interfejsów (płatności).  
2. **Decorator:** Dynamiczne rozszerzenie funkcjonalności GUI.  
3. **Facade:** Uproszczenie obsługi złożonych systemów (rezerwacja lotów).  
4. **Composite:** Organizacja struktury katalogów i plików.  
5. **Proxy:** Kontrola dostępu i logowanie operacji na danych.

---

### **Efekty kształcenia**

Po ukończeniu laboratorium studenci:
- Zrozumieją, jak implementować i używać wzorców strukturalnych w praktyce.
- Nauczą się, jak wzorce mogą zwiększyć modularność i elastyczność systemów.
- Przeanalizują przypadki użycia wzorców w realnych projektach.
