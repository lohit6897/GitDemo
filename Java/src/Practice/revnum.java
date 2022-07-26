package Practice;

public class revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=1234,rev=0,rem;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		
		System.out.println(rev);
	}

}
