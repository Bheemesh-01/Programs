package day2;
// 23 12 43 78 56 34 ---> 78
public class LinearSearch {
	public static int linearSearch(int arr[],int key) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {23, 12, 43, 78, 56, 34};
		int key = 98;
		int res = linearSearch(arr,key);
		if(res>=0) {
			System.out.println("element found in position: "+res);
		}
		else {
			System.out.println("Element not found");
		}
	}
}
