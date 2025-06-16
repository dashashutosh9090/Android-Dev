package assignment_june_13

fun main() {
    val sentence = "Kotlin is a concise programming language"
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val found = mutableSetOf<Char>()
    for (char in sentence.lowercase()) {
        if (char in vowels) {
            found.add(char)
        }
    }
    println("Vowels found: $found")
}