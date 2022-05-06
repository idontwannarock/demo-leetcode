package algorithms.medium;

public class CoinChange {

    // https://leetcode.com/problems/coin-change/
    // You are given an integer array coins representing coins of different denominations and an integer amount
    // representing a total amount of money.
    //
    // Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made
    // up by any combination of the coins, return -1.
    //
    // You may assume that you have an infinite number of each kind of coin.
    //
    // Constraints:
    //
    // 1 <= coins.length <= 12
    // 1 <= coins[i] <= 2^31 - 1
    // 0 <= amount <= 104
    //
    // Example 1:
    // Input: coins = [1,2,5], amount = 11
    // Output: 3
    // Explanation: 11 = 5 + 5 + 1
    //
    // Example 2:
    // Input: coins = [2], amount = 3
    // Output: -1
    //
    // Example 3:
    // Input: coins = [1], amount = 0
    // Output: 0
    public int coinChange(int[] coins, int amount) {
        // Bottom-up solution
        // defend clause
        if (amount == 0) return 0;

        // create array of coin counts, because we store every coin count of an amount less than the amount
        // so the capacity of the array would be no greater than amount + 1, the + 1 is the amount of zero
        int[] coinCounts = new int[amount + 1];

        // fill every coin count with default value of max integer
        for (int coinCountIndex = 0; coinCountIndex < coinCounts.length; coinCountIndex++) {
            coinCounts[coinCountIndex] = Integer.MAX_VALUE - 1;
        }

        // set coin count for zero amount
        coinCounts[0] = 0;

        // calculate every coin counts all the way up to the amount
        for (int currentAmount = 1; currentAmount < coinCounts.length; currentAmount++) {
            // check through every coin
            for (int coin : coins) {
                // check if current coin is viable for current amount
                if (currentAmount - coin >= 0) {
                    // store the minimum coin count between original coin count of current amount
                    // and the coin count of the diff of current amount and coin
                    coinCounts[currentAmount] = Math.min(coinCounts[currentAmount], 1 + coinCounts[currentAmount - coin]);
                }
            }
        }

        if (coinCounts[amount] == Integer.MAX_VALUE - 1) return -1;
        return coinCounts[amount];
    }
}
