package Practice;

import java.util.Scanner;

public class capsmall 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str1;
	      System.out.println("Enter an String :: ");
	      Scanner sc = new Scanner(System.in);
	      str1 = sc.nextLine();
	      int count=0;
	      int count1= 0;
	      int count2 = 0;
	      int count3 = 0;
	      int count4 = 0;
	    
	      // Count of alphabet
	    for (int i=0;i<str1.length();i++)
	    {
	       if(Character.isLetter(str1.charAt(i)))
	    	   count++;
	    }
	    
	 // Count of Lower case alphabet
	    for (int i=0;i<str1.length();i++)
	    {
	       if(Character.isLowerCase(str1.charAt(i)))
	    	   count1++;
	    }
	    
	    // Count of Upper case alphabet
	    for (int i=0;i<str1.length();i++)
	    {
	       if(Character.isUpperCase(str1.charAt(i)))
	    	   count2++;
	    }
	    
	    // Count of Digits case alphabet
	    for (int i = 0; i < str1.length(); i++)
	    {
	    	if (Character.isDigit(str1.charAt(i)))
	    		count3 ++;
	    }
	    
	    // Count of White space
	    for (int i = 0; i < str1.length(); i++)
	    {
	    	if (Character.isWhitespace(str1.charAt(i)))
	    		count4 ++;
	    }
	
	    
	System.out.println("the number of toatl alphabets in the given string is:"+count);
	System.out.println("the number of Lower case alphabets in the given string is:"+count1);
	System.out.println("the number of Upper case alphabets in the given string is:"+count2);
	System.out.println("the number of Digits case alphabets in the given string is:"+count3);
	System.out.println("the number of Whitespace in the given string is:"+count4);	  
	}
}



