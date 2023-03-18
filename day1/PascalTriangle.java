package day1;

import java.util.ArrayList;
import java.util.List;
/*
 * 			1
 * 		   1 1
 * 		  1 2 1
 * 		 1 3 3 1
 * 		1 4 6 4 1
 */
public class PascalTriangle {
	public static List<List<Integer>> pascalTriangle(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; i++) {
			row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			}
			pre = row;
			list.add(row);
		}
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println(pascalTriangle(5));
	}
}
