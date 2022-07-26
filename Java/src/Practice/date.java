package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		//System.out.println(d.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("y M d");
		System.out.println(sdf.format(d));
		

	}

}
