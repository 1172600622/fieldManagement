package cn.edu.jxust.entity;

import java.util.Arrays;

public class LJP_VOV {
    LJIP lijp;
    String address[]=new String[4];

    public LJIP getLijp() {
        return lijp;
    }

    public void setLijp(LJIP lijp) {
        this.lijp = lijp;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "LJP_VOV{" +
                "lijp=" + lijp +
                ", address=" + Arrays.toString(address) +
                '}';
    }
}
