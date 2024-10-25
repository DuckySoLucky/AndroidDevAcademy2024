private fun first() {
    // Napravite varijable za godinu vašeg rođenja i trenutnu godinu. Izračunajte koliko godina
    // imate. Izračunajte koliko ćete godina imati 2048.

    val godineRodjenja = 2007;
    val trenutnaGodina = 2024;
    val godine = trenutnaGodina - godineRodjenja;
    val buducaGodina = 2048;
    val godine2048 = buducaGodina - godineRodjenja;

    println("Imam $godine godina.");
    println("Imat ću $godine2048 godina 2048. godine.");
}

private fun second() {
    // Napravite tri vrijednosti, za Vaše i imena dvaju osoba pokraj Vas na akademiji. Ispišite
    // poruke u kojoj napominjete tko sjedi lijevo, a tko desno od koga.

    val mojeIme = "Robert";
    val imeLijevo = "Ivan";
    val imeDesno = "Marko";

    println("Ja sam $mojeIme. $imeLijevo sjedi lijevo od mene, a $imeDesno desno od mene.");
}

fun main() {
    first();
    second();
}