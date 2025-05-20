package day1com.demo.beans;

import java.util.Arrays;

public class MyClass {
	
 	private int[]arr;
    private int count;
    public MyClass()
     {
    	 super();
    	 arr=new int[10];
    	 count=0;
     }
    public MyClass(int size)
    {
   	 super();
   	 arr=new int[size];
   	 
    }
    
    public MyClass(int[] arr)
    {
   	 super();
   	 this.arr=arr;
   	 count=arr.length;
    }
    public void add(int x)
    {
    	if(count<arr.length)
    	{
    		arr[count]=x;
    		count++;
    	}
    }
    public int getLength()
    {
    	return arr.length;
    }
    public int getSum()
    {
    	int sum=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		sum +=arr[i];
    	}
    	return sum;
    }
    
    public void leftrotateARR(int n)
	{
		if(n>arr.length)
		{
			System.out.println("rotation  not possible");
		}
		else
		{
			int temp=arr[0];
			for(count=1;count<n;count++)
			{
				for(int i=1;i<arr.length;i++)
				{
					arr[i-1]=arr[i];
				}
				arr[arr.length-1]=temp;
				System.out.println("rotation----->"+count);
				System.out.println(arr.toString());
				
			}
		}
	}
    
    
    public void rightrotateArr(int n) {
    	if(n>=arr.length) {
    		System.out.println("Rotation is not possible,n should be <"+arr.length);
    		
    	}else {
    	 for(count=1;count<=n;count++) {
    	  int temp1=arr[arr.length-1];
    	 
    	  for(int i=arr.length-2;i>=0;i--) {
    		  arr[i+1]=arr[i];
    	  }
    	  arr[0]=temp1;
        }
    	
    		
    	}
    }
    
    public int findMax() {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	//replace index with values in the array
	public int[] replaceIndexValue() {
		//find maximum value
		int max=findMax();
		//create a new array with size max+1
		int[] newarr=new int[max+1];
		//initialize it with -1
		for(int i=0;i<newarr.length;i++) {
			newarr[i]=-1;
		}
		//then from old array read value and index, at value position add index
		for(int i=0;i<arr.length;i++) {
			 int pos=arr[i];
		     newarr[pos]=i;
			
		}
		return newarr;
	}
		public int[] reverseArray(boolean flag) {
			if(flag) {
				for(int i=0,j=arr.length-1;i<j;i++,j--)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				return arr;
			}
			
			
		else
			{
				int[] arr1=new int[arr.length];
				for(int i=arr.length-1,j=0;i>=0;i--,j++)
				{
					arr1[j]=arr[i];
				}
				return arr1;
			}
		
		
		}
		@Override
		public String toString() {
			return "MyClass [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
		}
		
		
		
	}
    


