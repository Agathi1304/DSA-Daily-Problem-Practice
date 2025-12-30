package Sorting;

/**
 * Repeatedly compare adjacent elements and swap them if they are in the wrong order.
After each pass, the largest element “bubbles” to the end.
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {2,3,1,7,4,2,9,0};
		
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1-i;j++) {
				if(nums[j]>nums[j+1]) {
					int t=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=t;
				}
			}
		}
		
		for(int k:nums) {
			System.out.print(k+" ");
		}
	}

}
