package com.sgtesting.pom;
class DoWhileLoopOdd71To51
{
	public static void main(String args[])
	{
		int i=71;
		do
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i=i-1;
		}while(i>=51);
	}
}