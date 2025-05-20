package day1com.demo.beans;

public class ArrayService {

	private static int arr[][];
	private int count;
	Scanner sc =new Scanner
	public ArrayService() {
		super();
		arr=new int[3][3];
	}
	public ArrayService(int[][] arr, int count) {
		super();
		this.arr = arr;
		this.count =arr.length;
	}
	public ArrayService(int row,int col)
	{
		arr=new int[row][col];
	}
	public static int[][] add(int a1[][],int a2[][])
	{
		int newArray[][]=new int[a1.length][a1[0].length];
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1[0].length;j++)
			{
				newArray[i][j]=a1[i][j]+a2[i][j];
			}
		}
		return newArray;
	}
	
	public static int acceptEle() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				
				
				arr[i][j]=sc.nextInt();
				
			}
		}
	}
	
	
	
}
