/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchandsortmini.tool;
import java.util.Arrays;
/**
 *
 * @author elyssa ferrer
 */
public class SearchandSortMiniTool {
    public static void main(String[] args) {

        int[] scores = {85, 90, 83, 92, 88, 86, 95, 80};

        int target = 92;
        boolean found = false;

        System.out.println("Original Scores: "
                + Arrays.toString(scores));

        // Linear Search
        for (int i = 0; i < scores.length; i++) {

            if (scores[i] == target) {
                System.out.println("Score " + target
                        + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Score " + target
                    + " not found.");
        }

        // Sort a COPY to preserve the original order.
        // This matters if the original array is still needed
        // for other tasks or to keep the students' original order.
        int[] sortedScores = scores.clone();

        Arrays.sort(sortedScores);

        System.out.println("Original Array: "
                + Arrays.toString(scores));

        System.out.println("Sorted Array: "
                + Arrays.toString(sortedScores));
    }
}

