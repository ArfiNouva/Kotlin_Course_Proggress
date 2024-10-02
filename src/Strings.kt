fun main() {
    val firstname: String = "Mochamad "
    val middlename: String = "Arfi "
    val lastname: String = "Nouvama, "
    var fullname: String = firstname + middlename + lastname
    val desc: String = "the length of $fullname is ${fullname.length}"
    val address: String = """
    .Homeless,
    .Province West Java,
    .Country Indonesia""".trimMargin(".")

    fullname = "Arufi Nohama"
    println(fullname)
    println(address)
    println(desc)
}