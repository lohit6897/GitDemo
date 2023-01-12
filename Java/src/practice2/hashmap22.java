package practice2;

import java.util.HashMap;

public class hashmap22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		 hm.put('l', 1);
		 hm.put('o', 6);
		 hm.put('h', 5);
		 hm.put('i', 4);
		 hm.put('t', 5);
		 
		// lohhhiiittt
		 
		 System.out.println(hm);
		 System.out.println(hm.get('i'));
		 System.out.println(hm.entrySet());
		 

	}

}
