/*
    Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.



Example 1:

    Input: s = "ab#c", t = "ad#c"
    Output: true
    Explanation: Both s and t become "ac".

Example 2:

    Input: s = "ab##", t = "c#d#"
    Output: true
    Explanation: Both s and t become "".

Example 3:

    Input: s = "a#c", t = "b"
    Output: false
    Explanation: s becomes "c" while t becomes "b".
*/

fun main()
{
    println(backspaceCompare("ab#c", "ad#c"))
}

fun backspaceCompare(s: String, t: String): Boolean {
    var sReversed = s.reversed()
    var tReversed = t.reversed()

    var myT: String = ""
    var myS:String = ""

    var sCount = 0
    var tCount = 0

    for(i in sReversed)
    {

        if(i.equals('#'))
        {
            println()
            sCount += 1
            continue

        }
        else
        {
            //println(tCount)
            if(sCount > 0)
            {
                sCount -= 1
                continue
            }
            else
            {
                print(i)
                myS += i
            }

        }
    }

    for(i in tReversed)
    {

        if(i.equals('#'))
        {
            println()
            tCount += 1
            continue

        }
        else
        {
            //println(tCount)
            if(tCount > 0)
            {
                tCount -= 1
                continue
            }
            else
            {
                print(i)
                myT += i
            }

        }
    }

    if(myS.equals(myT))
    {
        return true
    }

    //println(sReversed)

    return false
}