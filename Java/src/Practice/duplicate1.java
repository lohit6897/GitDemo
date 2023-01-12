package Practice;

public class duplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = new String("abbcccddd");
        String output = "";

        for (int i = 0; i < input.length(); i++)
        {
           char ch=input.charAt(i);
           //System.out.println("test"+output.indexOf(ch));
           if(output.indexOf(ch)<0)
           {
        	   output=output+ch;   
               
                }
            }
        
      System.out.println(output);
      

	}

}
