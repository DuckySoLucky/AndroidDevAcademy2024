private fun first() {
    // Napišite kod koji od korisnika zahtjeva unos 3 broja, a zatim nađite i ispišite najveći
    // među njima.

    println("Unesite prvi broj:");
    val prviBroj = readln().toInt();
    println("Unesite drugi broj:");
    val drugiBroj = readln().toInt();
    println("Unesite treći broj:");
    val treciBroj = readln().toInt();

    val najveciBroj = if (prviBroj > drugiBroj && prviBroj > treciBroj) {
        prviBroj;
    } else if (drugiBroj > prviBroj && drugiBroj > treciBroj) {
        drugiBroj;
    } else {
        treciBroj;
    }

    println("Najveći broj je $najveciBroj.");
}

private fun second() {
    // Napišite kod koji od korisnika zahtjeva unos znaka, a zatim korištenjem naredbe when
    // određuje i na ekran ispisuje je li riječ o samoglasniku.

    println("Unesite znak:");
    val znak = readln();

    when (znak) {
        "a", "e", "i", "o", "u" -> println("Uneseni znak je samoglasnik.");
        else -> println("Uneseni znak nije samoglasnik.");
    }
}

fun main() {
    first();
    second();
}