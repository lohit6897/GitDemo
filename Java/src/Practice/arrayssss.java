package Practice;

import java.util.Arrays;

public class arrayssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {90, 23, 5, 109, 12, 22, 67, 34};   

		//invoking sort() method of the Arrays class   

		Arrays.sort(arr);    

		System.out.println("Elements of array sorted in ascending order: ");   

		//prints array using the for loop   

		for (int i = 0; i < arr.length; i++)    

		{        

		System.out.println(arr[i]); 
		    }
		    
		System.out.println(arr[arr.length-2]); 
		    }
		}

	
