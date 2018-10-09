package MainPack;

public class EasyTasks {	
	
	
	// 1. Two Sum
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
	
	// 9. Palindrome Number
	//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
	
		public boolean isPalindrome(int x) {
			
			
			String s = String.valueOf(x);
			int sLen=s.length();
			
			if(sLen<2)
				return true;
			else for(int i=0;i<sLen/2;i++)
			{
				if(!(s.charAt(i)==s.charAt(sLen-1-i)))
					return false;
			}						
			return true;
		        
		    }
		
		//771. Jewels and Stones
		
		/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

		The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".*/
		
		public int numJewelsInStones(String J, String S) {
			
			int jewels=0;
			for(int i=0;i<S.length();i++)
			{
				for(int j=0;j<J.length();j++)
				{
					if(S.charAt(i)==J.charAt(j))
					{
						jewels++;
						break;
					}
				}				
			}
			return jewels;
	    }
		
		//709. To Lower Case
		//Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
		 
		
		public String toLowerCase(String str) {
	        return str.toLowerCase();
	    }
		
		
		//461. Hamming Distance
		/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

		Given two integers x and y, calculate the Hamming distance.*/
		
		 public int hammingDistance(int x, int y) {
			 
			 String xStr=Integer.toBinaryString(x);
			 String yStr=Integer.toBinaryString(y);			
			 int lenDiff=xStr.length()-yStr.length();
			 
			 if(lenDiff>0)
			 {
				 for(int i=0;i<lenDiff;i++)
				 {
					 yStr="0"+yStr;
				 }
			 }
			 else 
				 for(int i=0;i<(-lenDiff);i++)
				 {
					 xStr="0"+xStr;
				 }
			 
			 int count=0;
			 
			 for(int i=xStr.length();i>0;i--)
			 {				 
				if(!(xStr.charAt(i-1)==yStr.charAt(i-1)))
					 count++;
			 }
			 
			return count;
		        
		    }
		 
		 //191. Number of 1 Bits
		 //Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
		
				 public int hammingWeight(int n) {
				        
		             String str = Integer.toBinaryString(n);
		             int countOnes = 0;
		 
		             for (char element : str.toCharArray()){                       
		                 if (element == '1') 
		                     countOnes++;
		             }
				 return countOnes;
				}		

}
