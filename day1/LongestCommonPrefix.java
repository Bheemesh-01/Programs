package day1;
//Write a function to find the longest common prefix string amongst an array of strings.
import java.util.Arrays;

public class LongestCommonPrefix {
	public static String findPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int i = 0;
        while(i < s1.length() && i < s2.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            } else {
                break;
            }
        }
        return s1.substring(0, i);
    }
	public static void main(String[] args) {
		String str[] = {"flower","flow","blight"};
		String prefix = findPrefix(str);
		System.out.println(prefix);
	}
}
