class Solution1480 {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0

        val result = nums.map { sum += it;sum }

        return result.toIntArray()
    }
}
