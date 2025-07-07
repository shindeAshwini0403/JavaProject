package This;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class HashMap {

	private static final int ArrayList = 0;

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("car");
		list.add("one");
		list.add("two");
		list.add("three");
	    list.add("two");
	    list.add("one");
		System.out.println(list);

		ArrayList list1= new ArrayList(Arrays.asList("asshw",12,"Ram","Car"));
		System.out.println(list1);
		for( Object o:list1)
		{
			System.out.println(o);
		}
		ListIterator itr = list1.listIterator();
		while(itr.hasNext())
		{
			System.out.println("name="+itr.next());
		}
	
		System.out.println(list1.get(1));
		System.out.println("Remove vaalue="+list1.remove(3)+" "+list1.remove(2));
		System.out.println(list1);
		  
		//Copy one arraylist into list2
		
	
		list.addAll(list1);
		System.out.println(list);
		
		//print lisst revese formate
		int size = list.size();
//		for(int i=size-1;i>0;i++)
//		{
//			System.out.println("using for loop"+list.get(i));
//		}
		//by using inbuild method
		Collections.reverse(list);
		System.out.println("using collection method="+list);
		//rmove the dublicate value
	    HashSet set=new HashSet(list);
	    System.out.println(set);
	    
	    
		
		
		
		
		

	}

}
