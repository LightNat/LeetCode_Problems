/*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

    Input: nums = [1,2,3,1]
    Output: true

Example 2:

    Input: nums = [1,2,3,4]
    Output: false

Example 3:

    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true
*/
var myIntArray: IntArray = intArrayOf(1,1,1,3,3,4,3,2,4,2)

fun main()
{
    println(containsDuplicate(myIntArray))
}

fun containsDuplicate(nums: IntArray): Boolean {


    if(nums.count() > nums.distinct().count())
    {
        return  true
    }
    else
    {
        return  false
    }
    //return  false
}
