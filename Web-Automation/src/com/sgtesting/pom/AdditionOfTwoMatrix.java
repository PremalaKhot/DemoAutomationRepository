package com.sgtesting.pom;
class MatrixAddition
{
	int[][] getaddition(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}
public class AdditionOfTwoMatrix {
	public static void main(String[] args) {
		int x[][]= {{1,2,3},{4,5,6}};
		int y[][]= {{6,7,8},{9,5,2}};
		MatrixAddition o=new MatrixAddition();
		int[][] addition=o.getaddition(x,y);
		for(int i=0;i<addition.length;i++)
		{
			for(int j=0;j<addition[i].length;j++)
			{
				System.out.print(addition[i][j]+" ");
			}
			System.out.println();
		}
	}
}