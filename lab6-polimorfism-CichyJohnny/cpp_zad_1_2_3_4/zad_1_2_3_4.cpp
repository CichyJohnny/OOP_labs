#include <iostream>
#include <memory>


class Pojazd {
public:
    int v = 0;

    virtual void przyspiesz() = 0;

    virtual void zatrzymaj() = 0;

    void printV() {
        std::cout << "Predkosc: " << v << std::endl;
    }

    virtual ~Pojazd() {
        std::cout << "Pojazd deleted" << std::endl;
    }
};

class Samochod : public Pojazd {
public:
    void przyspiesz() override {
        v += 30;
    }

    void zatrzymaj() override {
        v -= 30;
    }

    ~Samochod() {
        std::cout << "Samochod deleted" << std::endl;
    }
};

class Rower : public Pojazd {
public:
    void przyspiesz() override {
        v += 5;
    }

    void zatrzymaj() override {
        v -= 5;
    }

    ~Rower() {
        std::cout << "Rower deleted" << std::endl;
    }
};

class Motocykl : public Pojazd {
public:
    void przyspiesz() override {
        v += 20;
    }

    void zatrzymaj() override {
        v -= 20;
    }

    ~Motocykl() {
        std::cout << "Motocykl deleted" << std::endl;
    }
};

class Skuter : public Pojazd {
public:
    void przyspiesz() override {
        v += 10;
    }

    void zatrzymaj() override {
        v -= 10;
    }

    ~Skuter() {
        std::cout << "Skuter deleted" << std::endl;
    }
};


int main() {
    std::unique_ptr<Pojazd> pojazdy[4] = {
            std::make_unique<Samochod>(),
            std::make_unique<Rower>(),
            std::make_unique<Motocykl>(),
            std::make_unique<Skuter>()
    };

    for (int i=0; i<4; i++) {
        std::cout << "Pojazd " << i << std::endl;
        pojazdy[i]->przyspiesz();
        pojazdy[i]->printV();

        pojazdy[i]->zatrzymaj();
        pojazdy[i]->printV();
    }

    return 0;
}
