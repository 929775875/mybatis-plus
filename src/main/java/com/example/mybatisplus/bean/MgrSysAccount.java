package com.example.mybatisplus.bean;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author cheng123
 * @since 2018-07-30
 */
@TableName("mgrsysaccount")
public class Mgrsysaccount implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名称
     */
    private String sysloginname;
    /**
     * 用户年龄
     */
    private String sysloginpass;
    private Date Lastlogintime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSysloginname() {
        return sysloginname;
    }

    public void setSysloginname(String sysloginname) {
        this.sysloginname = sysloginname;
    }

    public String getSysloginpass() {
        return sysloginpass;
    }

    public void setSysloginpass(String sysloginpass) {
        this.sysloginpass = sysloginpass;
    }

    public Date getLastlogintime() {
        return Lastlogintime;
    }

    public void setLastlogintime(Date Lastlogintime) {
        this.Lastlogintime = Lastlogintime;
    }

    @Override
    public String toString() {
        return "Mgrsysaccount{" +
        ", id=" + id +
        ", sysloginname=" + sysloginname +
        ", sysloginpass=" + sysloginpass +
        ", Lastlogintime=" + Lastlogintime +
        "}";
    }
}
