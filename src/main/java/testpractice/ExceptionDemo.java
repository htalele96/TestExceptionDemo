package testpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionDemo {
	
		static WebDriver driver=null;
		
		public void goTo() {
			System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-exceptions/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		
		public void inputFiled(String itemName,String rowName) throws NoSuchElementException, InvalidElementStateException{
			WebElement row=driver.findElement(By.id(rowName));
			WebElement input=row.findElement(By.className("input-field"));
			input.clear();
			input.sendKeys(itemName);
			
		}
		
		 public boolean verifyElementText(String text) throws StaleElementReferenceException{
			WebElement input=driver.findElement(By.id("instructions"));
			this.addBtn("row1");
			return text.equals(input.getText());
		}
		
		
		public void saveBtn(String rowName) {
			WebElement row=driver.findElement(By.id(rowName));
			WebElement saveButton= row.findElement(By.id("save_btn"));
			saveButton.click();
			
		}
	
	public void saveBtnByName(String btnName) throws ElementNotInteractableException{
		WebElement saveButton=driver.findElement(By.name(btnName));
		saveButton.click();
		
	}

	public void addBtn(String rowName) throws StaleElementReferenceException {
		WebElement row=driver.findElement(By.id(rowName));
		WebElement addButton= row.findElement(By.id("add_btn"));
		addButton.click();
	}

	public void EditBtn(String rowName){
		WebElement row=driver.findElement(By.id(rowName));
		WebElement EditButton= row.findElement(By.id("edit_btn"));
		EditButton.click();
		
		
	}

}
