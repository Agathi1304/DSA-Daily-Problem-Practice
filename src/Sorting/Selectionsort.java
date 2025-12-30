package Sorting;
/**
 * 
 * Find the minimum element from the unsorted part and place it at the beginning of the unsorted section.
 */
public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {3,4,5,2,1};
		
		for(int i=0;i<nums.length-1;i++) {
			int minindex=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]<nums[minindex]) minindex=j;
			}
			
			int t=nums[minindex];
			nums[minindex]=nums[i];
			nums[i]=t;
		}
		
		for(int k:nums) {
			System.out.print(k+ " ");
		}
	}

}
