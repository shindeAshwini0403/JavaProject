package This;

public class CopyArray {

	public static void main(String[] args) 
	{
		int a[]= {1,3,4,5,6};
		int b[]= {7,8,9,10};
		for(int i=0;i<a.length-1;i++)
		{
			int temp;
			temp=a[i];
			b[i]=temp;	
		}
		System.out.println("After copy value=");
		for( int o:b)
		{
			System.out.println(o);
		}
		
		
	    
		

	}

}
