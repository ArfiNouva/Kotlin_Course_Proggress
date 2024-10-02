const val APPNAME = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    val nomor1 = 1
    val nomor2: Byte = 2
    var sebuahText: String? = null
    var nomor3 = 200L // L Disini artinya Tipe datanya adalah long

//    nomor2 = 4 | Jika kamu uncommand ini, Maka hasilnya error karena ini adalah val (immutable)
//    nomor3 = 64 | Jika Kamu uncommand ini, Maka hasilnya akan merubah value dari variable nomor3.. (mutable)
    nomor3 = 64
    println(sebuahText?.length)
    sebuahText = "Jarjit"

    println("Selamat datang di $APPNAME")
    println("Versi $VERSION")
    println(nomor3)
    println(sebuahText.length * nomor3)
    println(nomor1 + nomor2 * nomor3)
}