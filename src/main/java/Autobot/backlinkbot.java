package Autobot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class backlinkbot {
	public static ArrayList<String> readfileallurl;
	public static ArrayList<String> readfilealldata2;
	public static ArrayList<String> readfilealldata1;
	public static ArrayList<String> readfilealldata;
	public static String allText ="";
	public static String currentDirectory=System.getProperty("user.dir");
	
	static void BacklinkWin1(String browserName) throws IOException
	  {

		WebDriver driver = Browserfactory.getBrowserInstance(currentDirectory ,browserName);
		try {
			  readfilealldata = readfile.getAllSites();
			  allText = "";
				for (String linebyline : readfilealldata) {
					allText = allText + linebyline + "\r\n";
				}
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(0, readfilealldata.size()-1);
		      System.out.println(readfilealldata.size());
		      driver.get("https://megritools.com/backlink-generator");
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elt31);
		      elt31.click();
			  } catch(Exception e) {
				  System.out.println("site1");
			  }
			try {
				  String myText = allText;
				  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
				  ((JavascriptExecutor) driver).executeScript("window.open('http://pingfarm.com/')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[1]);
			      WebElement ele21, ele31;
			      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele21);
			      ele21.click();
			      ele21.sendKeys( myText);
			      ele31= driver.findElement(By.xpath("//input[@type='submit']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele31);
			      ele31.click();
			  } catch(Exception e) {
				  System.out.println("site2");
			  }
			try {
				((JavascriptExecutor) driver).executeScript("window.open('http://www.indexkings.com/')");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Set<String> parent=driver.getWindowHandles();
				Object[] child=parent.toArray();
				driver.switchTo().window((String) child[2]);
				WebElement ele21, ele31;
				ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele21);
				ele21.click();
				ele21.sendKeys(allText);
				ele31= driver.findElement(By.xpath("//input[@value='RAPID INDEX!']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    ele31);
				ele31.click();

			  } catch(Exception e) {
				  System.out.println("site3");
			  }
			  try {
				ArrayList<String> readfilealldata = readfile.getAllSites();
				ThreadLocalRandom random = ThreadLocalRandom.current();
				int rand = random.nextInt(0, readfilealldata.size()-1);
				((JavascriptExecutor) driver).executeScript("window.open('https://www.pingmylinks.com/addurl/')");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				Set<String> parent=driver.getWindowHandles();
				Object[] child=parent.toArray();
				driver.switchTo().window((String) child[3]);
				WebElement elet1, elt31;
				elet1= driver.findElement(By.xpath("//input[@name='furl']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
				elet1.click();
				elet1.sendKeys(readfilealldata.get(rand));
				elt31= driver.findElement(By.xpath("//input[@onclick='fAjaxReg();this.blur();']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
				elt31.click();
			  } catch(Exception e) {
				  System.out.println("site4");
			  }
			
			  try {
				String myText = allText;
				myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
				((JavascriptExecutor) driver).executeScript("window.open('http://www.indexkings.com/')");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				Set<String> parent=driver.getWindowHandles();
				Object[] child=parent.toArray();
				driver.switchTo().window((String) child[4]);
				WebElement ele21, ele31;
				ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele21);
				ele21.click();
				ele21.sendKeys( myText);
				ele31= driver.findElement(By.xpath("//input[@value='RAPID INDEX!']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele31);
				ele31.click();
				     
			  } catch(Exception e) {
				  System.out.println("site5");
			  }
			
			try {
				  ArrayList<String> readfilealldata = readfile.getAllSites();
			      ThreadLocalRandom random = ThreadLocalRandom.current();
			      int rand = random.nextInt(0, readfilealldata.size()-1);	
				  ((JavascriptExecutor) driver).executeScript("window.open('https://megritools.com/backlink-generator')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[5]);
			      WebElement ele21, ele31;
			      ele21= driver.findElement(By.xpath("//input[@id='myurl']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele21);
			      ele21.click();
			      ele21.sendKeys(readfilealldata.get(rand));
			      ele31= driver.findElement(By.xpath("//a[@id='checkButton']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele31);
			      ele31.click();
				     
			  } catch(Exception e) {
				  System.out.println("site6");
			  }
			
			try {
				  ArrayList<String> readfilealldata = readfile.getAllSites();
			      ThreadLocalRandom random = ThreadLocalRandom.current();

			      int rand = random.nextInt(0, readfilealldata.size()-1);
				  ((JavascriptExecutor) driver).executeScript("window.open('http://cleverstat.com/backlink-maker')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[6]);
			      WebElement elet1, elt32;
			      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elet1);
			      elet1.click();
			      elet1.sendKeys(readfilealldata.get(rand));
			      elt32= driver.findElement(By.xpath("//a[@id='checkButton']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elt32);
			      elt32.click();
			  } catch(Exception e) {
				  System.out.println("site7");
			  } 
			  try {
				  String myText = allText;
				  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
				  ((JavascriptExecutor) driver).executeScript("window.open('http://pingfarm.com/')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[7]);
			      WebElement ele21, ele31;
			      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele21);
			      ele21.click();
			      ele21.sendKeys( myText);
			      ele31= driver.findElement(By.xpath("//input[@type='submit']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele31);
			      ele31.click();
			  } catch(Exception e) {
				  System.out.println("site8");
			  }
			try {
				  String myText = allText;
				  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
				  ((JavascriptExecutor) driver).executeScript("window.open('http://pingfarm.com/')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[8]);
			      WebElement ele21, ele31;
			      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele21);
			      ele21.click();
			      ele21.sendKeys( myText);
			      ele31= driver.findElement(By.xpath("//input[@type='submit']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele31);
			      ele31.click();
			  } catch(Exception e) {
				  System.out.println("site9");
			  }
			  try {
				  ArrayList<String> readfilealldata = readfile.getAllSites();
			      ThreadLocalRandom random = ThreadLocalRandom.current();
			      int rand = random.nextInt(0, readfilealldata.size()-1);
				  ((JavascriptExecutor) driver).executeScript("window.open('https://megritools.com/backlink-generator')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[9]);
			      WebElement elet1, elt31;
			      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elet1);
			      elet1.click();
			      elet1.sendKeys(readfilealldata.get(rand));
			      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     elt31);
			      elt31.click();
				     
			  } catch(Exception e) {
				  System.out.println("site10");
			  }
			  }

	static void BacklinkWin2(String browserName) throws IOException
	{	
		WebDriver driver = Browserfactory.getBrowserInstance(currentDirectory ,browserName);
		try {
			  readfilealldata = readfile.getAllSites();
			  allText = "";
				for (String linebyline : readfilealldata) {
					allText = allText + linebyline + "\r\n";
				}
		      ThreadLocalRandom random = ThreadLocalRandom.current();

		      int rand = random.nextInt(0, readfilealldata.size()-1);
		      System.out.println(readfilealldata.size());
		      driver.get("https://megritools.com/backlink-generator");
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elt31);
		      elt31.click();
			  } catch(Exception e) {
				  System.out.println("site11");
			  }
			  try {
				ArrayList<String> readfilealldata = readfile.getAllSites();
				ThreadLocalRandom random = ThreadLocalRandom.current();
				int rand = random.nextInt(0, readfilealldata.size()-1);
				((JavascriptExecutor) driver).executeScript("window.open('https://www.pingmylinks.com/addurl/')");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				Set<String> parent=driver.getWindowHandles();
				Object[] child=parent.toArray();
				driver.switchTo().window((String) child[1]);
				WebElement elet1, elt31;
				elet1= driver.findElement(By.xpath("//input[@name='furl']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
				elet1.click();
				elet1.sendKeys(readfilealldata.get(rand));
				elt31= driver.findElement(By.xpath("//input[@onclick='fAjaxReg();this.blur();']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
				elt31.click();
			  } catch(Exception e) {
				  System.out.println("site12");
			  }
			  try {
				  String myText = allText;
				  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
				  ((JavascriptExecutor) driver).executeScript("window.open('http://pingfarm.com/')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[2]);
			      WebElement ele21, ele31;
			      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele21);
			      ele21.click();
			      ele21.sendKeys( myText);
			      ele31= driver.findElement(By.xpath("//input[@type='submit']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",     ele31);
			      ele31.click();
			  } catch(Exception e) {
				  System.out.println("site13");
			  } 
			  try {
				  String myText = allText;
				  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
				  ((JavascriptExecutor) driver).executeScript("window.open('http://www.indexkings.com/')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[3]);
			      WebElement ele21, ele31;
			      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele21);
			      ele21.click();
			      ele21.sendKeys( myText);
			      ele31= driver.findElement(By.xpath("//input[@value='RAPID INDEX!']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele31);
			      ele31.click();
		  } catch(Exception e) {
			  System.out.println("site14");
		  }
		  try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();
		      int rand = random.nextInt(0, readfilealldata.size()-1);
			  ((JavascriptExecutor) driver).executeScript("window.open('http://seowagon.com/backlink-maker')");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[4]);
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
		      elt31.click();
			     
		  } catch(Exception e) {
			  System.out.println("site15");
		  }
		  try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();
		      int rand = random.nextInt(0, readfilealldata.size()-1);
			  ((JavascriptExecutor) driver).executeScript("window.open('https://megritools.com/backlink-generator')");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[5]);
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
		      elt31.click();
			     
		  } catch(Exception e) {
			  System.out.println("site16");
		  }
		  try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();
		      int rand = random.nextInt(0, readfilealldata.size()-1);
			  ((JavascriptExecutor) driver).executeScript("window.open('https://tools.pingdom.com/#5b6be158c0800000')");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[6]);
		      WebElement elt32, ele21;
		      ele21= driver.findElement(By.xpath("//input[@class='test-url-input ng-pristine ng-valid ng-touched']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele21);
		      ele21.click();
		      ele21.sendKeys(readfilealldata.get(rand));
		      elt32= driver.findElement(By.xpath("//input[@class='button cta-button test-button']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  elt32);
		      elt32.click();
			     
		  } catch(Exception e) {
			  System.out.println("site17");
		  }
		  try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();
		      int rand = random.nextInt(0, readfilealldata.size()-1);
			  ((JavascriptExecutor) driver).executeScript("window.open('https://www.pingmylinks.com/addurl/')");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[7]);
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@name='furl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//input[@onclick='fAjaxReg();this.blur();']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
		      elt31.click();
		  } catch(Exception e) {
			  System.out.println("site18");
		  }
		  try {
			ArrayList<String> readfilealldata = readfile.getAllSites();
			ThreadLocalRandom random = ThreadLocalRandom.current();
			int rand = random.nextInt(0, readfilealldata.size()-1);
			((JavascriptExecutor) driver).executeScript("window.open('http://seowagon.com/backlink-maker')");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Set<String> parent=driver.getWindowHandles();
			Object[] child=parent.toArray();
			driver.switchTo().window((String) child[8]);
			WebElement elet1, elt31;
			elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
			elet1.click();
			elet1.sendKeys(readfilealldata.get(rand));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
			elt31.click();
			elet1.sendKeys(readfilealldata.get(rand));
			elt31= driver.findElement(By.xpath("//input[@type='submit']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  elt31);
			elt31.click();
		  } catch(Exception e) {
			  System.out.println("site19");
		  }
		  
		  try {
			  ArrayList<String> readfilealldata = readfile.getAllSites();
		      ThreadLocalRandom random = ThreadLocalRandom.current();
		      int rand = random.nextInt(0, readfilealldata.size()-1);
			  ((JavascriptExecutor) driver).executeScript("window.open('https://excitesubmit.com/')");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  Set<String> parent=driver.getWindowHandles();
			  Object[] child=parent.toArray();
			  driver.switchTo().window((String) child[9]);
		      WebElement elet1, elt31;
		      elet1= driver.findElement(By.xpath("//input[@id='furl']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
		      elet1.click();
		      elet1.sendKeys(readfilealldata.get(rand));
		      elt31= driver.findElement(By.xpath("//input[@name='button']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
		      elt31.click();	     
		  } catch(Exception e) {
			  System.out.println("site20");
		  }
		  
	  }
	  
	static void BacklinkWin3(String browserName) throws IOException
	  {
		WebDriver driver = Browserfactory.getBrowserInstance(currentDirectory ,browserName);
			try {
				  String myText = allText;
				  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));
				  driver.get("http://www.indexkings.com/");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			      WebElement ele21, ele31;
			      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele21);
			      ele21.click();
			      ele21.sendKeys( myText);
			      ele31= driver.findElement(By.xpath("//input[@value='RAPID INDEX!']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele31);
			      ele31.click();
			  } catch(Exception e) {
				  System.out.println("site21");
			  }
			try {
				  ArrayList<String> readfilealldata = readfile.getAllSites();
			      ThreadLocalRandom random = ThreadLocalRandom.current();
			      int rand = random.nextInt(0, readfilealldata.size()-1);
				  ((JavascriptExecutor) driver).executeScript("window.open('http://seowagon.com/backlink-maker')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[1]);
			      WebElement elet1, elt31;
			      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
			      elet1.click();
			      elet1.sendKeys(readfilealldata.get(rand));
			      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
			      elt31.click();
			  } catch(Exception e) {
				  System.out.println("site22");
			  }
			try {
				  ArrayList<String> readfilealldata = readfile.getAllSites();
			      ThreadLocalRandom random = ThreadLocalRandom.current();
			      int rand = random.nextInt(0, readfilealldata.size()-1);
				  ((JavascriptExecutor) driver).executeScript("window.open('http://seowagon.com/backlink-maker')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[2]);
			      WebElement elet1, elt31;
			      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
			      elet1.click();
			      elet1.sendKeys(readfilealldata.get(rand));
			      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
			      elt31.click(); 
				     
			  } catch(Exception e) {
				  System.out.println("site23");
			  }
			
			try {
				  ArrayList<String> readfilealldata = readfile.getAllSites();
			      ThreadLocalRandom random = ThreadLocalRandom.current();
			      int rand = random.nextInt(0, readfilealldata.size()-1);
				  ((JavascriptExecutor) driver).executeScript("window.open('https://www.pingmylinks.com/addurl/')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[3]);
			      WebElement elet1, elt31;
			      elet1= driver.findElement(By.xpath("//input[@name='furl']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
			      elet1.click();
			      elet1.sendKeys(readfilealldata.get(rand));
			      elt31= driver.findElement(By.xpath("//input[@onclick='fAjaxReg();this.blur();']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
			      elt31.click();
			  } catch(Exception e) {
				  System.out.println("site24");
			  }

			  try {
				ArrayList<String> readfilealldata = readfile.getAllSites();
				ThreadLocalRandom random = ThreadLocalRandom.current();
				int rand = random.nextInt(0, readfilealldata.size()-1);
				((JavascriptExecutor) driver).executeScript("window.open('https://www.pingmylinks.com/addurl/')");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				Set<String> parent=driver.getWindowHandles();
				Object[] child=parent.toArray();
				driver.switchTo().window((String) child[4]);
				WebElement elet1, elt31;
				elet1= driver.findElement(By.xpath("//input[@name='furl']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
				elet1.click();
				elet1.sendKeys(readfilealldata.get(rand));
				elt31= driver.findElement(By.xpath("//input[@onclick='fAjaxReg();this.blur();']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
				elt31.click();
			  } catch(Exception e) {
				  System.out.println("site25");
			  }
			try {
				  ArrayList<String> readfilealldata = readfile.getAllSites();
			      ThreadLocalRandom random = ThreadLocalRandom.current();
			      int rand = random.nextInt(0, readfilealldata.size()-1);	
				  ((JavascriptExecutor) driver).executeScript("window.open('https://megritools.com/backlink-generator')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[5]);
			      WebElement ele21, ele31;
			      ele21= driver.findElement(By.xpath("//input[@id='myurl']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele21);
			      ele21.click();
			      ele21.sendKeys(readfilealldata.get(rand));
			      ele31= driver.findElement(By.xpath("//a[@id='checkButton']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele31);
			      ele31.click();
			  } catch(Exception e) {
				  System.out.println("site26");
			  }
			
			try {
				  String myText = allText;
				  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
				  ((JavascriptExecutor) driver).executeScript("window.open('http://pingfarm.com/')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[6]);
			      WebElement ele21, ele31;
			      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele21);
			      ele21.click();
			      ele21.sendKeys( myText);
			      ele31= driver.findElement(By.xpath("//input[@type='submit']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  ele31);
			      ele31.click();
			  } catch(Exception e) {
				  System.out.println("site27");
			  }
			  try {
				  ArrayList<String> readfilealldata = readfile.getAllSites();
			      ThreadLocalRandom random = ThreadLocalRandom.current();
			      int rand = random.nextInt(0, readfilealldata.size()-1);
				  ((JavascriptExecutor) driver).executeScript("window.open('https://megritools.com/backlink-generator')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[7]);
			      WebElement elet1, elt31;
			      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  elet1);
			      elet1.click();
			      elet1.sendKeys(readfilealldata.get(rand));
			      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  elt31);
			      elt31.click();
			  } catch(Exception e) {
				  System.out.println("site28");
			  }
			  try {
				  ArrayList<String> readfilealldata = readfile.getAllSites();
			      ThreadLocalRandom random = ThreadLocalRandom.current();
			      int rand = random.nextInt(0, readfilealldata.size()-1);
				  ((JavascriptExecutor) driver).executeScript("window.open('http://seowagon.com/backlink-maker')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[8]);
			      WebElement elet1, elt31;
			      elet1= driver.findElement(By.xpath("//input[@id='myurl']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elet1);
			      elet1.click();
			      elet1.sendKeys(readfilealldata.get(rand));
			      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			      elt31= driver.findElement(By.xpath("//a[@class='btn btn-info']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   elt31);
			      elt31.click();
			      elet1.sendKeys(readfilealldata.get(rand));
			      elt31= driver.findElement(By.xpath("//input[@type='submit']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",  elt31);
			      elt31.click();
				     
			  } catch(Exception e) {
				  System.out.println("site29");
			  }
			  try {
				  String myText = allText;
				  myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));	
				  ((JavascriptExecutor) driver).executeScript("window.open('http://www.indexkings.com/')");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  Set<String> parent=driver.getWindowHandles();
				  Object[] child=parent.toArray();
				  driver.switchTo().window((String) child[9]);
			      WebElement ele21, ele31;
			      ele21= driver.findElement(By.xpath("//textarea[@name='urls']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele21);
			      ele21.click();
			      ele21.sendKeys( myText);
			      ele31= driver.findElement(By.xpath("//input[@value='RAPID INDEX!']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",   ele31);
			      ele31.click();
				  } catch(Exception e) {
					  System.out.println("site30");
				  }
			  }
	static void youtube(String browserName) throws IOException
	  {
		WebDriver driver = Browserfactory.getBrowserInstance(currentDirectory, browserName);
			try {
				  ArrayList<String> readfilealldata2 = readfile.readplaylist();
			      ThreadLocalRandom random2 = ThreadLocalRandom.current();
			      int rand3 = random2.nextInt(0, readfilealldata2.size()-1);
				  driver.get(readfilealldata2.get(rand3));
				  System.out.println(readfilealldata2.get(rand3));
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			      WebElement ele21, ele31;
			      ele31= driver.findElement(By.xpath("//button[@aria-label='Loop playlist']"));
			      ele31.click();
			      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			      ele21= driver.findElement(By.xpath("//div[@class='ytp-ad-text ytp-ad-skip-button-text']"));
			      ele21.click();
     
			  } catch(Exception e) {
				  System.out.println("error in youtube playlist");
			  }
			
	  }
	static void AnubhavSite(String browserName) throws IOException {
	        // Get the WebDriver instance from BrowserFactory\\
		WebDriver driver = Browserfactory.getBrowserInstance(currentDirectory, browserName);
		//System.out.println(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
	        try {
	            for (int i = 0; i <= 6; i++) {
	    	        ArrayList<String> readfileallurl = readfile.readsiteurl();
	    	        ThreadLocalRandom randurl = ThreadLocalRandom.current();
	    	        Thread.sleep(1000);
	    	        int randindex = randurl.nextInt(0, readfileallurl.size()-1);
	    	        driver.get(readfileallurl.get(randindex));
	                System.out.println(readfileallurl.get(randindex));
	                driver.manage().window().maximize();
	                Thread.sleep(1000);
	                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	                // This will scroll down the page by 1000 pixels vertically
	                js.executeScript("window.scrollBy(0,1000)");
	                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            }
	            driver.quit();
	        } catch(Exception e) {
	            System.out.println("error in AnubhavSite");
	        }
	    }

	  // @SuppressWarnings("deprecation")
	static void vpnrun() throws IOException
	{
		try {
			ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "runvpn.bat");
			File dir = new File(currentDirectory + "\\files");
			pb.directory(dir);
			Process p = pb.start();
			System.out.println(dir);
			System.out.println(p);
			} catch(Exception e) {
				System.out.println("error");
			}
	}

	static void youtubeComment(String browserName) throws IOException
			  {
		WebDriver driver = Browserfactory.getBrowserInstance(currentDirectory ,browserName);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				try {
					
					    driver.get("https://www.youtube.com/watch?v=PX5EmTPExLM&list=PLcxqFaocb9WLtnq-rpXbRy5hnKECxr95G");
					    
					    driver.manage().window().maximize();
					    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				        // This  will scroll down the page by  1000 pixel vertical		
				        js.executeScript("window.scrollBy(0,500)");
				        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				        WebElement ele31, ele, elem;
				        ele31= driver.findElement(By.xpath("//yt-formatted-string[@id='simplebox-placeholder']"));
				        ele31.click();
				        ele= driver.findElement(By.xpath("//input[@type='email']"));
				        ele.click();
				        ele.clear();
				        //Eel = driver.findElement(By.id("//input[@type='email']"));
				        ele.sendKeys("sonia.bajaj22f@gmail.com");
				        elem = driver.findElement(By.id("//span[@class='RveJvd snByac']"));
				        elem.click();
				  } catch(Exception e) {
					  System.out.println("site23");
				  }
				 
			  }
	static void Closevpn() throws IOException
	{
		try {
			ProcessBuilder pb1 = new ProcessBuilder("cmd", "/c", "closevpn.bat");
			File dir1 = new File(currentDirectory + "\\files");
			pb1.directory(dir1);
			Process p1 = pb1.start();
			System.out.println(p1);
		} catch(Exception e) 
		{
			System.out.println("Not close properly");
		}
	}

}
