package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.RegisterPageObjectModel;
import Resources.BaseClass;
import Resources.Constants;
import Resources.Creative1;

public class VerifyRegistration extends BaseClass {
	public static String email;
	
	SoftAssert assertions = new SoftAssert();
	@Test
	public void validRegistration() {
		RegisterPageObjectModel RPOM = new RegisterPageObjectModel(driver);

		
		RPOM.myaccount().click();
		RPOM.ragister().click();
		RPOM.firstname().sendKeys(Constants.firstname);

		RPOM.lastname().sendKeys(Constants.lastname);
				email = Creative1.generateemail();

				RPOM.email().sendKeys(email);
				RPOM.telephone().sendKeys(Constants.phone);
				RPOM.password().sendKeys(Constants.password);
				RPOM.passwordconfirm().sendKeys(Constants.password);
				RPOM.agreecheckbox().click();
				RPOM.continuebotton().click();
				System.out.println(email);

				String P = RPOM.validtext().getText();
				String Q = Constants.expectedtext;
				assertions.assertEquals(P, Q, "ENTER INVALID DATA");
				assertions.assertAll();

			}


	}


