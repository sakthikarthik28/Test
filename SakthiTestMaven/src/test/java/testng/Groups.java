package testng;

import org.testng.annotations.Test;

public class Groups {
  @Test (groups = "sanity")
  public void tc01() {
	  System.out.println("tc_01");
  }
  
  @Test (groups = "Regression")
  
  public void tc02() {
	  System.out.println("tc_02");
  }
  @Test (groups = "Retesting")
  
  public void tc03() {
	  System.out.println("tc_03");
  }
  @Test (groups = "sanity")
  
  public void tc04() {
	  System.out.println("tc_04");
  }
  @Test (groups = "Retesting, sanity")
  
  public void tc05() {
	  System.out.println("tc_05");
  }
}
