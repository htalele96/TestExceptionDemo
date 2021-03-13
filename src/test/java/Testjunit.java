import org.junit.Test;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

import junit.framework.Assert;
import testpractice.ExceptionDemo;

public class Testjunit {

	@Test(expected = NoSuchElementException.class)
	public void addButtonNoRowException() {
		ExceptionDemo testException=new ExceptionDemo();
		testException.goTo();
		testException.EditBtn("row1");
		
		testException.inputFiled("mango", "row1");
		testException.saveBtn("row1");
		testException.addBtn("row1");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testException.inputFiled("Apple", "row2");
		//testException.addBtn("row1");
		
	}
	
	@Test(expected = ElementNotInteractableException.class)
	public void addButtonElementNotInteractableException() {
		ExceptionDemo testException=new ExceptionDemo();
		testException.goTo();
		testException.EditBtn("row1");
		
		testException.inputFiled("mango", "row1");
		testException.saveBtn("row1");
		testException.addBtn("row1");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	testException.EditBtn("row2");
		testException.inputFiled("Apple", "row2");
		
		
		testException.saveBtnByName("Save");
		
	}
	
	@Test(expected = InvalidElementStateException.class)
	public void addButtonInvalidElementStateException() {
		ExceptionDemo testException=new ExceptionDemo();
		testException.goTo();
		//testException.EditBtn("row1");
		
		testException.inputFiled("mango", "row1");

		
	}


	@SuppressWarnings("deprecation")
	@Test(expected = StaleElementReferenceException.class)
	public void addButtonStaleElementReferenceException() {
		ExceptionDemo testException=new ExceptionDemo();
		testException.goTo();
		//testException.findElement();
		Assert.assertTrue(testException.verifyElementText("Push “Add” button to add another row"));

		
	}
	
}
