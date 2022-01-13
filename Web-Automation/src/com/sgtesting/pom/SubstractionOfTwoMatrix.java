package com.sgtesting.pom;
class MatrixSubstraction
{
	int[][]getsubstraction(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		return c;
	}
}
public class SubstractionOfTwoMatrix {
	public static void main(String[] args) {
		int x[][]= {{9,8,7},{6,5,4}};
		int y[][]= {{1,2,3},{4,2,1}};
		MatrixSubstraction o=new MatrixSubstraction();
		int[][]substraction=o.getsubstraction(x, y);
		for(int i=0;i<substraction.length;i++)
		{
			for(int j=0;j<substraction[i].length;j++)
			{
				System.out.print(substraction[i][j]+" ");
			}
			System.out.println();
		}		
	}
}