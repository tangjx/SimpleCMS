
package cn.nowdo.cloud.base.wx.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;

public class WxResult {

    @Expose
    private Integer errcode;
    @Expose
    private String errmsg;

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
