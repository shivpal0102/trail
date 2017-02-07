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
import org.json.*;
public class insertjson {
	public static void insertasobj(String un,String pass) {
		   
         	Nosqlstorage.Authenticate(un,pass);
	JSONObject json = new JSONObject();  
	json.put("name","Nick");  
	json.put("age",30);  
	App42API.initialize("API_KEY","SECRET_KEY");  
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
	public static void main(String[] args) {
		
		insertasobj(,);
	}
}
