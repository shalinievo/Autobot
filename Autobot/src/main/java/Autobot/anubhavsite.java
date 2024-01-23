package Autobot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class anubhavsite {
	public static ArrayList<String> readfileallurl;
	public static ArrayList<String> readfilealldata2;
	public static ArrayList<String> readfilealldata1;
	public static ArrayList<String> readfilealldata;
	public static String allText ="";
	public static String currentDirectory=System.getProperty("user.dir");
	static void Site() throws IOException
	  {
		
			WebDriver driver = Browserfactory.getBrowserInstance(currentDirectory ,"chrome");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			try {
				for (int i = 0; i <= 6; i++) {
					//ArrayList<String> readfileallurl = readfile.readsiteurl();
			        //ThreadLocalRandom randurl = ThreadLocalRandom.current();
                  
			        //int randindex = randurl.nextInt(0, readfileallurl.size()-1);
				    driver.get("https://www.anubhavtrainings.com/anubhav-training-forums/anubhav-forum/is-abap-mandatory-to-pursue-sap-hana");
				   // System.out.println(readfileallurl.get(randindex));
				    driver.manage().window().maximize();
				    Thread.sleep(1000);

			        // This  will scroll down the page by  1000 pixel vertical		
			        js.executeScript("window.scrollBy(0,1000)");
			        Thread.sleep(1000);
				    
				}
				driver.quit();
				
			  } catch(Exception e) {
				  System.out.println("site23");
			  }
			  
			
	  }

}
