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

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.json.*;
public class insertjson {
	public static void insertasobj(String dbn,String cn,String un,String pass) throws JSONException {
		App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");

         	Nosqlstorage.Authenticate(un,pass);
	JSONObject json = new JSONObject();  
	json.put("name","Nick");  
	json.put("age","30");  
	StorageService storageService = App42API.buildStorageService();   
	Storage storage = storageService.insertJSONDocument(dbn,cn,json);    
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
	public static void main(String[] args) throws IOException, JSONException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the database name coll name username pass respectively");
		String dbn=br.readLine();
		String cn=br.readLine();
		String un=br.readLine();
		String pas=br.readLine();
		insertasobj(dbn,cn,un,pas);
	}
}
