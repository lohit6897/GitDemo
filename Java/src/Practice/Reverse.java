package Practice;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="lohit";
		 String name1="";
	      
       
    
		
	       for(int i=name.length()-1;i>=0;i--)
	        {
	           char ch=name.charAt(i);
	           // name1=ch+name1;
	           name1=name1+ch;
	         
	            //System.out.println(ch);
	        }
	       System.out.println(name1);
	}

}
