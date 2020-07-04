package cn.edu.jxust.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.io.Serializable;

/**
 * (TDataout)实体类
 *
 * @author makejava
 * @since 2020-06-28 15:58:21
 */

public class TDataout implements Serializable {
    private static final long serialVersionUID = 286399199237227736L;
    
    private String id;
    
    private Integer userName;
    
    private String fxId;
    
    private String depId;
    
    private String duty;
    
    private Date signInTime;
    
    private String signInPlace;
    
    private String context;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public String getFxId() {
        return fxId;
    }

    public void setFxId(String fxId) {
        this.fxId = fxId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public Date getSignInTime() {
        return signInTime;
    }

    public void setSignInTime(Date signInTime) {
        this.signInTime = signInTime;
    }

    public String getSignInPlace() {
        return signInPlace;
    }

    public void setSignInPlace(String signInPlace) {
        this.signInPlace = signInPlace;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

}