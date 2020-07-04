package cn.edu.jxust.entity;

import java.io.Serializable;

/**
 * (TRole)实体类
 *
 * @author makejava
 * @since 2020-06-28 15:58:02
 */
public class TRole implements Serializable {
    private static final long serialVersionUID = -67036955209724645L;
    
    private String roleId;
    
    private Integer roleName;
    
    private String roleDes;
    
    private Boolean roleStatus;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Integer getRoleName() {
        return roleName;
    }

    public void setRoleName(Integer roleName) {
        this.roleName = roleName;
    }

    public String getRoleDes() {
        return roleDes;
    }

    public void setRoleDes(String roleDes) {
        this.roleDes = roleDes;
    }

    public Boolean getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Boolean roleStatus) {
        this.roleStatus = roleStatus;
    }

}