// Napišite program koji omogućuje igranje igre Jamb (engl. Yahtzee). Razdvojite
// funkcionalnost u klase. Trebaju postojati klasa koja predstavlja kockicu, omogućuje
// bacanje kockice i provjeru trenutnog stanja, klasa koja predstavlja ruku sa 6 kockica,
// omogućije bacanje svih kockica, zaključavanje 0-6 kockica, bacanje samo otključanih
// kockica, provjeru rezultata bacanja. Podržati barem 3 provjere za jamb (npr. jamb, poker,
// skala). Napišite funkciju za provjeru napisane funkcionalnosti.
private class Kockica {
    var broj: Int = 0
    var zakljucana: Boolean = false

    fun baci() {
        if (!zakljucana) {
            broj = (1..6).random()
        }
    }

    fun zakljucaj() {
        zakljucana = true
    }

    fun otkljucaj() {
        zakljucana = false
    }
}

private class Ruka {
    var kockice: MutableList<Kockica> = mutableListOf()

    init {
        for (i in 1..6) {
            kockice.add(Kockica())
        }
    }

    fun baciSve() {
        for (kockica in kockice) {
            kockica.baci()
        }
    }

    fun zakljucajKockicu(index: Int) {
        kockice[index].zakljucaj()
    }

    fun otkljucajKockicu(index: Int) {
        kockice[index].otkljucaj()
    }

    fun baciOtkljucane() {
        for (kockica in kockice) {
            if (!kockica.zakljucana) {
                kockica.baci()
            }
        }
    }

    fun provjeriJamb(): Boolean {
        val prvaKockica = kockice[0].broj
        for (kockica in kockice) {
            if (kockica.broj != prvaKockica) {
                return false
            }
        }

        return true
    }

    fun provjeriPoker(): Boolean {
        val brojevi = mutableMapOf<Int, Int>()
        for (kockica in kockice) {
            if (brojevi.containsKey(kockica.broj)) {
                brojevi[kockica.broj] = brojevi[kockica.broj]!! + 1
            } else {
                brojevi[kockica.broj] = 1
            }
        }

        return brojevi.containsValue(4)
    }

    fun provjeriSkalu(): Boolean {
        val brojevi = mutableMapOf<Int, Int>()
        for (kockica in kockice) {
            if (brojevi.containsKey(kockica.broj)) {
                brojevi[kockica.broj] = brojevi[kockica.broj]!! + 1
            } else {
                brojevi[kockica.broj] = 1
            }
        }

        return brojevi.size == 6
    }
}

private fun main() {
    val ruka = Ruka()
    ruka.baciSve()
    println(ruka.kockice.map { it.broj })
    ruka.zakljucajKockicu(0)
    ruka.zakljucajKockicu(1)
    ruka.baciOtkljucane()
    println(ruka.kockice.map { it.broj })
    println(ruka.provjeriJamb())
    println(ruka.provjeriPoker())
    println(ruka.provjeriSkalu())
}