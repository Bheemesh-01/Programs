package day2;
//Given a sorted array of distinct integers and a target value, 

//return the index if the target is found. 
//If not, return the index where it would be if it were inserted in order.

public class SearchInsertPos {
	public static int insert(int[] nums, int trgt) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == trgt)
				return mid;
			else if (nums[mid] > trgt)
				end = mid - 1;
			else
				start = mid + 1;
		}

		return start;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 9 };
		int trgt = 7;
		int insert = insert(nums, trgt);
		System.out.println(insert);
	}
}
