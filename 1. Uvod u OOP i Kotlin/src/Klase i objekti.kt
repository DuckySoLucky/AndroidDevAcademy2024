// Definirajte klasu koja predstavlja krug, čije stanje čini polumjer kruga a ponašanje
// uključuje izračun površine i opsega kruga. Omogućite stvaranje jediničnog kruga kao i
// kruga sa zadanim polumjerom. Napišite testni program za klasu krug.
private class Krug(private val polumjer: Double) {
    fun povrsina(): Double {
        return Math.PI * polumjer * polumjer
    }

    fun opseg(): Double {
        return 2 * Math.PI * polumjer
    }
}

private fun main() {
    val jedinicniKrug = Krug(1.0)
    println("Povrsina jedinicnog kruga je ${jedinicniKrug.povrsina()}")
    println("Opseg jedinicnog kruga je ${jedinicniKrug.opseg()}")

    val krug = Krug(5.0)
    println("Povrsina kruga s polumjerom 5 je ${krug.povrsina()}")
    println("Opseg kruga s polumjerom 5 je ${krug.opseg()}")
}