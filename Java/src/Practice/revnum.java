package Practice;

public class revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer num=1221,rev=0,rem;
		Integer temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		
		System.out.println(rev);
		System.out.println(num);
		System.out.println(temp);
		 if(temp.equals(rev))
	        {
	          System.out.println("palindrome");
	        }
	        else
	        {
	          System.out.println("not palindrome");  
	        }
	}

}
