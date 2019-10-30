package Testmaven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testNGgrouping {
  @Test
  public class testNG {
	  @Test (groups = {"sanity"})
	  public void signUp() {
		  System.out.println("signup if you are new user");
		  
	  }
	  @Test (groups = {"regression"})
	  public void login() {
		  System.out.println("login if already existing user");
		  
	  }
	  
	  @Test (groups = {"UAT"})
	  @Parameters( {"Location", "DCNO"})
	  public void forgotPassword(String Location,String DCNO) {
		  System.out.println("reset your password");
		  System.out.println(Location);
		  System.out.println(DCNO);

	}
	}
  }

