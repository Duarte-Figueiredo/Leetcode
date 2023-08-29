class Solution1672 {
    fun maximumWealth(accounts: Array<IntArray>) = accounts.maxOf { it.sum() }
}
