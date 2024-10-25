private fun first() {
    // Napišite program koji uz pomoć for petlje računa i na ekran ispisuje sumu prvih n
    // prirodnih brojeva, gdje se n zadaje s tipkovnice.

    println("Unesite broj n:");
    val n = readln().toInt();
    var suma = 0;
    for (i in 1..n) {
        suma += i;
    }

    println("Suma prvih $n prirodnih brojeva je $suma.");
}

private fun second() {
    // Napišite program koji od korisnika traži unos broja unutar granica zadanih također
    // korisničkim unosom. Unos se ponavlja sve dok se ne unese broj unutar željenih granica.
    // Kada je unesen broj, potrebno je pronaći njegovu najveću znamenku.

    println("Unesite donju granicu:");
    val donjaGranica = readln().toInt();
    println("Unesite gornju granicu:");
    val gornjaGranica = readln().toInt();
    var broj = 0;
    do {
        println("Unesite broj unutar granica:");
        broj = readln().toInt();
    } while (broj < donjaGranica || broj > gornjaGranica);

    var najvecaZnamenka = 0;
    var brojKopija = broj;
    while (brojKopija > 0) {
        val znamenka = brojKopija % 10;
        if (znamenka > najvecaZnamenka) {
            najvecaZnamenka = znamenka;
        }
        brojKopija /= 10;
    }

    println("Najveća znamenka broja $broj je $najvecaZnamenka.");
}

private fun main() {
    first()
    second()
}