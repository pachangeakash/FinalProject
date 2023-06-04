package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LogInPageObjectModel;
import Resources.BaseClass;
import Resources.Constants;

@Test
public class VerifyLogIn extends BaseClass {
	SoftAssert assertions = new SoftAssert();

	public void validlogin() throws IOException, InterruptedException {
		LogInPageObjectModel LPOM = new LogInPageObjectModel(driver);

		LPOM.myaccount().click();
		LPOM.login().click();
		LPOM.emaillogin().sendKeys(Constants.email);
		LPOM.password().sendKeys(Constants.password);
		LPOM.loginclick().click();

		String A = LPOM.validtext().getText();
		String B = "My Account";

		assertions.assertEquals(A, B, "fails with data");

		assertions.assertAll();
	}

}
