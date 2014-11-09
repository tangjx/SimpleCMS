/*
 * @(#)WxUserListResult.java Aug 15, 2014
 * 
 * Copyright 2014 weipu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.wx.entity;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

/*
 * @Title: WxUserListResult.java
 * @Description: 
 * @author atang atang@1v.cn  
 * @date Aug 15, 2014 12:12:22 PM
 * @version V1.0  
 */
public class WxUserListResult {
	private int total;
	private int count;
	private String next_openid;
	private Data data;
	
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}



	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}



	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}



	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}



	/**
	 * @return the next_openid
	 */
	public String getNext_openid() {
		return next_openid;
	}



	/**
	 * @param next_openid the next_openid to set
	 */
	public void setNext_openid(String next_openid) {
		this.next_openid = next_openid;
	}



	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
	}



	/**
	 * @param data the data to set
	 */
	public void setData(Data data) {
		this.data = data;
	}



	public class Data {
		private List<String> openid;

		/**
		 * @return the openid
		 */
		public List<String> getOpenid() {
			return openid;
		}

		/**
		 * @param openid the openid to set
		 */
		public void setOpenid(List<String> openid) {
			this.openid = openid;
		}
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
