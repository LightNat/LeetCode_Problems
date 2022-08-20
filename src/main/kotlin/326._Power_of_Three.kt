/*
    Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.



Example 1:

    Input: n = 27
    Output: true

Example 2:

    Input: n = 0
    Output: false

Example 3:

    Input: n = 9
    Output: true
*/

fun main()
{
    println(isPowerOfThree(27))
}

fun isPowerOfThree(n: Int): Boolean {
    var value: Long = 1

    while (value != n.toLong())
    {
        value *= 3
        println(value)

        if(value > n)
        {
            return false
        }

    }

    return true
}