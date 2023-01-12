package Practice;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("lohit");
		al.add("kumar");
		al.add("nithu");
		al.add("hari");
		System.out.println(al.size());
		System.out.println(al);
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}
