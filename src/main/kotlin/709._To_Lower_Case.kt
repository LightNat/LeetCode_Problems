/*
    Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.



Example 1:

    Input: s = "Hello"
    Output: "hello"

Example 2:

    Input: s = "here"
    Output: "here"

Example 3:

    Input: s = "LOVELY"
    Output: "lovely"
*/

fun main()
{
    println(toLowerCase("Hello"))
}

fun toLowerCase(s: String): String {
    var toLowerCase = s.toLowerCase()
    return toLowerCase
}