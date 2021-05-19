/*
look up how to do two arrays 
read about how a 2 dimensional array is filled out
 */
package twodimarrayhw;

import java.util.Scanner;

/**
 *
 * @author mhick
 */
public class TwoDimArrayHW {

    public static void main(String[] args) {

        //declare  twoDimHW to be a 2-dimensional array of integers of 3 rows and 5 columns;
        int[][] twoDimHW = new int[3][5];
        //Insert Code here to ask the user to fill out the array 
        Scanner scan = new Scanner(System.in);
        //fill out column by column
        for (int row = 0; row < twoDimHW.length; row++) {
            for (int col = 0; col < twoDimHW[row].length; col++) {

                System.out.println("please enter an integer value for [" + row + "]" + "[" + col + "]");
                twoDimHW[row][col] = scan.nextInt();
            }
        }
//Use printArray method to  the array “twoDimHW”
        System.out.println("printing the array:");

        TwoDimOperationsHW.printArray(twoDimHW);
//declare  numbersReverse to be a 2-dimensional array 
//use flipArrayHorizontally method to  fill it out by flipping the “twoDimHW” horizontally;
//Use printArray method to print the array “numbersReverse”

        int[][] numbersReverse = new int[twoDimHW.length][];
        for (int i = 0; i < twoDimHW.length; i++) {
            numbersReverse[i] = twoDimHW[i].clone();
        }
        System.out.println("Flipping the array Horizontally:");
        System.out.println("printing the array:");
        ReverseArrayClassHW.flipArrayHorizontally(numbersReverse);
        TwoDimOperationsHW.printArray(numbersReverse);

// declare  flipArrVer to be a 2-dimensional array 
//use flipArrayVertically method to  fill it out by flipping the “twoDimHW” vertically;
//Use printArray method to print the array “flipArrVer”
        int[][] flipArrVer = new int[twoDimHW.length][];
        for (int i = 0; i < twoDimHW.length; i++) {
            flipArrVer[i] = twoDimHW[i].clone();
        }
        System.out.println("Flipping the array Vertically:");
        System.out.println("printing the array:");
        flipArrVer = ReverseArrayClassHW.flipArrayVertically(flipArrVer);
        TwoDimOperationsHW.printArray(flipArrVer);
//declare reverseArr to be a 2-dimensional array 
//use reverseArray method to fill it out by reversing the “twoDimHW”;
//Use printArray method to print the array “reverseArr”
        int[][] reverseArray = new int[twoDimHW.length][];
        for (int i = 0; i < twoDimHW.length; i++) {
            reverseArray[i] = twoDimHW[i].clone();
        }
        System.out.println("reversing the array:");
        System.out.println("printing the array:");
        reverseArray = ReverseArrayClassHW.reverseArray(reverseArray);
        TwoDimOperationsHW.printArray(reverseArray);
//declare transpArr to be a 2-dimensional array 
// use transposeArray method to fill it out by transposing the “twoDimHW”;
//Use printArray method to print the array “transposeArray”
        int[][] transpArr = new int[twoDimHW.length][];
        for (int i = 0; i < twoDimHW.length; i++) {
            transpArr[i] = twoDimHW[i].clone();
        }

        System.out.println("Transposing the array:");
        System.out.println("printing the array:");
        transpArr = ReverseArrayClassHW.transposeArray(transpArr);
        TwoDimOperationsHW.printArray(transpArr);

//declare reverseTranspArr to be a 2-dimensional array 
//use reverseTransposeArray method to fill it out by reversing and transposing the “twoDimHW”;
//Use printArray method to print the array “reverseTranspArr”
        int[][] reverseTranspArr = new int[twoDimHW.length][];
        for (int i = 0; i < twoDimHW.length; i++) {
            reverseTranspArr[i] = twoDimHW[i].clone();
        }

        System.out.println(" Reversing and Transposing the array:");
        System.out.println("printing the array:");
        reverseTranspArr = ReverseArrayClassHW.reverseTransposeArray(reverseTranspArr);
        TwoDimOperationsHW.printArray(reverseTranspArr);

//Use printArray method to print the array “twoDimHW”
        System.out.println("\n");
        System.out.println("printing the array; ");
        TwoDimOperationsHW.printArray(twoDimHW);

        //Apply the getTotal method on the “twoDimHW” array
        System.out.println("Total of twoDimHW: " + TwoDimOperationsHW.getTotal(twoDimHW));
//Apply the getAverage method on the “twoDimHW” array
        System.out.println("Average of twoDimHW: " + TwoDimOperationsHW.getAverage(twoDimHW));
//Apply the getRowTotal method on row 0 of the “twoDimHW” array
        System.out.println("total of row 0 twoDimHW: " + TwoDimOperationsHW.getRowTotal(twoDimHW, 0));
//Apply the getRowTotal method on row 1 of the “twoDimHW” array
        System.out.println("total of row 1 twoDimHW: " + TwoDimOperationsHW.getRowTotal(twoDimHW, 1));
//Apply the getColumnTotal method on column 0 of the “twoDimHW” array
        System.out.println("total of column 0 twoDimHW: " + TwoDimOperationsHW.getColumnTotal(twoDimHW, 0));
//Apply the getColumnTotal method on column 2 of the “twoDimHW” array
        System.out.println("total of column 2 twoDimHW: " + TwoDimOperationsHW.getColumnTotal(twoDimHW, 2));
//Apply the getHighestInRow method on row 0 of the “twoDimHW”array
        System.out.println("highest in row 0 twoDimHW: " + TwoDimOperationsHW.getHighestInRow(twoDimHW, 0));
//Apply the getHighestInRow method on row 1 of the “twoDimHW” array
        System.out.println("highest in row 1 twoDimHW: " + TwoDimOperationsHW.getHighestInRow(twoDimHW, 1));
//Apply the getLowestInRow method on row 0 of the “twoDimHW” array
        System.out.println("lowest in row 0 twoDimHW: " + TwoDimOperationsHW.getLowestInRow(twoDimHW, 0));
//Apply the getLowestInRow method on row 1 of the “twoDimHW” array
        System.out.println("lowest in row 1 twoDimHW: " + TwoDimOperationsHW.getLowestInRow(twoDimHW, 1));

    }

}
