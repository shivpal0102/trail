import java.util.Scanner;

import com.shephertz.app42.paas.sdk.java.App42API;  
import com.shephertz.app42.paas.sdk.java.App42Response;  
import com.shephertz.app42.paas.sdk.java.App42Exception;  
import com.shephertz.app42.paas.sdk.java.App42BadParameterException;  
import com.shephertz.app42.paas.sdk.java.App42NotFoundException;  
import com.shephertz.app42.paas.sdk.java.timer.Timer;  
import com.shephertz.app42.paas.sdk.java.timer.TimerService;  
public class timerservice {
		public static void timer(String name)
		{ 
			String timerName = "name";  
			long timeInSeconds= 120;  
			  App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
 
			TimerService timerService =  App42API.buildTimerService();   
			Timer timer = timerService.createOrUpdateTimer(timerName, timeInSeconds);  
			System.out.println("Timer Name is: "+timer.getName());  
			System.out.println("Time is: "+timer.getTimeInSeconds());  
		}
		public static void main(String args[])
		{   Scanner sc =new Scanner(System.in);
	         String timer_name=sc.next();
			timer(timer_name);
		}

}
