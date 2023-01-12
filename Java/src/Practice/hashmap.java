package Practice;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String string1 = "gggggreatresponsibilty";
	    char string[] = string1.toCharArray();
	    HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
	    for (int i = 0; i < string.length; i++) 
	    {
	        for (int j = i + 1; j < string.length; j++)
	        {
	            Integer value = hashMap.get(string[i]);
	            if (value == null) {
	            
	                value = 0;
	            }
	            if (string[i] == string[j]) {
	                hashMap.put(string[i], value + 1);
	            } else {
	                hashMap.put(string[i], 1);
	            }
	        }
	        
	    }
	    System.out.println(hashMap);*/
		
		
		String str = "ggoooogle";  
		//HashMap char as a key and occurrence as a value  
		HashMap <Character, Integer> ch = new HashMap<Character, Integer>();  
		//for (int i = str.length() - 1; i >= 0; i--)   
		for(int i=0;i<str.length();i++)
		{  
		if(ch.containsKey(str.charAt(i)))   
		{  
			
		int count = ch.get(str.charAt(i));  
	
		ch.put(str.charAt(i),count+1);  
		
		}   
		else   
		{  
		ch.put(str.charAt(i),1);  
		}  
		}  
		System.out.println(ch); 

	}

}
