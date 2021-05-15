
package Utilities;

import java.io.File; 
import java.util.Date;

import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.utils.FileUtil;

import Test.BaseTest;

public class TakeScreenshot extends BaseTest {

	public String takesnapshot (String methodName) { 
		String filename =  getScreenShotName (methodName); 
		String directory =  "./Screenshots/";
		new File(directory).mkdirs();
		String path = directory + filename; try
		{ 
			TakesScreenshot screenshot  =((TakesScreenshot)driver); 
			File SrcFile =screenshot.getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(SrcFile, new File(path)); 
			FileHandler.copy(SrcFile, new File(path));
		} catch (Exception e) {

		}
		return path;
	}

	public static String getScreenShotName(String methodName) { Date d = new
			Date(); String filename = methodName + "_" + d.toString().replace(":",
					"_").replace(" ", "_")+".png"; return filename;

	}
}