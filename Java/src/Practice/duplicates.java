package Practice;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="loohiittthh";
	        for(int i=0;i<str.length();i++)
	        {
	            for(int j=i+1;j<str.length();j++)
	            {
	            //char ch=str.charAt(i);
	            if(str.charAt(i)==str.charAt(j))
	            {
	            	
	             System.out.println(str.charAt(j));
	            }
	            
	            
	        }
	        
	    }

	}

}
