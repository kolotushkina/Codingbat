package MainPack;

public class EasyTasks {
	
	// Two Sum
	//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	    	int nums2[]=new int[2];
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=i+1; j<nums.length;j++)
	            {
	                if (nums[i]+nums[j]==target)
	                {
	                     nums2[0]=i;
	                     nums2[1]=j;
	                }
	            }
	        }
	        
	        return nums2;
	    }
	}

}