import com.shephertz.app42.paas.sdk.java.App42API;  
import com.shephertz.app42.paas.sdk.java.App42Response;  
import com.shephertz.app42.paas.sdk.java.App42Exception;  
import com.shephertz.app42.paas.sdk.java.App42BadParameterException;  
import com.shephertz.app42.paas.sdk.java.App42NotFoundException;  
import com.shephertz.app42.paas.sdk.java.achievement.Achievement;  
import com.shephertz.app42.paas.sdk.java.achievement.AchievementService;  
public class achiver {
	String userName = "Nick";  
	String achievementName = "Shephertz Nick";  
	String gameName = "<Enter the Game Name>";  
	String description = "My Game achievement";  
	App42API.initialize("API_KEY","SECRET_KEY");  
	AchievementService achievementService = App42API.buildAchievementService();   
	Achievement achievement =  achievementService.earnAchievement(userName, achievementName,gameName, description);   
	System.out.println("userName is :" + achievement.getUserName());  
	System.out.println("gameName is :" + achievement.getGameName());  
	System.out.println("achievedOn is :" + achievement.getAchievedOn());  
}
