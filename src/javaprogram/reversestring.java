package javaprogram;

import java.util.Arrays;

public class reversestring {

	public static void main(String[] args) {
	
	int[] redf= {1,2,3};
	System.out.println(redf);
	System.out.println(Arrays.toString(redf));
	for(int i=0;i<redf.length;i++) {
		System.out.println(redf[i]);
	}
	
	
	int [][] ref= {{1,2},{3,4},{5,6}};
	/*(int[][] ref=new int[3][2];
	ref[0][0]=1;
	ref[0][1]=2;
	ref[1][0]=3;
	ref[1][1]=4;
	ref[2][0]=5;
	ref[2][1]=6;*/
	
	System.out.println(ref.length);
	System.out.println(Arrays.deepToString(ref));
	for(int i=0;i<3;i++) {
		for(int j=0;j<2;j++) {
			System.out.println(ref[i][j]);
		}
	}
	
	
	
}
	
}