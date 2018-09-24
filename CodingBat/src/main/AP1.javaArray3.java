package anotherMethod;

import java.util.ArrayList;

public class Array3 {
	
	//Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
	
	
public int maxSpan(int[] nums) {
		
		int len=nums.length;
		int count=0;
		
		if(len==1)
			return 1;
		
		for(int i=0;i<len;i++)
		{
			for(int j=len-1;j>0;j--)
			{
				if((nums[i]==nums[j])&&((j-i+1)>count))
				{
					count=j-i+1;
				}
			}
		}
		  return count;
		}


	//Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
		

public int[] fix34(int[] nums) {
	
	int len=nums.length;
	
	for(int i=0;i<len;i++)
	{
		if(nums[i]==3)
		{
			for(int j=0;j<len;j++)
			{
				if(nums[j]==4 && (!(nums[j-1]==3)))
				{
					nums[j]=nums[i+1];
					nums[i+1]=4;
				}
			}
		}
	}
	return nums;
}


//(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.



public int[] fix45(int[] nums) {
	
	int len=nums.length;
	
	for(int i=0;i<len;i++)
	{
		if(nums[i]==4)
		{
			for(int j=0;j<len;j++)
			{
				if(nums[j]==5 && (j==0 || (!(nums[j-1]==4))))
				{
					nums[j]=nums[i+1];
					nums[i+1]=5;
				}
			}
		}
	}
	return nums;
	  
}


//Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


public boolean canBalance(int[] nums) {
	
	int len=nums.length;
	int sum1=0;
	int sum2=0;
	
	if (len<2)
		return false;
	 
		for(int i=0;i<len;i++)
	{
			for(int j=0;j<len;j++)
			{	
				if(i>=j)
				{
					sum1+=nums[j];
				}
				else 
					sum2+=nums[j];				
			}
			if(sum1==sum2)
				return true;
			sum1=0;
			sum2=0;
	}		
	return false;	  
}


//Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.


public boolean linearIn(int[] outer, int[] inner) {
	boolean bool =false;
	int count=0;
	
	for(int i=0;i<inner.length;i++)
	{
		for(int j=0;j<outer.length;j++)
		{
			if (inner[i]==outer[j])
					{
					  count++;
					  break;
					}				
		}
	}
	
	if (count==inner.length)
	{
		bool=true;
	}
	
	return bool;
	  
}


//Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.



public int[] seriesUp(int n) {
	int arrLen=0;
	int m=n;
	for(int i=m;i>0;i--,m--)
	{
		arrLen+=m;
	}
	 
	int nums[]=new int[arrLen];
	int index=0;
	for(int i=0;i<n;i++)
	{
		for(int j=1;j<i+2;j++)
		{
			nums[index]=j;
			index++;
		}
	}
	
	
	
	return nums;
}


//Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.




public int countClumps(int[] nums) {
	  int count=0;
	  
	  for(int i=0;i<nums.length-1;i++)
	  {
		  if(nums[i]==nums[i+1])
		  {
			  count++;
			  for(int j=i+2;j<nums.length;j++)
			  {
				if(nums[i]==nums[j])
				{	
					if(j==nums.length-1){
						return count;
					}
					continue;
				}
				else {
					i++;
					break;
				}
			  }
		  }		  
	  }
	  
	  return count;
}


}
