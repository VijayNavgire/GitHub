package ARRAY;

public class G_intArrayMulti 
{
	public static void main(String[] args) 
	{
		int [][] ar= new int [2][3];
		ar [0][0]=10;
		ar [0][1]=70;
		ar [0][2]=80;
		ar [1][0]=40;
		ar [1][1]=30;
		ar [1][2]=90;
		
		System.out.println("---Print all Data from Integer Multiple Array---\n");
		System.out.println("Value in Array at 6 is "+ ar[1][2]);
		System.out.println("Array Size "+ ar.length);
		
		System.out.println("\nInteger Order Multiple Array ");
		for(int i=0; i<=1; i++)		// outer for loop (row)
		{
			for(int j = 0; j<=2; j++)	//inner for loop (column)
			{
				System.out.println(ar[i][j]+" ");
			}
			//System.out.println();
		}
		
		System.out.println("------------------");
		System.out.println("Reverse Order Int Multiple Array");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			for(int j=ar.length; j>=0; j--)
			{
				System.out.println(ar[i][j]);
			}
		}
	}

}
