package cn.nowdo.cloud.base.wx.message.entity;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.dom4j.Element;

public class WxResponseNewsMessage extends WxMessage {
	private List<WxMessageImage> imgList;

	public WxResponseNewsMessage() {
	}
	
	public WxResponseNewsMessage(WxMessageHeader header) {
		super(header);
	}

	public WxResponseNewsMessage(WxMessageHeader header, Element root) {
		super(header);
	}

	public List<WxMessageImage> getImgList() {
		return this.imgList;
	}

	public void setImgList(List<WxMessageImage> imgList) {
		this.imgList = imgList;
	}

	public String getMessageXMLString() {
		StringBuilder stringBuilder = new StringBuilder("<xml>");
		stringBuilder.append(getMessageHeader().getMessageHeaderXMLString());
		stringBuilder.append("<ArticleCount>" + this.imgList.size()
				+ "</ArticleCount>");
		stringBuilder.append("<Articles>");
		for (WxMessageImage img : this.imgList) {
			stringBuilder.append("<item>");
			stringBuilder.append("<Title><![CDATA[" + img.getTitle()
					+ "]]></Title>");
			stringBuilder.append("<Description><![CDATA["
					+ img.getDescription() + "]]></Description>");
			stringBuilder.append("<PicUrl><![CDATA[" + img.getPicUrl()
					+ "]]></PicUrl>");
			stringBuilder.append("<Url><![CDATA[" + img.getLinkUrl()
					+ "]]></Url>");
			stringBuilder.append("</item>");
		}
		stringBuilder.append("</Articles>");
		stringBuilder.append("<FuncFlag>1</FuncFlag>");
		stringBuilder.append("</xml>");
		return stringBuilder.toString();
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}