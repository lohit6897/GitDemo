package Practice;

public class minarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]= {{2,4,5},{3,4,7},{5,2,16}};
		int min=b[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
//				if(b[i][j]<min)
//				{
//					min=b[i][j];
//				}
				
				if(b[i][j]>min)
				{
					min=b[i][j];
				}
				
				
				
			}
		}
		System.out.println(min);
		
		
		
		
		

	}

}
