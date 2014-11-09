package cn.nowdo.cloud.base.constants;

public class WpCodeMsgConstants {
	public final static int CODE_SUCCESS = 0;                     //	请求成功
	public final static int CODE_SYSTEM_BUSY = -1;				 // 系统繁忙
	public final static int CODE_INVALID_PARAM = 10001;		//invalid parameter
	public final static int CODE_INVALID_ACCESS_TOKEN = 30001;	 // 非法的access_token
	public final static int CODE_ERROR_GET_ACCESS_TOKEN = 30002;	 //获取access_token时app_id或者app_secret错误
	public final static int CODE_INVALID_GRANT_TYPE = 30003;		 //不合法的grant_type
	public final static int CODE_INVALID_APP_ID = 30004;		//invalid app_id
	public final static int CODE_UNKNOW_DEVICE_ID = 40011;		 //设备ID不存在
	public final static int CODE_UNKNOW_CAMERA_ID = 40012;		 //摄像头ID不存在
	public final static int CODE_UNKNOW_VIDEO_ID = 40013;		 //摄像头的输出视频ID不存在
	public final static int CODE_SOURCE_EXIST = 40014;			 //指定视频输入入已经添加到系统当中了,无无需再次添加
	public final static int CODE_INVALID_SOURCE_ID = 40021;		 //video_source_id不合法
	public final static int CODE_INVALID_EXPIRES_PARAM = 40022;   //expires_in时间不合法	
	public final static int CODE_INVALID_RESTART_PARAM = 40023;	 //restart参数不合法
	public final static int CODE_SOURCE_OFF_LINE = 40024;         //指定视频源处于离线状态
	
	public final static int CODE_INVALID_SOURCE_ID_LIST = 40025;         //视频源列表不合法
	
	public final static int CODE_APP_NOT_AUTH = 40060;         //应用程序未授权
	
	public final static int CODE_MAC_IS_REGISTERED = 50001;  //MAC 地址已注册
	public final static int CODE_DEVICE_TYPE_ERROR = 50002;  //设备类型错误
	public final static int CODE_PARAMS_ERROR = 50011;      //输入参数错误或者加密密钥错误
	public final static int CODE_SN_MAC_INCONSISTENCY = 50012; //序列号与mac地址不一致 
	public final static int CODE_UNKNOW_DEVICE_SN = 50013;
	public final static int CODE_INVALID_DEVICE_ACCESS_TOKEN = 50014; 
	
	public final static String MSG_SUCCESS = "success";
	public final static String MSG_SYSTEM_BUSY = "system busy";
	public final static String MSG_INVALID_ACCESS_TOKEN = "invalid access token";
	public final static String MSG_ERROR_GET_ACCESS_TOKEN = "error app_id or app_secret in get access_token";
	public final static String MSG_INVALID_GRANT_TYPE = "invalid grant_type";
	public final static String MSG_UNKNOW_DEVICE_ID = "deivce_id not exist";
	public final static String MSG_UNKNOW_CAMERA_ID = "camer_id not exist";
	public final static String MSG_UNKNOW_VIDEO_ID = "video_id not exist";
	public final static String MSG_SOURCE_EXIST = "video source is exist";
	public final static String MSG_INVALID_SOURCE_ID = "invalid source_id";
	public final static String MSG_INVALID_EXPIRES_PARAM_= "invalid expires";
	public final static String MSG_INVALID_RESTART_PARAM = "invalid restart";
	public final static String MSG_SOURCE_OFF_LINE = "video source off line";
	public final static String MSG_INVALID_SOURCE_ID_LIST = "invalid source_id_list";
	
	public final static String MSG_MAC_IS_REGISTERED = "mac is register";
	public final static String MSG_DEVICE_TYPE_ERROR = "device type error";
	public final static String MSG_PARAMS_ERROR = "paramter error";
	public final static String MSG_SN_MAC_INCONSISTENCY = "sn is not consist for mac";
	public final static String MSG_UNKNOW_DEVICE_SN = "unknow device sn";
	public final static String MSG_INVALID_DEVICE_ACCESS_TOKEN = "invalid device access token";
	
	public final static String MSG_APP_NOT_AUTH = "app not auth"; 
	public final static String USER_SESSION = "user_session";
	public final static String USER_PERMISSION = "user_permission";
	
	public final static String STATUS_UNABLE = "0";
	public final static String STATUS_ABLE = "1";
}
