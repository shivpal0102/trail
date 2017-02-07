import java.util.ArrayList;

import com.shephertz.app42.paas.sdk.java.App42API;
import com.shephertz.app42.paas.sdk.java.ServiceAPI;  
import com.shephertz.app42.paas.sdk.java.App42Response;  
import com.shephertz.app42.paas.sdk.java.App42Exception;  
import com.shephertz.app42.paas.sdk.java.App42BadParameterException;  
import com.shephertz.app42.paas.sdk.java.App42NotFoundException;  
import com.shephertz.app42.paas.sdk.java.upload.Upload;  
import com.shephertz.app42.paas.sdk.java.upload.UploadFileType;  
import com.shephertz.app42.paas.sdk.java.upload.UploadService;  
public class uploadfile {
	public static void upload()
	{
	String fileName = "andi";  
	String description = "image of andy";      
	String filePath = "C:\\Users\\Pulvin\\Desktop\\anicon";     
	UploadFileType fileType = UploadFileType.IMAGE;    
     App42API.initialize("24bd78937741b815ab128ed5b0d8179d2d5c7ad30b25787021dabb48329724c6","63d2fd5874facf4957c166b001a9ba29549431f16d3774b20fedca193ee9c20d");
	UploadService uploadService = App42API.buildUploadService();   
	Upload upload = uploadService.uploadFile(fileName, filePath, fileType, description);  
	ArrayList<Upload.File>  fileList = upload.getFileList();  
	for(int i = 0; i < fileList.size();i++ )  
	{    
	    System.out.println("fileName is :" + fileList.get(i).getName());    
	    System.out.println("fileType is :" + fileList.get(i).getType());    
	    System.out.println("fileUrl is :" + fileList.get(i).getUrl());    
	    System.out.println("Tiny Url is :"+fileList.get(i).getTinyUrl());  
	    System.out.println("fileDescription is: " + fileList.get(i).getDescription());    
	} 
	}
	public static void main(String args[])
	{
		 upload();
	}
}
