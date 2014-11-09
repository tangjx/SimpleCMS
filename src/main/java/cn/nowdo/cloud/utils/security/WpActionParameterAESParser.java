package cn.nowdo.cloud.utils.security;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class WpActionParameterAESParser {
	
	private static final String AES_KEY = "1q2w3e4r";

	public static Map<String, String> parse(List<String> argsList, String aesMessage){
		Map<String, String> paramMap = new TreeMap<String, String>();
		
		try {
			String[] params = WpAESUtils.decrypt(AES_KEY, aesMessage).split(",");
			
			for(int i = 0; i < params.length && i < argsList.size(); i ++){
				paramMap.put(argsList.get(i), params[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return paramMap;
	}
	
}
