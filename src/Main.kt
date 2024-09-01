//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("==========================1==========================")
    val string = "{([])}"
    val parentheses = '(' to ')'
    val squareBracket = '[' to ']'
    val brace = '{' to '}'
    var isSimilar = false

    for (i in 0..<string.length / 2) {
        val buf = string[i] to string[(string.length - 1) - i]
        if (buf == parentheses || buf == squareBracket || buf == brace) isSimilar = true
        else {
            isSimilar = false
            break
        }
    }
    println(isSimilar)
    println()
    println("==========================1==========================")

    val array = intArrayOf(1, 2, 3)

    for (i in array){
        for (j in array){
            for (k in array){
                if (i != j && i != k && j != k) println("[$i, $j, $k]")
            }
        }
    }


}