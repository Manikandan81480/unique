package ivtl;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.*;
public class hu3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int aa[]=new  int[100];
		int a[]=new  int[100];
		int b[]=new  int[100];
		int n=x.nextInt();
		int i=0,j=0,c=0,p=0,flag=0;
		boolean contains=false;
		for(i=0;i<n;i++)
		{
			a[i]=x.nextInt();
		}
       
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)

		{
				if(a[i]==a[j])
				{
				 b[c]=a[i];
				 c++;
				}
				}
		}
		
		Set<Integer> set = new HashSet<Integer>();
		for( i=0;i<n;i++)
	    {
	    	set.add(a[i]);
	    }
		System.out.println("\nPrint Set Value via Iterator: ");
		  Iterator<Integer> itr=set.iterator();  
		  while(itr.hasNext()){  
		   aa[p]=(Integer)itr.next();  
		   p++;
		  }  
		  
		  for(i=0;i<a.length;i++)
		  {
		  	for(j=0;j<b.length;j++)
		  	{
		  		if(aa[i]==b[j])
		  			flag++;
		  	}
		  	if(flag==0)
		  		System.out.println(aa[i]);
		  	    flag=0;
		  	    
		  }
		  	}
		    
			}
			


	
