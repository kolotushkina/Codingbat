/**
 * 
 */
package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * created by Raushan_Safiullin
 *
 */
public class AP1 {
	
	
	// Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
	
	public boolean scoresIncreasing(int[] scores) {		
		
		int[] scores2=Arrays.copyOf(scores, scores.length);		
		Arrays.sort(scores);
		
		if(Arrays.equals(scores,scores2))
			return true;		
		return false;		
	}
	

	// Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.
	
	public boolean scores100(int[] scores) {
		
		for (int i=0;i<(scores.length-1);i++)
		{
			if ((scores[i]==scores[i+1]) && (scores[i]==100))
				return true;
		}
		return false;
		  
	}
	
	//Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
	public boolean scoresClump(int[] scores) {
	      
		for(int i=0;i<scores.length-2;i++)
		{
			if (scores[i]+2>=scores[i+2])
				return true;
		}
		return false;
	}
	
	//Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method 
	//int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
	
	
	public int scoresAverage(int[] scores) {
		int sum1 = 0,sum2 = 0;
		
		for(int i=0;i<scores.length/2;i++)
		{
			sum1+=scores[i];
		}
		
		for(int i=scores.length/2;i<scores.length;i++)
		{
			sum2+=scores[i];
		}
		
		if (sum1>sum2)
			return sum1/(scores.length/2);
		else 
		  return sum2/(scores.length/2);
		
	}
	
	//Given an array of strings, return the count of the number of strings with the given length.
	
	public int wordsCount(String[] words, int len) {
		  int count=0;
		for(String s: words)
		{
			if (s.length()==len)
			{
				count++;
			}
		}
		return count;
	}
	
	
	//Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
	
		public String[] wordsFront(String[] words, int n) {
				
		return Arrays.copyOf(words, n);
				
		}
		
		
	//Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
	
		
		public List wordsWithoutList(String[] words, int len) {
			  
			List list = new ArrayList();
			
			for(String s: words)
			{
				if (!(s.length()==len))
				{
					list.add(s);
				}
			}
			return list;
			
		}
		
		
	//Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
		
		public boolean hasOne(int n) {
			  if (Integer.toString(n).contains("1"))		  {
				  return true;		  }
			 return false;
		}
		
		
	//We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
	
		public boolean dividesSelf(int n) {
			
			String num=Integer.toString(n);
			boolean bool=false;
			
			if (num.contains("0"))
						return false;
			
			for(int i=0; i<num.length();i++)
			{			
				if (n%(Character.getNumericValue(num.charAt(i)))==0)
				{
					bool=true;
				}
				else return false;
				
			}
			  return bool;
		}
		
		
		//Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.
		
		public int[] copyEvens(int[] nums, int count) {
			  
			int nums2[]= new int[count];
			int n=0;
			List list = new ArrayList();
			
			for(int i=0;i<nums.length;i++)
			{
				if (nums[i]%2==0)
				{
					nums2[n]=nums[i];
					n++;
					if (n==count)
					break;
				}
			}
			return nums2;
		}
		
		//We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.
		
		public int[] copyEndy(int[] nums, int count) {
			
			int [] nums2 = new int [count];
			int j=0;
			
			for(int i=0; i<nums.length;i++)
			{
				if ((nums[i]>=0 && nums[i]<=10) || (nums[i]>=90 && nums[i]<=100))
						{
						nums2[j]=nums[i];
						if ((j+1)==count)
						{
							break;
						}					
						else j++;
						}
			}
			return nums2;
			  
		}

		
		//Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char. The strings may be any length, including 0.
		
		public int matchUp(String[] a, String[] b) {
			int count=0;
			for(int i=0; i<a.length; i++)
			{
				if (((a[i].isEmpty()==false) && (b[i].isEmpty()==false)) && (a[i].charAt(0)==b[i].charAt(0)))
				{
					count++;
				}
			}
				
			return count;		  
		}

		
		//The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and are the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.
		
		public int scoreUp(String[] key, String[] answers) {
			int count=0;
			  for(int i=0; i< key.length;i++)
			  {
				  if (key[i]==answers[i])
					  count+=4;
				  else if (!(answers[i]=="?"))
					  count-=1;
					  
			  }
			return count;
			}

		//Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.


		public String[] wordsWithout(String[] words, String target) {
			  
			List list = new ArrayList<>(Arrays.asList(words));
			
			for(String s: words)
			{
				if (s.equals(target))
					list.remove(s);
			}
			 Object[] words2 = list.toArray(new String[list.size()]);
			return (String[]) words2;
		}
		
		
		//Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice decomposition, write a separate helper method which finds the largest special score in an array. Write your helper method after your scoresSpecial() method in the JavaBat text area.


		public int scoresSpecial(int[] a, int[] b) {
			 // int ret=0;
			  int amax=0;
			  int bmax=0;
			  
			  for(int i=0; i<a.length; i++)
			  {
				  if ((a[i]>9) && ((a[i]%10)==0) && (a[i]>amax))
				  {
					  amax=a[i];
				  }
				  else continue;
				 
			  }
			  
			  for(int i=0; i<b.length; i++)
			  {
				  if ((b[i]>9) &&(b[i]%10==0) && (b[i]>bmax))
				  {
					  bmax=b[i];
				  }
				  else continue;
			  }
			  
			  return amax+bmax;
		}

		

		//We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6. The start end end index will both be valid indexes into the array with start <= end.
		
		public int sumHeights(int[] heights, int start, int end) {
			int sum=0;
			
			for(int i=start;i<end;i++)
			{
				sum=sum+Math.abs(heights[i]-heights[i+1]);
			}
			  return sum;
			}

		
		//(A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index, however increases in height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be valid indexes into the array with start <= end.
		
		public int sumHeights2(int[] heights, int start, int end) {
		  	int sum=0;
				
				for(int i=start;i<end;i++)
				{	if (heights[i]>heights[i+1])
					sum=sum+Math.abs(heights[i]-heights[i+1]);
				else 
					sum=sum+2*Math.abs(heights[i]-heights[i+1]);
				}
				  return sum;
				}

		//(A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index. We'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes into the array with start <= end.
		
		public int bigHeights(int[] heights, int start, int end) {
			
			int count=0;
			
			for(int i=start;i<end;i++)
			{
				if(Math.abs(heights[i]-heights[i+1])>4)
					count++;
			}
			  return count;
			}
		
		//We have data for two users, A and B, each with a String name and an int id. The goal is to order the users such as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same. Order first by the string names, and then by the id numbers if the names are the same. Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate how str1 is ordered to str2 (the value is not limited to -1/0/1). (On the AP, there would be two User objects, but here the code simply takes the two strings and two ints directly. The code logic is the same.)


		public int userCompare(String aName, int aId, String bName, int bId) {
		    
		    if (aName.equals(bName) && aId==bId)		
					 		{return 0;}
					 		
					int comp=aName.compareTo(bName);
					
					if (comp>0)
						{return 1;}
					else if(comp<0)
					{return -1;}
					else if (aId>bId)
					{return 1;}
					else 
					{return -1;}
		}

		
		//Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.
		
		public String[] mergeTwo(String[] a, String[] b, int n) {
			  
			  Set set = new TreeSet();
			  
			  for(int i=0;i<n;i++)
			  {
				  set.add(a[i]);
				  set.add(b[i]);		  
			  }
			  
			  String[] s;
			  String[] s2;
			
			s=(String[]) set.toArray(new String[3]);
			s2=Arrays.copyOf(s, n);
			return s2;
		}
		
		//		Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.
		
		public int commonTwo(String[] a, String[] b) {
			  int count=0;
			  String s="";
			  
			  for(int i=0;i<a.length;i++)
			  {
				  for(int j=0;j<b.length;j++)
				  {
					  if ((a[i].equals(b[j])) && (!(s.contains(a[i]))))
					  { 
					    s+=a[i];
						  count++;
						  //break;
					  }
				  }
			  }
			  return count;
		}
		
		
}




