package Practice;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int year=2000;
	    //System.out.println("Enter year:"+year);
	       if ( (year%400 == 0 )|| ((year% 4 == 0) && (year%100 != 0)))
	       System.out.println("leap Year");
	       else 
	       System.out.println("Not leap year");


	}

}
