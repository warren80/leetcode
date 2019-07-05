package com.wvoelkl;

public class Solution {
    public static void main(String... args) {

        String word1 = "abca";
        String word2 = "abc";

        int result = new Solution().minDistance(word1, word2);

        System.out.println(result);
    }


    public int minDistance(String word1, String word2) {

        //Never will be greater than max distance
        int[][] distanceMatrix = new int[word1.length()][word2.length()];

        for (int i = 1; i < word1.length(); i++)
            distanceMatrix[i][0] = i;

        for (int j = 1; j < word2.length(); j++)
            distanceMatrix[0][j] = j;

        for (int i = 1; i < word2.length() - 1; i++) {
            for (int j = 1; j < word1.length() - 1; j++) {
                int subCost = (word1.charAt(i) == word2.charAt(j)) ? 0 : 1;

                int a = distanceMatrix[i - 1][j] + 1;               //delete
                int b = distanceMatrix[i][j - 1] + 1;               //create
                int c = distanceMatrix[i - 1][j - 1] + subCost;     //update

                distanceMatrix[i][j] = Math.min(a, Math.min(b, c));
            }


        }
        return distanceMatrix[word1.length() - 1][word2.length() - 1];
    }
}
