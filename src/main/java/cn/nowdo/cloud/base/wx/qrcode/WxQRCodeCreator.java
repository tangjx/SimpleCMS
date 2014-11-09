package cn.nowdo.cloud.base.wx.qrcode;

import java.net.URISyntaxException;

import cn.nowdo.cloud.base.wx.model.Action_info;
import cn.nowdo.cloud.base.wx.model.Scene;
import cn.nowdo.cloud.base.wx.model.WxAccessToken;
import cn.nowdo.cloud.base.wx.model.WxQRCodeInfo;
import cn.nowdo.cloud.base.wx.model.WxTicket;
import cn.nowdo.cloud.base.wx.utils.WxURIFactory;
import cn.nowdo.cloud.utils.HttpUtils;


public class WxQRCodeCreator {
	
	public static String WX_QRCODE_URL = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=";
	
	public static String createQRCodeInfo(WxAccessToken accessToken, long sceneId, int expireSeconds){
		
		WxQRCodeInfo wxQRCodeInfo = new WxQRCodeInfo();
		wxQRCodeInfo.setExpire_seconds(expireSeconds);
		wxQRCodeInfo.setAction_name("QR_SCENE");
		
		Action_info action_info  = new Action_info();
		Scene scene = new Scene();
		scene.setScene_id(sceneId);
		action_info.setScene(scene);
		
		wxQRCodeInfo.setAction_info(action_info);
		
		try {
			WxTicket wxTicket = HttpUtils.getGenericObjWithHttpPost(
					WxURIFactory.getWxCreateQRCodeURI(accessToken.getAccess_token()), WxTicket.class, wxQRCodeInfo);
			
			System.out.println("---"+wxTicket);

			return WX_QRCODE_URL + wxTicket.getTicket();
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static WxTicket getQRCodeTicket(String accessTokenStr, long sceneId, int expireSeconds){
		
		WxQRCodeInfo wxQRCodeInfo = new WxQRCodeInfo();
		wxQRCodeInfo.setExpire_seconds(expireSeconds);
		wxQRCodeInfo.setAction_name("QR_SCENE");
		
		Action_info action_info  = new Action_info();
		Scene scene = new Scene();
		scene.setScene_id(sceneId);
		action_info.setScene(scene);
		
		wxQRCodeInfo.setAction_info(action_info);
		
		try {
			WxTicket wxTicket = HttpUtils.getGenericObjWithHttpPost(
					WxURIFactory.getWxCreateQRCodeURI(accessTokenStr), WxTicket.class, wxQRCodeInfo);
			
			System.out.println("---"+wxTicket);

			return wxTicket;
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
	}
}
