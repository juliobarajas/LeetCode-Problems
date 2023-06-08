// You are given two strings word1 and word2.
// Merge the strings by adding letters in alternating order, starting with word1.
//  If a string is longer than the other, append the additional letters onto the end of the merged string.
//  Return the merged string.
package leetcode75;
import java.util.Scanner;

class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        Scanner input = new Scanner(System.in);

        String merged = new String("");
        int m = word1.length();
        int n = word2.length();

        for (int i = 0; i < m || i < n; i++) {
            if (i < m) {
                merged = merged.concat(Character.toString(word1.charAt(i)));
            }
            if (i < n) {
                merged = merged.concat(Character.toString(word2.charAt(i)));
            }
        }

        return merged;

    }
}