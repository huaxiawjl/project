package com.qhit.entity;

import java.util.Date;

public class jilu {
    private int Jid;
    private int Iid1;
    private int Iid2;
    private Date Daty1;
    private Date Daty2;
    private String Taty;
    private int Jieguo;
    private String Beizhu;

    public int getJid() {
        return Jid;
    }

    public void setJid(int jid) {
        Jid = jid;
    }

    public int getIid1() {
        return Iid1;
    }

    public void setIid1(int iid1) {
        Iid1 = iid1;
    }

    public int getIid2() {
        return Iid2;
    }

    public void setIid2(int iid2) {
        Iid2 = iid2;
    }

    public Date getDaty1() {
        return Daty1;
    }

    public void setDaty1(Date daty1) {
        Daty1 = daty1;
    }

    public Date getDaty2() {
        return Daty2;
    }

    public void setDaty2(Date daty2) {
        Daty2 = daty2;
    }

    public String getTaty() {
        return Taty;
    }

    public void setTaty(String taty) {
        Taty = taty;
    }

    public int getJieguo() {
        return Jieguo;
    }

    public void setJieguo(int jieguo) {
        Jieguo = jieguo;
    }

    public String getBeizhu() {
        return Beizhu;
    }

    public void setBeizhu(String beizhu) {
        Beizhu = beizhu;
    }

    @Override
    public String toString() {
        return "jilu{" +
                "Jid=" + Jid +
                ", Iid1=" + Iid1 +
                ", Iid2=" + Iid2 +
                ", Daty1=" + Daty1 +
                ", Daty2=" + Daty2 +
                ", Taty='" + Taty + '\'' +
                ", Jieguo=" + Jieguo +
                ", Beizhu='" + Beizhu + '\'' +
                '}';
    }
}
