import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.json.JSONObject; 
import java.util.Scanner;
import com.shephertz.app42.paas.sdk.java.App42API;  
import com.shephertz.app42.paas.sdk.java.App42Response;  
import com.shephertz.app42.paas.sdk.java.App42Exception;  
import com.shephertz.app42.paas.sdk.java.App42BadParameterException;  
import com.shephertz.app42.paas.sdk.java.App42NotFoundException;  
import com.shephertz.app42.paas.sdk.java.storage.OrderByType;  
import com.shephertz.app42.paas.sdk.java.storage.Query;  
import com.shephertz.app42.paas.sdk.java.storage.QueryBuilder;  
import com.shephertz.app42.paas.sdk.java.storage.Storage;  
import com.shephertz.app42.paas.sdk.java.storage.StorageService;  
import com.shephertz.app42.paas.sdk.java.storage.QueryBuilder.Operator;  
import com.shephertz.app42.paas.sdk.java.user.User;
import com.shephertz.app42.paas.sdk.java.user.UserService;
public class Nosqlstorage {
	public static void Authenticate(String un,String pass)
	{
		String userName = un;  
		String pwd = pass;     
	//	App42API.initialize("API_KEY","SECRET_KEY");  
		UserService userService = App42API.buildUserService();   
		User user = userService.authenticate(userName, pwd);   
		System.out.println("userName is " + user.getUserName());    
		System.out.println("sessionId is " + user.getSessionId()); 
	}
	
	public static void addjsondocument(String Databasename, String Collection_name,String json_str)
	{

             String dbName =Databasename ;
             String collectionName =Collection_name;   
             String json =json_str;  
           //  App42API.initialize("API_KEY","SECRET_KEY")	;  
             StorageService storageService = App42API.buildStorageService();   
             Storage storage = storageService.insertJSONDocument(dbName,collectionName,json);    
             System.out.println("dbName is " + storage.getDbName());  
             System.out.println("collection Name is " + storage.getCollectionName());  
             ArrayList<Storage.JSONDocument> jsonDocList = storage.getJsonDocList();            
             for(int i=0;i<jsonDocList.size();i++)  
             		{  
            	 		System.out.println("objectId is " + jsonDocList.get(i).getDocId());    
            	 		System.out.println("CreatedAt is " + jsonDocList.get(i).getCreatedAt());    
            	 		System.out.println("UpdatedAtis " + jsonDocList.get(i).getUpdatedAt());    
            	 		System.out.println("Jsondoc is " + jsonDocList.get(i).getJsonDoc());    
             		}    
	}
	
	public static void main(String[] args)throws IOException 
	{
   InputStreamReader i=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(i);	
			//Scanner sc=new Scanner(System.in);
   
			App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
			System.out.println("enter the username and password");
   String un=br.readLine();
			//String un=sc.next();
			System.out.println("enter your password");
			//String pass=sc.next();
   String pass=br.readLine();
			Authenticate(un,pass);
			System.out.println("enter your db name");
			//String databasename=sc.next();
   String databasename=br.readLine();
			System.out.println("enter the collection name");
		//	String collection_name=sc.next();
   String collection_name=br.readLine();
			System.out.println("enter the json string in the format of {\"name\":\"value\",\"name2\":\"value2\"} ");
   String json_str=br.readLine();
	//		String json_str=sc.next();
			addjsondocument(databasename,collection_name,json_str);
   
}
}

