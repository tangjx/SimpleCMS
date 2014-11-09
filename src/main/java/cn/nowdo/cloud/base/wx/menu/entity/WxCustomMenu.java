
package cn.nowdo.cloud.base.wx.menu.entity;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;


import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class WxCustomMenu {

    @Expose
    private List<Button> button = new ArrayList<Button>();

    public List<Button> getButton() {
        return button;
    }

    public void setButton(List<Button> button) {
        this.button = button;
    }

}
