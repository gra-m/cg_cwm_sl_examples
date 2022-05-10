package oca.curiosities;

import java.util.Date;

public class ArrayDeclarations {
int[] singleDimensionArray1 = new int[1];
int[] singleDimensionArray2 = new int[]{1};
int singleDimensionArray3[] = new int[1];
int singleDimensionArray4[] = new int[]{1};
int stillKnowsImAnArray[] = new int[1];
//int havingALaugh[] = new havingALaugh[];  // should be apparent why this..


//int[] singleDimensionArray5  = new int[];// FTC = must have size
//int singleDimensionArray6[]  = new int[];// FTC = must have size

int[][] _2dArray1 = new int[1][];
int _2dArray2[][] = new int[1][];
//int[][] _2dArray3 = new int[][]; // 2D array first refers to rows must have number of rows
//int[][] noColumn = new int[1]; // doesn't refer to the expected columns

int[] _2dArray4[] = new int[1][]; // Just to be confusing this is fine
java.util.Date[] dates[] = new Date[1][];


}
