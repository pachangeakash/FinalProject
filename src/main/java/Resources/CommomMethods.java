package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommomMethods extends BaseClass {
	
	 public static void commonselect(WebElement dropdownElement, String optionText) {
		  
	      Select dropdown = new Select(dropdownElement);
	      dropdown.selectByVisibleText(optionText);
	  }

	public static void assersion(String at,String et,String Msg) {
	
	SoftAssert assertions =new SoftAssert();
	assertions.assertEquals(at, et, Msg);
	//assertions.assertAll();
}

}
