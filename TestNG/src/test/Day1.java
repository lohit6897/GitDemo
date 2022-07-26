package test;

import org.testng.annotations.Test;

public class Day1 {
	
	@Test(priority=2)
	public void Demo()
	{
		System.out.println("hello");
	}

	@Test(priority=1)
	public void Demo1()
	{
		System.out.println("hello1");
	}

}
