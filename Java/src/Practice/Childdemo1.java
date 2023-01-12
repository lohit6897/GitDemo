package Practice;

public class Childdemo1 extends Parentdemo1
{
	
	public void engine()
	{
		System.out.println("Engine is ready");
	}
	
	public void color()
	{
		System.out.println(color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentdemo1 pd1=new Parentdemo1();
		Childdemo1 cd1=new Childdemo1();
		
		pd1.audio();
		pd1.brakes();
		pd1.gear();
		
		
		cd1.color();
		cd1.engine();
		
		

	}

}
