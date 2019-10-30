package Testmaven;

import org.testng.annotations.Test;

public class testNG {
  @Test
  public void signUp() {
	  System.out.println("signup if you are new user");
	  
  }
  @Test
  public void login() {
	  System.out.println("login if already existing user");
	  
  }
  
  @Test
  public void forgotPassword() {
	  System.out.println("reset your password");
}
}