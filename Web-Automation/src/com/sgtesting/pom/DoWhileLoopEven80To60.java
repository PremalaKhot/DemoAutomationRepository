package com.sgtesting.pom;
class DoWhileLoopEven80To60
{
	public static void main(String args[])
	{
		int i=80;
		do
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i=i-1;
		}while(i>=60);
	}
}