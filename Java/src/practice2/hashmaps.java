package practice2;

import java.util.HashMap;

public class hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="lohhhiiittt";
		
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
        	char ch=str.charAt(i);
        	if(hm.containsKey(ch))
        			{
        				int count=hm.get(ch);
        				hm.put(ch, count+1);
        			}
        	else
        	{
        		hm.put(ch,1);
        	}
        }
        
        System.out.println(hm);
       
	}

}
