/*
    Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.



Example 1:

    Input: s = "the sky is blue"
    Output: "blue is sky the"

Example 2:

    Input: s = "  hello world  "
    Output: "world hello"
    Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:

    Input: s = "a good   example"
    Output: "example good a"
    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
*/

fun main()
{
    println(reverseWords("  hello world  "))
}

fun reverseWords(s: String): String {
    var myList: MutableList<String> = mutableListOf()
    var stringStorage = ""
    var finalOutput = ""

    var counter = 0

    for (i in s)
    {
        //print(i)
        stringStorage += i

        if(i.isWhitespace())
        {
            //println(stringStorage)
            if(stringStorage == " ")
            {

            }
            else
            {
                myList.add(stringStorage)
            }
            stringStorage = ""
        }

    }

    //print(stringStorage)
    myList.add("$stringStorage ")
    //println(myList)

    //println(myList)

    for(i in myList.reversed())
    {
        finalOutput += i
    }

    return  finalOutput.trim()
}