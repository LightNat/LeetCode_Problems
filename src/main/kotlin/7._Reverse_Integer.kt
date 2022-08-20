/*
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

    Input: x = 123
    Output: 321

Example 2:

    Input: x = -123
    Output: -321

Example 3:

    Input: x = 120
    Output: 21
*/

fun main()
{
    println(reverse(123))
}

fun reverse(x: Int): Int {
    var myInt = x
    var result = 0
    while (myInt != 0)
    {
        var remainder = myInt % 10      //for getting the remainder
        var newResult = result * 10 + remainder

        if((newResult - remainder) / 10 != result)
        {
            return 0
        }

        result = newResult                      //pass the value of newResult to result variable(to store the value)
        myInt /= 10                             //to proceed the division
    }
    return result
}