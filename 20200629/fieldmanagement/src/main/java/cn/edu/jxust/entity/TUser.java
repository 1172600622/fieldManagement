package cn.edu.jxust.entity;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2020-06-28 13:05:52
 */
@Component
public class TUser implements Serializable {
    private static final long serialVersionUID = -43491868032669169L;
    
    private String id;
    
    private String name;
    
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd ")
    private Date birthday;
    
    private String depId;
    
    private String depTel;
    
    private String tel;
    
    private String userName;
    
    private String email;
    
    private String password;
    
    private Boolean status;


    public TUser() {
    }

    public TUser(String id, String name, String gender, Date birthday, String depId, String depTel, String tel, String userName, String email, String password, Boolean status) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.depId = depId;
        this.depTel = depTel;
        this.tel = tel;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepTel() {
        return depTel;
    }

    public void setDepTel(String depTel) {
        this.depTel = depTel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", depId='" + depId + '\'' +
                ", depTel='" + depTel + '\'' +
                ", tel='" + tel + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }

}