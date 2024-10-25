// Napišite funkciju koja računa n-tu potenciju predanog joj broja. Rabiti for petlju,
// potencija i broj su predstavljeni parametrima funkcije. Testirajte napisanu funkciju.
fun ntaPotencija(broj: Int, potencija: Int): Int {
    var rezultat = 1
    for (i in 1..potencija) {
        rezultat *= broj
    }

    return rezultat
}

// Napišite funkciju koja za predan broj određuje je li on prost ili ne. Prost broj djeljiv
// je samo s brojem 1 i sa samim sobom. Broj predstavlja parametar funkcije. Koristiti neku
// od petlji obrađenih ranije.
fun prostBroj(broj: Int): Boolean {
    if (broj < 2) {
        return false
    }

    for (i in 2 until broj) {
        if (broj % i == 0) {
            return false
        }
    }

    return true
}

private fun main() {
    println("Unesite broj: ")
    val broj = readln().toInt();
    println("Unesite potenciju: ")
    val potencija = readln().toInt();

    println("$broj na $potencija je ${ntaPotencija(broj, potencija)}")

    if (prostBroj(broj)) {
        println("$broj je prost broj")
    } else {
        println("$broj nije prost broj")
    }
}