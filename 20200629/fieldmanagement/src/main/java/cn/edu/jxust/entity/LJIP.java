package cn.edu.jxust.entity;

public class LJIP {
    int LJIP_id;
    String LJIP_name;
    String   LJIP_time;
    String       LJIP_maker;
    String          LJIP_type;
    String         LJIP_season;
    String         LJIP_mtimes;

    String         LJIP_sub;
    String         LJIP_each;
    String        LJIP_memo;

    String   LJIP_address;

    public String getLJIP_address() {
        return LJIP_address;
    }

    public void setLJIP_address(String LJIP_address) {
        this.LJIP_address = LJIP_address;
    }

    public int getLJIP_id() {
        return LJIP_id;
    }

    public void setLJIP_id(int LJIP_id) {
        this.LJIP_id = LJIP_id;
    }

    public String getLJIP_name() {
        return LJIP_name;
    }

    public void setLJIP_name(String LJIP_name) {
        this.LJIP_name = LJIP_name;
    }

    public String getLJIP_time() {
        return LJIP_time;
    }

    public void setLJIP_time(String LJIP_time) {
        this.LJIP_time = LJIP_time;
    }

    public String getLJIP_maker() {
        return LJIP_maker;
    }

    public void setLJIP_maker(String LJIP_maker) {
        this.LJIP_maker = LJIP_maker;
    }

    public String getLJIP_type() {
        return LJIP_type;
    }

    public void setLJIP_type(String LJIP_type) {
        this.LJIP_type = LJIP_type;
    }

    public String getLJIP_season() {
        return LJIP_season;
    }

    public void setLJIP_season(String LJIP_season) {
        this.LJIP_season = LJIP_season;
    }

    public String getLJIP_mtimes() {
        return LJIP_mtimes;
    }

    public void setLJIP_mtimes(String LJIP_mtimes) {
        this.LJIP_mtimes = LJIP_mtimes;
    }

    public String getLJIP_sub() {
        return LJIP_sub;
    }

    public void setLJIP_sub(String LJIP_sub) {
        this.LJIP_sub = LJIP_sub;
    }

    public String getLJIP_each() {
        return LJIP_each;
    }

    public void setLJIP_each(String LJIP_each) {
        this.LJIP_each = LJIP_each;
    }

    public String getLJIP_memo() {
        return LJIP_memo;
    }

    public void setLJIP_memo(String LJIP_memo) {
        this.LJIP_memo = LJIP_memo;
    }

    @Override
    public String toString() {
        return "LJIP{" +
                "id=" + LJIP_id +
                ", LJIP_name='" + LJIP_name + '\'' +
                ", LJIP_time='" + LJIP_time + '\'' +
                ", LJIP_maker='" + LJIP_maker + '\'' +
                ", LJIP_type='" + LJIP_type + '\'' +
                ", LJIP_season='" + LJIP_season + '\'' +
                ", LJIP_mtimes='" + LJIP_mtimes + '\'' +
                ", LJIP_sub='" + LJIP_sub + '\'' +
                ", LJIP_each='" + LJIP_each + '\'' +
                ", LJIP_memo='" + LJIP_memo + '\'' +
                '}';
    }
}
