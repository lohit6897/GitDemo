package Practice;

public class stringg22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "beautiful bea ch";
	      //char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (str.charAt(i) == str.charAt(j)) {
	               System.out.print(str.charAt(j) + " ");
	               break;
	            }
	         }
	      }

	}

}
