package testclasses;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;


public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	public String baseUrl= readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		 logger = Logger.getLogger("ebanking");
	        PropertyConfigurator.configure("Log4j.properties");
	        
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
	        driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		}  
		else if(br.equals("edge")) {
		     System.setProperty("webdriver.edge.driver",readconfig.getmsEdgepath());
		     driver = new EdgeDriver();
		 	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		}
	    driver.get(baseUrl);
	}

	@AfterClass
	public void teardown() {
	      driver.quit();
	}
	
	public void captureScreen(WebDriver driver,String tname) throws IOException {
	
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File target = new File(System.getProperty("user.dir")+ "/Screenshots/"+tname+".png");
		
		FileHandler.copy(source, target);
	    System.out.println("Screenshot taken");
		
			
	}
	
	
}
