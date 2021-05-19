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
public class TwoDimOperationsHW {
//int methods

    public static void printArray(int[][] A1) {

        for (int row = 0; row < A1.length; row++) {
            for (int col = 0; col < A1[row].length; col++) {
                if (A1[row][col] < 9) {
                    System.out.print("[" + row + "]" + "[" + col + "]=" + A1[row][col] + "  ");
                } else {
                    System.out.print("[" + row + "]" + "[" + col + "]=" + A1[row][col] + " ");
                }

            }
            System.out.println();
        }
        System.out.print("\n");
    }

    public static int getTotal(int[][] array) {

        int total = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total += array[row][col];
            }
        }
        return total;
    }

    public static int getAverage(int[][] array) {
        int average = 0;
        int divisor = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                average += array[row][col];
                divisor++;
            }
        }
        // divisor = array.length + array[0].length;
        average = average / divisor;
        return average;
    }

    public static int getRowTotal(int[][] array, int row) {
        int total = 0;
        for (int i = 0; i < array[0].length; i++) {
            total += array[row][i];

        }
        return total;
    }

    public static int getColumnTotal(int[][] array, int column) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][column];

        }
        return total;
    }

    public static int getHighestInRow(int[][] array, int row) {
        int highest = array[row][0];

        for (int i = 0; i < array[row].length; i++) {

            if (highest < array[row][i]) {
                highest = array[row][i];
            }
        }

        return highest;
    }

    public static int getLowestInRow(int[][] array, int row) {
        int lowest = array[row][0];

        for (int i = 0; i < array[row].length; i++) {

            if (lowest > array[row][i]) {
                lowest = array[row][i];
            }

        }
        return lowest;
    }

    public static int getElementCount(int[][] array) {
        int total = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total++;
            }
        }
        return total;

    }

//double methods
    public static String printArray(double[][] A1) {

        String print = "";
        int enter = 0;
        for (int row = 0; row < A1.length; row++) {
            for (int col = 0; col < A1[row].length; col++) {

                if (enter < row) {
                    print += "\n";
                    enter++;
                }
                print += "[" + row + "]" + "[" + col + "]" + A1[row][col] + "\t";

            }

        }

        return print;
    }

    public static double getTotal(double[][] array) {

        double total = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total += array[row][col];
            }
        }
        return total;
    }

    public static double getAverage(double[][] array) {
        double average = 0;
        double divisor = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                average += array[row][col];
                divisor++;
            }
        }
        // divisor = array.length + array[0].length;
        average = average / divisor;
        return average;
    }

    public static double getRowTotal(double[][] array, int row) {
        double total = 0;
        for (int i = 0; i < array[0].length; i++) {
            total += array[row][i];

        }
        return total;
    }

    public static double getColumnTotal(double[][] array, int column) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][column];

        }
        return total;
    }

    public static double getHighestInRow(double[][] array, int row) {
        double highest = array[row][0];

        for (int i = 0; i < array[row].length; i++) {

            if (highest < array[row][i]) {
                highest = array[row][i];
            }
        }

        return highest;
    }

    public static double getLowestInRow(double[][] array, int row) {
        double lowest = array[row][0];

        for (int i = 0; i < array[row].length; i++) {

            if (lowest > array[row][i]) {
                lowest = array[row][i];
            }

        }
        return lowest;
    }

    public static double getElementCount(double[][] array) {
        double total = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total++;
            }
        }
        return total;

    }

}
