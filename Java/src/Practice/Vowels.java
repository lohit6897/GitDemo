package Practice;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String name = "Rajanlohitkumar";
	       int counta =0;
	       int counte =0;
	       int counti =0;
	       int counto =0;
	       int countu =0;
	       
	       
	       for (int i = 0; i <name.length(); i++)
	  {
	       char word = name.charAt(i);
	       if (word == 'a') 
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
	       System.out.println("Count of a is " + counta);
	       System.out.println("Count of e is " + counte);
	       System.out.println("Count of i is " + counti);
	       System.out.println("Count of o is " + counto);
	       System.out.println("Count of u is " + countu);
	      
	}
}
