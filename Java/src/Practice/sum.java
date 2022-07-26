package Practice;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int sum = 7; 

	       int arr[] = {1, 2, 3, 4, 5, 6}; 

	       int n = arr.length; 

	       for(int i=0;i<n;i++) 
	       {

	        for (int j=0;j<n; j++) 
	        { 

	            if (sum == arr[i] + arr[j]) 

	                System.out.println(arr[i] +"," + arr[j]); 
	    }
	}

	}

}
