package com.sgtesting.pom;
class DoWhileLoop7Reverse
{
	public static void main(String args[])
	{
		int i=10;
		do
		{
			int res=i*7;
			System.out.println("7*"+i+"="+res);
			i--;
		}while(i>=1);
	}
}