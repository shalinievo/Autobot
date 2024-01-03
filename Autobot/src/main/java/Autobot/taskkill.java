package Autobot;

import java.io.IOException;

public class taskkill {
	@SuppressWarnings("deprecation")
	static void closeall() throws IOException
	  {
		
		
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
			  } catch(Exception e) {
				  System.out.println("error");
			  }
			  
			
	  }

}
