package Practice;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {13,2,5,14,5,22,2,2};
		String name[]= {"one","two","three","four"};
		//char vowel[]= {'a','e','i','o','u'};
		String sent= "usm business systems";
		
		String update="";
		
			int counta =0;
	       int counte =0;
	       int counti =0;
	       int counto =0;
	       int countu =0;
	       int count=0;
	       int temp;
	       for(int i=0;i<arr.length;i++)
	       {
	    	   //for(int j=i+1;j<arr.length;j++)
	    	  // {
	    		   if(arr[i]==2)
	    		   {
	    			   //temp=arr[i];
	    			   //arr[i]=arr[j];
	    			   //arr[j]=temp;
	    			   //System.out.println("value " +arr[i]);
	    			   count++;
	    		   }
	    	   //}
	    	   
	    	   //System.out.println(arr[i]);
	       }
	       System.out.println("count 2 "+count);
	       //System.out.println("second largest number" + arr[arr.length-2]);
	    
	   
	       
	       
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		for(int i=sent.length()-1;i>0;i--)
		{
			
	      System.out.println(sent.charAt(i));
	      char ch=sent.charAt(i);
	      if(ch!=' ') {
	      update=update+ch;
	      }
	      
		}
		System.out.println(update);
		
		for(int i1=0;i1<sent.length();i1++)
		{
		char word=sent.charAt(i1);
			if(word=='a')
			{
				counta++;
			}
			if (word == 'e')
		       {
		           counte++;
		       }
		        if (word == 'i')
		        {
		           counti++;
		       }
		       if (word == 'o')
		       {
		           counto++;
		       }
		       if (word == 'u')
		       {
		           countu++;
		       }
		 }
		      /* for(int i=0; i<sent.length(); i++) 
		       {    
		            if(sent.charAt(i) = ' ')  
		            {
		                count++;  
		              }
		       }*/
		

		   System.out.println("Count of a is " + counta);
	       System.out.println("Count of e is " + counte);
	       System.out.println("Count of i is " + counti);
	       System.out.println("Count of o is " + counto);
	       System.out.println("Count of u is " + countu);
	       System.out.println("Count of chars are " + sent.chars().count());
	       
}
}

	
