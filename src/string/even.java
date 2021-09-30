package string;
import java.util.Scanner;
public class even {
	public static void main(String[] args) {
		int[] nums = {1,2,34,5};
		int even=0;
		for(int count=0;count<nums.length;count++) {
			if(nums[count] % 2==0) {
				even++;
			}
		}
		System.out.println(even);
	}

}
