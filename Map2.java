/**
 * 
 */
package pack1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * created by Raushan_Safiullin
 *
 */
public class Map2 {	
	
	
	// Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.
	
	public Map<String, Integer> word0(String[] strings) {
		  Set<String> set=new LinkedHashSet<String>();
				
				Map<String, Integer> map=new HashMap<String, Integer>();
				
				for(String s: strings)
				{
					map.put(s, 0);
				}				
				return map;
		}
	
	
	//Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.
	
	public Map<String, Integer> wordLen(String[] strings) {
		  Map<String, Integer> map = new HashMap<String, Integer>();
				
				for(String s: strings)
				{
					map.put(s, s.length());
				}
				
				return map;
		}
	
	//Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.

	public Map<String, String> pairs(String[] strings) {
			
			Map<String, String> map = new HashMap<String, String>();
			
			for(String s: strings)
			{
			map.put(s.substring(0,1), s.substring(s.length()-1,s.length()));
			}
			
			return map;
			  
		}
	
	//The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
	
	
	public Map<String, Integer> wordCount(String[] strings) {
			
			Map<String, Integer> map = new HashMap<String, Integer>();
			
			for(String s: strings)
			{
				if(map.containsKey(s))
					map.put(s, map.get(s)+1);
				else {
					map.put(s, 1);
				}
			}
			return map;		  
		}

		
	//Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
	
	
	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		
		for(String s: strings)
		{
			if (map.containsKey(s.substring(0, 1)))
			{
				String temp=map.get(s.substring(0, 1));
				map.put(s.substring(0, 1), temp+s);
			}
			else
			{
				map.put(s.substring(0, 1), s);
			}
		}
		return map;
		  
	}
	
	
	//Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
	
	
public String wordAppend(String[] strings) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		StringBuilder str=new StringBuilder();
		
		for(String current: strings)
		{
			if(map.containsKey(current))
			{
				str.append(current);
				map.remove(current);
			}
			else
			{
				map.put(current, current);
			}
		}		  
		return str.toString();	
	}


	//Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.

		public Map<String, Boolean> wordMultiple(String[] strings) {
			
			
			Map<String, Boolean> map = new HashMap<String, Boolean>();
			
			for(String s: strings)
			{
				if(map.containsKey(s))
				{
					map.put(s, true);
				}
				else {
					map.put(s, false);
				}
			}	
			return map;
		}
		
		//We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
		
		
		public String[] allSwap(String[] strings) {
			  
			  
			  Map<String, Integer> map = new HashMap<String,  Integer>();
			  ArrayList<Integer> list = new ArrayList<Integer>();
			  for(int i=0;i<strings.length;i++)
			  {
				  for(int j=1;j<strings.length;j++)
				  {
					  if((!(list.contains(i))) && (!(list.contains(j))) &&  !(i==j) && match(strings[i], strings[j]))
							  {
						  		String temp=strings[i];
						  		strings[i]=strings[j];
						  		strings[j]=temp;
						  		list.add(i);
						  		list.add(j);
						  		break;
							  }
				  }
			  }
			  return strings;
			  
		}
			 
		
		boolean match(String s1, String s2)
		{
			if ( s1.length()>0 && s1.charAt(0)==s2.charAt(0) )
			{
				return true;
			}		
			else return false;
			
		}
		
		
		//We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
		
		
		
		public  String[] firstSwap(String[] strings) {
			
			String sb= new String();
			  for(int i=0;i<strings.length;i++)
			  {
				  for(int j=1;j<strings.length;j++)
				  {
					  if((!(sb.contains(""+strings[i].charAt(0)))) &&  !(i==j) && match(strings[i], strings[j])) // see "match" method in the previous task 
							  {
						  		String temp=strings[i];
						  		strings[i]=strings[j];
						  		strings[j]=temp;
						  		sb=sb+(strings[i].charAt(0));					  		
						  		break;
							  }
				  }
			  }
			  return strings;
			}

}
