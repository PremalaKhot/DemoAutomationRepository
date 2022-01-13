package com.sgtesting.pom;

class SumOfNumbers
{
	int getsum()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}

public class SumofFirst10Numbers {

	public static void main(String[] args) {
		SumOfNumbers o=new SumOfNumbers();
		int sum=o.getsum();
		System.out.println("sum of first ten numbers:"+sum);
	}
}