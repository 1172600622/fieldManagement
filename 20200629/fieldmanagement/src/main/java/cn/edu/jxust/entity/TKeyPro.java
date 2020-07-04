package cn.edu.jxust.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TKeyPro)实体类
 *
 * @author makejava
 * @since 2020-06-28 15:58:22
 */
public class TKeyPro implements Serializable {
    private static final long serialVersionUID = -46691307863497196L;
    
    private String kId;
    
    private String kName;
    
    private String kDataRange;
    
    private Date kData;
    
    private String id;
    
    private String webType;
    
    private String kSeason;
    
    private Object mTime;
    
    private Integer sumTime;
    
    private Integer dataCount;
    
    private String remark;
    
    private String kAddr;
    
    private Boolean kRelease;


    public String getKId() {
        return kId;
    }

    public void setKId(String kId) {
        this.kId = kId;
    }

    public String getKName() {
        return kName;
    }

    public void setKName(String kName) {
        this.kName = kName;
    }

    public String getKDataRange() {
        return kDataRange;
    }

    public void setKDataRange(String kDataRange) {
        this.kDataRange = kDataRange;
    }

    public Date getKData() {
        return kData;
    }

    public void setKData(Date kData) {
        this.kData = kData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWebType() {
        return webType;
    }

    public void setWebType(String webType) {
        this.webType = webType;
    }

    public String getKSeason() {
        return kSeason;
    }

    public void setKSeason(String kSeason) {
        this.kSeason = kSeason;
    }

    public Object getMTime() {
        return mTime;
    }

    public void setMTime(Object mTime) {
        this.mTime = mTime;
    }

    public Integer getSumTime() {
        return sumTime;
    }

    public void setSumTime(Integer sumTime) {
        this.sumTime = sumTime;
    }

    public Integer getDataCount() {
        return dataCount;
    }

    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getKAddr() {
        return kAddr;
    }

    public void setKAddr(String kAddr) {
        this.kAddr = kAddr;
    }

    public Boolean getKRelease() {
        return kRelease;
    }

    public void setKRelease(Boolean kRelease) {
        this.kRelease = kRelease;
    }

    @Override
    public String toString() {
        return "TKeyPro{" +
                "kId='" + kId + '\'' +
                ", kName='" + kName + '\'' +
                ", kDataRange='" + kDataRange + '\'' +
                ", kData=" + kData +
                ", id='" + id + '\'' +
                '}';
    }
}