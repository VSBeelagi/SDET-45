package maven_scripts;

import org.testng.annotations.Test;

public class TestScript1_Test {
	
	@Test(groups = "smoke")
	public void script1_test()
	{
		System.out.println("smoke Test Script - 1");
	}

	
	@Test(groups = "regression")
	public void script2_test()
	{
		System.out.println("regression Test Script - 2");
	}
}
