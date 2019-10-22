
package screenshots;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshots {
	

	    @Test

	    public void testGuru99TakeScreenShot() throws Exception{

			WebDriver driver ;
	    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Copia George\\Downloads\\Automation Resources\\geckodriver.exe");
	    	driver = new FirefoxDriver();

	        //goto url
	    	

	        driver.get("https://copia.co.ke/");

	        //Call take screenshot function

	      CaptureScreenshots.getScreenshotAs(driver, "G:\\test1.png");     

	    }

	    /**

	     * This function will take screenshot

	     * @param webdriver

	     * @param fileWithPath

	     * @throws Exception

	     */

	    public static void getScreenshotAs(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(fileWithPath);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	    }

	}