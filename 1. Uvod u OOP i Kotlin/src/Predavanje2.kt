// Napišite program za igranje kartaške igre War. Kreirajte klasu koja predstavlja kartu. Za
// boje i vrijednosti možete rabiti takozvane enum klase. Kreirajte klasu koja predstavlja
// špil i omogućuje miješanje i dijeljenje po jedne karte. S obzirom da postoje 52 karte,
// možete rabiti polje (engl. array – pogledati dokumentaciju). Svaki igrač u svakoj rundi
// dobije po 1 kartu. Rundu dobiva igrač s jačom kartom (veći broj, as je najjači). Napišite
// funkciju koja omogućuje igranje ove igre za dva igrača.

private enum class Boja {
    HERC, PIK, TREF, KARO
}

private enum class Vrijednost {
    DVA, TRI, CETIRI, PET, SEST, SEDAM, OSAM, DEVET, DESET, ZANDAR, DAMA, KRALJ, AS
}

private class Karta(val boja: Boja, val vrijednost: Vrijednost) {
    override fun toString(): String {
        return "$vrijednost $boja"
    }
}

private class Spil {
    private val karte: MutableList<Karta> = mutableListOf()

    init {
        for (boja in Boja.values()) {
            for (vrijednost in Vrijednost.values()) {
                karte.add(Karta(boja, vrijednost))
            }
        }
    }

    fun mjesaj() {
        karte.shuffle()
    }

    fun dijeli(): Karta {
        return karte.removeAt(0)
    }
}

fun main() {
    val spil = Spil()
    spil.mjesaj()
    val karteIgraca1 = mutableListOf<Karta>()
    val karteIgraca2 = mutableListOf<Karta>()

    for (i in 1..26) {
        karteIgraca1.add(spil.dijeli())
        karteIgraca2.add(spil.dijeli())
    }

    var bodoviIgraca1 = 0
    var bodoviIgraca2 = 0

    for (i in 0 until 26) {
        val kartaIgraca1 = karteIgraca1[i]
        val kartaIgraca2 = karteIgraca2[i]

        println("Igrac 1: $kartaIgraca1")
        println("Igrac 2: $kartaIgraca2")

        if (kartaIgraca1.vrijednost.ordinal > kartaIgraca2.vrijednost.ordinal) {
            bodoviIgraca1++
        } else {
            bodoviIgraca2++
        }
    }

    println("Bodovi igraca 1: $bodoviIgraca1")
    println("Bodovi igraca 2: $bodoviIgraca2")
}

