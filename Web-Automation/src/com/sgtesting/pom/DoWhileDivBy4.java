package com.sgtesting.pom;
class DoWhileDivBy4
{
	public static void main(String args[])
	{
		int i=1;
		do
		{
			if(i%4==0)
				System.out.println(i);
			i=i+1;
		}while(i<=50);
	}
}