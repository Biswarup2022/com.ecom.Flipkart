package qspiders.com.crm.zoho;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class DesktopApplication
{
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		String app = "calendar";
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		Thread.sleep(2000);
		
		char[]ch = app.toCharArray();
			for(char c:ch)
			{
				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
				r.keyPress(keyCode);
				r.keyRelease(keyCode);
				Thread.sleep(1000);
			}
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
