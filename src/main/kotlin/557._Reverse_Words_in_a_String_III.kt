/*
    Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



Example 1:

    Input: s = "Let's take LeetCode contest"
    Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:

    Input: s = "God Ding"
    Output: "doG gniD"
*/

fun main()
{
    println(reverseWords3("Let's take LeetCode contest"))
}

fun reverseWords3(s: String): String {
    var stringStorage = ""
    var myList:List <String> = mutableListOf()
    var finalOutput = ""

    for (i in s)
    {
        print(i)
        stringStorage += i
        if(i.isWhitespace())
        {
            myList += stringStorage.reversed()
            stringStorage = ""
        }


    }
    myList += " ${stringStorage.reversed()}"
    println(myList)

    for(i in myList)
    {
        finalOutput += i
    }

    return finalOutput.trim()
}


