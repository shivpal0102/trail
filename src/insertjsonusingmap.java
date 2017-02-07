import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

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

public class insertjsonusingmap {
      public static void insert_value()
      {
    	  String dbName = "shivdb";  
    	  String collectionName ="shivcol";   
    	  HashMap< String, String > map = new HashMap< String, String >();  
    	  map.put("name", "Shiv");
    	  map.put("age", "22");
    	  map.put("abc","efg");
    	  App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d"); 
    	  StorageService storageService = App42API.buildStorageService();   
    	  Storage storage = storageService.insertJsonDocUsingMap(dbName,collectionName,map);    
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
    	  String jsonResponse = storage.toString();        
      }
      public static void main(String[] args) {
		insert_value();
	}
}
