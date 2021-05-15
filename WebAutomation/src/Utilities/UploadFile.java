package Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFile {

	
	public void UploadFile(String path) throws AWTException{
		// Upload file using Robot
		Robot robot = new Robot();	
		   // Copy file path to clipboard
		StringSelection stringSelection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		   // Press Ctrl+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);

	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
