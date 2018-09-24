package MainPack;

import java.util.Arrays;

public class HardTasks {

	
	// 4. Median of Two Sorted Arrays
	//There are two sorted arrays nums1 and nums2 of size m and n respectively.
	//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
	//You may assume nums1 and nums2 cannot be both empty.
	   
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		int aLen = nums1.length;
		int bLen = nums2.length;							 
	    int[] both= new int[aLen+bLen];
        int bothLen=aLen+bLen;
        
			   System.arraycopy(nums1, 0, both, 0, aLen);
			   System.arraycopy(nums2, 0, both, aLen, bLen);
			   Arrays.sort(both);
        
			   if (bothLen%2==0 && bothLen>0)
			       return ((both[bothLen/2-1]+both[bothLen/2])/2.0);
			   else if(bothLen>0)
				   return both[bothLen/2];
			   else  
                   return 0.0;			
}

	
	

}
