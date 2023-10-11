package Locator_Concept;

import java.util.concurrent.TimeUnit;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocators {

	WebDriver driver;
	
	//@Before
	public void init() {
		// init means intialization

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		driver = new ChromeDriver(); // creating an object
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
	//@Test
	public void learnLocators() throws Exception {
		//Locator: Name
		driver.findElement(By.name("firstname")).sendKeys("abcdef");
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		driver.findElement(By.name("Password")).sendKeys("abc123");
		
		//Locator: id
		driver.findElement(By.id("sex-1")).click();

//		Locator: ClassName: 
//		uploading a file from my laptop drive: or use Robot Class if the tag is not mentioned as >>>input<<<
		driver.findElement(By.className("input-file")).sendKeys("C:\\NextTechITC\\EXAMS\\Exam_01_Test case_04172022\\TC Template_FALGUN.xlsx");		
		
		
//		Locator Link Text / Hyperlink:
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();

//		To come back to the previous page from the above linked page to go/click the next linked page.
		driver.navigate().back();
		
//		Locator: PartialLinkText: .
//		for example, from Ensure that the word we pass is UNIQUE word
//		so, out of "TF-API Product Backend" take only "Backend"
//		driver.findElement(By.partialLinkText("TF-API Product Backend")).click();
		
//		CSS Locator
//		A) taking id attribute option and writing "input#value" 
		driver.findElement(By.cssSelector("input#profession-1")).click();
		
//		CSS Locator: to find element by writing input [attribute = 'value']
//		B) taking any attribute and writing "input[value='5']"
//		the word value above is actually an attribute and  5 is the value
		driver.findElement(By.cssSelector("input[value='5']")).click();
		
//		CSS Locator C: 
//		C) to find element from multiple attributes:
		driver.findElement(By.cssSelector("input[name='exp'][id=exp-6]")).click();
		
		
		
		
		Thread.sleep(5000);
		
	}
	
//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
