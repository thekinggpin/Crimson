
import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.IOException;
	 
	public class Auto {
	 
		/**
		 * @throws IOException
		 * @throws AWTException
		 * @throws InterruptedException
		 *
		 *
		 */
	 
		public void method1(String username,String password) throws InterruptedException, AWTException
		{
			Runtime r = Runtime.getRuntime();
			Process p;
	
			String serverString = "adepto.gisoncloud.in";
			String s = "cmdkey /delete:\""+serverString;
			try
			{
				//open the putty session with the above given username, password and server
				p = r.exec(s);
				Thread.sleep(1000);
	 
			} catch (Exception e)
			{
				System.out.println(e);
				e.printStackTrace();
	 
			}
			s = "cmdkey /generic:\""+serverString+"\" /user:\""+username+"\" /pass:\""+password+"\"";
			try
			{
				p = r.exec(s);
				Thread.sleep(2000);
	 
			} catch (Exception e)
			{
				System.out.println(e);
				e.printStackTrace();
	 
			}
			s = "mstsc /v:"+serverString;
			try
			{
				//open the putty session with the above given username, password and server
				p = r.exec(s);
							
				Thread.sleep(2000);
	 
			} catch (Exception e)
			{
				System.out.println(e);
				e.printStackTrace();
	 
			}
			
			
			Thread.sleep(10000); //Thread sleep time for credential total 8 seconds
			
			s = "cmdkey /delete:\""+serverString;
			try
			{
				//open the putty session with the above given username, password and server
				p = r.exec(s);
				Thread.sleep(3000);
	 
			} catch (Exception e)
			{
				System.out.println(e);
				e.printStackTrace();
	 
			}
	 
		/*	Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_S);
			Thread.sleep(150);
			robot.keyPress(KeyEvent.VK_U);
			Thread.sleep(150);
			robot.keyPress(KeyEvent.VK_D);
			Thread.sleep(150);
			robot.keyPress(KeyEvent.VK_O);
			Thread.sleep(150);
			robot.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(150);
			robot.keyPress(KeyEvent.VK_S);
			Thread.sleep(150);
			robot.keyPress(KeyEvent.VK_U);
			Thread.sleep(150);
			robot.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(150);
			robot.keyPress(109);
			Thread.sleep(150);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(150);
	 */
		}
		
	}
