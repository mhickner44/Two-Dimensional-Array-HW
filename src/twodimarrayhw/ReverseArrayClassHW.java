/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodimarrayhw;

/**
 *
 * @author mhick
 */
public class ReverseArrayClassHW {

    public static int[][] flipArrayHorizontally(int[][] original) {
        int[][] copy = original;
        int temp;
        for (int row = 0; row < copy.length / 2; row++) {
            for (int col = 0; col < copy[row].length; col++) {
                temp = copy[row][col];
                copy[row][col] = copy[copy.length - 1 - row][col];
                copy[copy.length - 1 - row][col] = temp;
            }
        }
        return copy;
    }

    public static int[][] flipArrayVertically(int[][] original) {
        int[][] copy = original;
        int temp;
        for (int row = 0; row < copy.length; row++) {
            for (int col = 0; col < copy[row].length / 2; col++) {
                temp = copy[row][col];
                copy[row][col] = copy[row][copy[row].length - 1 - col];
                copy[row][copy[row].length - 1 - col] = temp;
            }
        }
        return copy;
    }

    public static int[][] reverseArray(int[][] original) {
        int[][] copy = new int[original.length][original[0].length];

        for (int row = 0; row < copy.length; row++) {
            for (int col = 0; col < copy[row].length; col++) {
                copy[copy.length - row - 1][copy[row].length - 1 - col] = original[row][col];
            }
        }

        return copy;

    }

    public static int[][] transposeArray(int[][] original) {
        int[][] copy = new int[original[0].length][original.length];

        for (int col = 0; col < original.length; col++) {
            for (int row = 0; row < original[col].length; row++) {
                copy[row][col] = original[col][row];
            }
        }
        return copy;
    }

    public static int[][] reverseTransposeArray(int[][] original) {
        int[][] copy = new int[original[0].length][original.length];

        for (int col = 0; col < original.length; col++) {
            for (int row = 0; row < original[col].length; row++) {
                copy[row][col] = original[original.length - col - 1][original[col].length - 1 - row];

            }
        }

        return copy;

    }
}
