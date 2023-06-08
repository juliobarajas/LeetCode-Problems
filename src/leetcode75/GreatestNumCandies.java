package leetcode75;
/*
There are n kids with candies. You are given an integer array candies, where each candies[i]
represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of
extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GreatestNumCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Scanner input = new Scanner(System.in);

        int greatest = 0;
        List<Boolean> result = new ArrayList<Boolean>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > greatest) {
                greatest = candies[i];
            }
        }

        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= greatest) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
}