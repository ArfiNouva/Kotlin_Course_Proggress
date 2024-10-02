fun main() {
    val brandCorporation = "Cahaya Anugrah Firdaus"
    val member: Array<String> = arrayOf("Arfi", "Taufik", "Rezza")
    val internMembers: Array<String?> = arrayOfNulls(10)
    internMembers[0] = "Arfi"
    internMembers[1] = "Taufik"
    internMembers[2] = "Rezza"
    internMembers[3] = "Adit"
    internMembers[11] = "Arfi"
    val ages: Array<Short> = arrayOf(17, 17, 17)

    println(brandCorporation)
    println("Murid yang berpartisipasi : ${internMembers.size}")
    println("Umur masing-masing murid : ${ages[2]}")
    ages.set(1, 18)
    ages[0] = 16
    internMembers[3] = null
    println("Murid bernama taufik berulang tahun! umurnya sekarang adalah ${ages[1]}")
    println("terdapat kesalahan data, Umur Arfi yang valid adalah ${ages[0]}")
    println("2023 Berlalu, CAF Resmi mengraduate ${internMembers[0]}, ${internMembers[1]}, ${internMembers[3]} dan ${internMembers[2]}")
}