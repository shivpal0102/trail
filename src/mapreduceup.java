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

public class mapreduceup {
      public static void insert_value(){
    	  String dbName = "shivdb";  
    	  String collectionName = "shivcol";   
    	  String mapFunction = "function map(){ emit(this.user,1);}";  
    	  String reduceFunction = "function reduce(key, val){var sum = 0; for(var n=0;n< val.length;n++){ sum = sum + val[n]; } return sum;}";        
    	  App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
    	  StorageService storageService = App42API.buildStorageService();   
    	  String storage = storageService.mapReduce(dbName, collectionName, mapFunction, reduceFunction);    
    	  System.out.println(storage);  
      }

      public static void main(String[] args) {
		insert_value();
	}
}