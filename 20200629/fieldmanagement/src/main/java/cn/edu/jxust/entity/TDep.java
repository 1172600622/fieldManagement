package cn.edu.jxust.entity;

import java.io.Serializable;

/**
 * (TDep)实体类
 *
 * @author makejava
 * @since 2020-06-28 15:58:21
 */
public class TDep implements Serializable {
    private static final long serialVersionUID = -77835053968170356L;
    
    private String depId;
    
    private String name;
    
    private Boolean status;
    
    private String depTel;


    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDepTel() {
        return depTel;
    }

    public void setDepTel(String depTel) {
        this.depTel = depTel;
    }

}