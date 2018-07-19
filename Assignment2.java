package com.del;

public class Assignment2 
{
	public static void main(String[] args) {
	for(int i=1;i<=50;i++)
	{
		if(i%3==0)
		{
			System.out.print("abc ");
		}
		else if(i%5==0)
		{
			System.out.print("xyz ");
		}
		else if(i%3==0 && i%5==0)
		{
			System.out.print("abcxyz ");
		}
		else
		{
			System.out.print(i+" " );
			
		}
		}
}
}


