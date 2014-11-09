package cn.nowdo.cloud.base.wx.menu;

import cn.nowdo.cloud.base.wx.auth.entity.WxAuthAccessToken;
import cn.nowdo.cloud.base.wx.entity.WxResult;
import cn.nowdo.cloud.base.wx.menu.entity.WxCustomMenu;
import cn.nowdo.cloud.base.wx.utils.WxURIFactory;
import cn.nowdo.cloud.utils.HttpUtils;

public class WxMenuCreator {

	public static boolean createMenu(WxAuthAccessToken wxAuthAccessToken, WxCustomMenu wxCustomMenu){
		
		WxResult wxResult = HttpUtils.getGenericObjWithHttpPost(
				WxURIFactory.getWxCreateCustomMenuURI(wxAuthAccessToken.getAccess_token()), WxResult.class, wxCustomMenu);
		
		return wxResult.getErrcode() == 0 ? true : false;
	}
	
}
