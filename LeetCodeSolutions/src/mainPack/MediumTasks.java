package MainPack;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MediumTasks {
	
	//5 Longest Palindromic Substring (TIME LIMIT EXCEEDED)
	
	public  String longestPalindrome(String s) {
	    	
	    	String str="";
	    	
	    	for(int i=0;i<s.length();i++)
	    	{
	    		for(int j=1+i;j<s.length()+1;j++)
		    	{
	    			for(int k=0;k<(j-i)/2;k++)
	    			{
	    				if(s.charAt(i+k)==s.charAt(j-k))
	    					continue;
	    				else break;
	    			}
		    	}
	    	}
			return str;
	        
	    }
	
	public  String longestPalindrome2(String s) {
    	
    	String str="";
    	
    	for(int i=0;i<s.length();i++)
    	{
    		for(int j=1+i;j<s.length()+1;j++)
	    	{
    			String sub=s.substring(i, j);
	    			if(isPalindrome(sub) && sub.length()>str.length())
	    					{
	    						str=sub;
	    					}
	    	}
    	}
		return str;
        
    }
    
   public static boolean isPalindrome(String s)
    {
       int len=s.length();
    	if(len<2)
    		return true;
    	else
    		for(int i=0;i<len/2;i++)
    		{
    			if(!(s.charAt(i)==s.charAt(len-1-i)))	    			
    				return false;	    			
    		}
		return true;	    	
    }
   
 //75. Sort Colors
 	//Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

 	//Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 		public void sortColors(int[] nums) {
 			
 			int count0=0;
 			int count1=0;
 			int count2=0;
 			
 		        for(int num: nums)
 		        {
 		        	if(num==0)
 		        	{
 		        		count0++;
 		           	}
 		        	else if(num==1)
 		        	{
 		        		count1++;
 		           	}
 		        	else 
 		        		count2++;
 		        }
 		        for(int i=0;i<nums.length;i++)
 		        {		        	
 		        	if(i<count0)
 		        	{
 		        		nums[i]=0;
 		        	}
 		        	else if(i<count0+count1)
 		        	{
 		        		nums[i]=1;
 		        	}
 		        	else nums[i]=2;		        	
 		        }
 		    }
 		
 	
   
   //442. Find All Duplicates in an Array
	
 	//Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 	//Find all the elements that appear twice in this array.
 	
 	//Could you do it without extra space and in O(n) runtime?
 	
 	
 	public List<Integer> findDuplicates(int[] nums) {
 			
 			ArrayList list = new ArrayList();
 			Arrays.sort(nums);			
 		    for(int i=0;i<nums.length-1;i++)
 		    {	    	
 			    	if(nums[i]==nums[i+1])
 			    			{
 			    			list.add(nums[i]);			    		
 			    			}		   
 	        }	    	    
 		    return list;			
 		}
   
 // 338. Counting Bits
 	// Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
 	
 		 public int[] countBits(int num) {
 			 if(num==0)     // unnecessary, but can use less time and memory space
 			 {
 				 return new int[]{0};
 			 }
 			 else 
 			 {
 	                 int countOnes[]=new int [num+1];

 	                 for(int i=0;i<=num;i++)
 	                 {
 	                     countOnes[i]=hammingWeight(i);
 	                 }

 	                return countOnes;	        
 		    }
 	   }
 		 
 		 public static int hammingWeight(int n) {
 		        
 	         String str = Integer.toBinaryString(n);
 	         int countOnes = 0;

 	         for (char element : str.toCharArray()){                       
 	             if (element == '1') 
 	                 countOnes++;
 	         }
 		 return countOnes;
 		}

}
