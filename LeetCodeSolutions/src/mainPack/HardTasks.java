package MainPack;

import java.util.Arrays;

public class HardTasks {
	// 65. Valid number
	//Validate if a given string can be interpreted as a decimal number.

		public boolean isNumber(String s) {        
	
			s=s.trim();
			
			try{				
				BigDecimal bd= new BigDecimal(s);		// exclude most of false cases, but rejects some true cases (by the task conditions)
				return true;
					}
			catch(Exception e){
				
				int sLen=s.length();
				
				if(sLen==0 || s.contains(" "))				   
					return false;
				
				boolean hasExtent=false;
				boolean hasDot=false;
						
				for(int i=0;i<sLen;i++)
				{					
					char currentChar = s.charAt(i);					
					
					if(currentChar=='e')
					{
						if( 
						   i==0 ||
						   i==sLen-1 ||
						   hasExtent==true  ||
						   i+1<sLen && (!Character.isDigit(s.charAt(i+1))) // after extent symbol should be a digit char
						)
						{
							return false;
						}
						else  {
							hasExtent=true;
							continue;
						}
						
					}
					else if(currentChar=='.')
					{
						if(
							sLen==1 ||
							i==sLen-1 ||
							hasDot==true ||
							hasExtent==true ||		// there shouldn't be a dot after an extent symbol
							i+1<sLen && (!Character.isDigit(s.charAt(i+1)))	
								)
						{
							return false;
						}
						else {
							hasDot=true;
							continue;
						}
					}
					else if (!Character.isDigit(currentChar))
					{
						return false;
					}
				}						
		return true;
		}	
}
	
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
