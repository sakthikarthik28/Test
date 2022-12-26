package testng;

import org.testng.annotations.Test;

public class GruopsSample1 {
	@Test(groups = {"sanity","regression"})
	public void tc01() {
		System.out.println("tc01");
	}

	@Test(groups = "regression")
	public void tc02() {
		System.out.println("tc02");
	}

	@Test(groups = "retesting")
	public void tc03() {
		System.out.println("tc03");
	}

	@Test(groups = "sanity")
	public void tc04() {
		System.out.println("tc04");
	}

	@Test(groups = "regression")
	public void tc05() {
		System.out.println("tc05");
	}

}
