package Practice;

public class australiantraffic implements continental_trafic
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		continental_trafic ct=new australiantraffic();
		ct.green();
		ct.red();
		ct.yellow();
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("start go");
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("stop");
		
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("start");
		
	}

}
