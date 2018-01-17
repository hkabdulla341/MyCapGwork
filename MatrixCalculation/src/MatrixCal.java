
public class MatrixCal
{

    public static void main(String[] args)
    {
	int firstMatrix[][] = { { 10, 20, 30 }, { 40, 50, 60 } };
	int secordMatrix[][] = { { 1, 4 }, { 2, 5 }, { 3, 6 } };

	int aRowLen = firstMatrix.length;
	int aColnLen = firstMatrix[0].length;
	int bRowLen = secordMatrix.length;
	int bColnLen = secordMatrix[0].length;

	int resultMatrix [][] = new int [aRowLen][bColnLen];
	
	for(int i = 0; i < aRowLen; i++)
	{
	    for(int j = 0; j < bColnLen; j++)
	    {
		for(int k = 0; k < aColnLen; k++)
		{
		    resultMatrix [i][j] += firstMatrix[i][k] * secordMatrix[k][j]; 
		}
	    }
	}
	

	for (int[] aRow : resultMatrix)
	{
	    for (int aVal : aRow)
	    {
		System.out.print(aVal + "\t");
	    }

	    System.out.println();
	}

    }

}
