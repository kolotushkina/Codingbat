package pack1;

public class Logic2 {

	//	Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
			
	public int loneSum(int a, int b, int c) {
		
		  if (a==b)
		  {
		    if(a==c)
		      return 0;
		    
			  return c;
		  }
		  if (a==c)
		  {
			  return b;
		  }
		  if (b==c)
		  {
			  return a;
		  }
		  if ((a==c) && (a==b))
		  {
			  return 0;
		  }
		return a+b+c;
		}
	
	//Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
	
	
		public int luckySum(int a, int b, int c) {
				
				if(a==13)
				{return 0;}
				if(b==13)
				{return a;}
				if(c==13)
				{return a+b;}
				
				return a+b+c;
				  
			}
		
		//Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().
		
		public int noTeenSum(int a, int b, int c) {
			  
			 	  return fixTeen(a)+fixTeen(b)+fixTeen(c);
			}
		public int fixTeen(int n)
		{
			if (n>12 && n<20&& n!=15 && n!=16)
				return 0;
			return n;
		}
		
		//		For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
		
		
		public int roundSum(int a, int b, int c) {		
			  return round10(a)+round10(b)+round10(c);
		}
		
		public int round10(int num)
		{
			if (num%10>4)
			{
				num+=(10-num%10);
			}
			else
			{
				num-=(num%10);
			}
			return num;
		}
		
		//Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
		
		public boolean closeFar(int a, int b, int c) {
			  
		    int diff1=Math.abs(a-b);
		    int diff2=Math.abs(a-c);
		    int diff3=Math.abs(c-b);
			  
			 return ((diff1<2 && diff2>1 && diff3>1) ||(diff2<2 && diff1>1 && diff3>1));
	}
		
		//		Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
		
		public int blackjack(int a, int b) {
			  if (a>21 && b>21) return 0;
			  if (a>21) return b;
					  if (b>21 || a>b) 
					  return a;
					  return b;
			}

		
		//		Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
		
		public boolean evenlySpaced(int a, int b, int c) {
			  if((a-b)==(b-c)|| (b-a)==(a-c) || (c-a)==(a-b) || (c-b)==(b-a) || (a-c)==(c-b) ) {
				  return true;
				  }		
			return false;
			}
		
		//We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
		
		
		public int makeChocolate(int small, int big, int goal) {
			  while (big*5>goal)
			  {
				  big-=1;
			  } 
			  if ((small+big*5)<goal ) {return -1;}
			  return goal-big*5;		 
			}

}
