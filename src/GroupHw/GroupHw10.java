package GroupHw;

import java.util.Arrays;

public class GroupHw10 {

	public static void main(String[] args) {
		//second largest number in array
		//1. easiest way

		int[] num= {12,13,12,1500,0,9000};
		Arrays.sort(num);
		int min =num[0];

		int max=num[num.length-2];
		System.out.println("The second largest number in the array is  "+max);
	}
}
