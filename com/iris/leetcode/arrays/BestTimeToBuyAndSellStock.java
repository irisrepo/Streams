package com.iris.leetcode.arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // Edge case: If the array is empty or has only one element
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        // Initialize variables
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Traverse the array
        for (int price : prices) {
            // Update minPrice if a new lower price is found
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if we sell at the current price
            int profit = price - minPrice;
            // Update maxProfit if the current profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + solution.maxProfit(prices1)); // Output: 5

        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum Profit: " + solution.maxProfit(prices2)); // Output: 0

        // Example 3
        int[] prices3 = {2, 6, 4, 3, 8};
        System.out.println("Maximum Profit: " + solution.maxProfit(prices3)); // Output: 0
    }
}


    /*You are given an array prices where prices[i] is the price of a given stock on the ith day.

        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



        Example 1:

        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
        Example 2:

        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.


        Constraints:

        1 <= prices.length <= 105
        0 <= prices[i] <= 104*/