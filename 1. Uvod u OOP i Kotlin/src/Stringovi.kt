// Napišite funkciju koja za predani string provjerava bi li on činio dovoljno jaku lozinku.
//Da bi to činio, mora sadržavati barem jedno veliko slovo, jedan broj te biti dug barem 8
//znakova. Testirajte funkciju s nekoliko različitih stringova.
private fun jakaLozinka(lozinka: String): Boolean {
    var sadrziVelikoSlovo = false
    var sadrziBroj = false
    for (znak in lozinka) {
        if (znak.isUpperCase()) {
            sadrziVelikoSlovo = true
        } else if (znak.isDigit()) {
            sadrziBroj = true
        }
    }

    return sadrziVelikoSlovo && sadrziBroj && lozinka.length >= 8
}

// Napišite funkciju koja za predani string broji koliko samoglasnika sadrži. Testirajte
//funkciju s nekoliko različitih stringova.
private fun brojSamoglasnika(rijec: String): Int {
    var brojSamoglasnika = 0
    for (znak in rijec) {
        if (znak in "aeiouAEIOU") {
            brojSamoglasnika++
        }
    }

    return brojSamoglasnika
}

// Napišite funkciju koja za predani string broji koliko jedinstvenih znakova sadrži.
// Testirajte funkciju s nekoliko različitih stringova.
private fun brojJedinstvenihZnakova(rijec: String): Int {
    val jedinstveniZnakovi = mutableSetOf<Char>()
    for (znak in rijec) {
        jedinstveniZnakovi.add(znak)
    }

    return jedinstveniZnakovi.size
}

private fun main() {
    val lozinke = listOf("lozinka", "Lozinka", "lozinka1", "Lozinka1", "Lozinka123", "L%!5");
    for (lozinka in lozinke) {
        if (jakaLozinka(lozinka)) {
            println("$lozinka je jaka lozinka")
        } else {
            println("$lozinka nije jaka lozinka")
        }
    }

    val rijeci = listOf("rijec", "Rijec", "aeiou", "AEIOU", "aeiouAEIOU", "L%!5");
    for (rijec in rijeci) {
        println("Rijec $rijec ima ${brojSamoglasnika(rijec)} samoglasnika")
    }

    val rijeci2 = listOf("rijec", "Rijec", "aeiou", "Robert", "TestString12", "L%!5");
    for (rijec in rijeci2) {
        println("Rijec $rijec ima ${brojJedinstvenihZnakova(rijec)} jedinstvenih znakova")
    }
}