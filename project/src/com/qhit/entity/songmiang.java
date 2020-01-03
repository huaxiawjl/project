package com.qhit.entity;

public class songmiang {
    private int Sid;
    private String Sname;
    private String Szhuzhi;
    private int Sdianhua;
    private String Sneirong;

    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSzhuzhi() {
        return Szhuzhi;
    }

    public void setSzhuzhi(String szhuzhi) {
        Szhuzhi = szhuzhi;
    }

    public int getSdianhua() {
        return Sdianhua;
    }

    public void setSdianhua(int sdianhua) {
        Sdianhua = sdianhua;
    }

    public String getSneirong() {
        return Sneirong;
    }

    public void setSneirong(String sneirong) {
        Sneirong = sneirong;
    }

    @Override
    public String toString() {
        return "songmiang{" +
                "Sid=" + Sid +
                ", Sname='" + Sname + '\'' +
                ", Szhuzhi='" + Szhuzhi + '\'' +
                ", Sdianhua=" + Sdianhua +
                ", Sneirong='" + Sneirong + '\'' +
                '}';
    }
}
