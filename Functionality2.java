/**
 * 
 */
package pack1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * created by Raushan_Safiullin
 *
 */
public class Functionality {
	
	/*Functional filtering and mapping operations on lists with lambdas.
	  See the Java Functional Filtering page for an introduction. 
	  The main computation for each of these problems can be done with 1 or 2 lines of lambda code.*/
	 
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	//Given a list of integers, return a list of the integers, omitting any that are less than 0
	public List<Integer> noNeg(List<Integer> nums) {
		  nums.removeIf(n -> n < 0);
		  return nums;
		  
		}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	//Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
	public List<Integer> no9(List<Integer> nums) {
		  nums.removeIf(n -> (n%10==9));
		  return nums;
		}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	//Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
	
	public List<Integer> noTeen(List<Integer> nums) {
		  nums.removeIf(n -> (n>=13 && n<=19)); // replaceAll -заменить
		  return nums;
		}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	//Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
	
	public List<String> noZ(List<String> strings) {
			
			List<String> strings2 = new ArrayList<String>();
			
			for(String s : strings)
			{
				if (!(s.contains("z")))
				{
					strings2.add(s);
				}
			}
			return strings2;
			}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	//Given a list of strings, return a list of the strings, omitting any string length 4 or more.
	
	public List<String> noLong(List<String> strings) {
			
			List<String> strings2 = new ArrayList<String>();
			
			for(String s : strings)
			{
				if (s.length()<4)
				{
					strings2.add(s);
				}
			}
			return strings2;
			}
	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	//Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
	
	public List<String> no34(List<String> strings) {
	  
			
			List<String> strings2 = new ArrayList<String>();
			
			for(String s : strings)
			{
				if ((s.length()!=4) && (s.length()!=3))
				{
					strings2.add(s);
				}
			}
			return strings2;
			}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	//Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.

	public List<String> noYY(List<String> strings) {
		  List<String> strings2 = new ArrayList<String>();
				
				
			
				for(String s : strings)
				{
				  if (s.equals(""))
				  {
				    strings2.add(s+"y");
				  }
					else if ( s.substring(s.length()-1, s.length()).equals("y")|| s.contains("yy"))
							{
							//strings2.add(s);
							}
					else strings2.add(s+"y");
				}
				return strings2;
				}

	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	//	Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
	public List<Integer> two2(List<Integer> nums) {
		  List<Integer> strings2 = new ArrayList<Integer>();
				
				for(Integer s : nums)
				{
					if (!((s*2)%10==2))
					{
						strings2.add(s*2);
					}
					
				}
				return strings2;
		}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	//Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
		
	public List<Integer> square56(List<Integer> nums) {
		  List<Integer> strings2 = new ArrayList<Integer>();
				
				for(Integer n : nums)
				{
					if (!(((n*n)+10)%10==5) && !(((n*n)+10)%10==6))
					{
						strings2.add(n*n+10);
					}
					
				}
				return strings2;
		}

}
	
	


