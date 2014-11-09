package cn.nowdo.cloud.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.security.MessageDigest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WpBaseUtils {
	
	private static final Gson gson = new GsonBuilder()
		.disableHtmlEscaping()
		.create();
	
	public static final String md5Encode(String s) {  
        char hexDigits[] = { '0', '1', '2', '3', '4',  
                             '5', '6', '7', '8', '9',  
                             'a', 'b', 'c', 'd', 'e', 'f' };  
        try {  
            byte[] btInput = s.getBytes();  
            MessageDigest mdInst = MessageDigest.getInstance("MD5");  
            mdInst.update(btInput);  
            byte[] md = mdInst.digest();  
            int j = md.length;  
            char str[] = new char[j * 2];  
            int k = 0;  
            for (int i = 0; i < j; i++) {  
                byte byte0 = md[i];  
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];  
                str[k++] = hexDigits[byte0 & 0xf];  
            }
            return new String(str);  
        }  
        catch (Exception e) {  
            e.printStackTrace();  
            return null;  
        }  
    }
	
	public static final <T> T readJsonFromFile(File file, Class<T> tClass){
		String fileString = readStringFromFile(file);
		
		T result = gson.fromJson(fileString, tClass);
		return result;
	}
	
	public static final <T> T readJsonFromFile(File file, Type type){
		String fileString = readStringFromFile(file);
		
		T result = gson.fromJson(fileString, type);
		return result;
	}
	
	private static String readStringFromFile(File file){
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			return null;
		}

		String content = "";
		StringBuilder sb = new StringBuilder();

		while (content != null) {
			try {
				content = bf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (content == null) {
				break;
			}

			sb.append(content.trim());
		}
		
		try {
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("readJsonFromFile:"+sb.toString());
		return sb.toString();
	}
	
	public static final <T> T readJsonFromString(String json, Type type) {
		return readJsonFromStr(json, type);
	}
	
	private static final <T> T readJsonFromStr(String json, Type type) {
		T result = gson.fromJson(json, type);
		return result;
	}
}