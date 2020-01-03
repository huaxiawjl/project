package com.qhit.entity;

public class hongming {
   private int Hid;
   private String Hanme;
   private String Hsex;
   private int Hage;
   private String Hxuexiao;
   private String Hzhiwei;
   private String Hdanwei;
   private int Hdianhua;


   public int getHid() {
      return Hid;
   }

   public void setHid(int hid) {
      Hid = hid;
   }

   public String getHanme() {
      return Hanme;
   }

   public void setHanme(String hanme) {
      Hanme = hanme;
   }

   public String getHsex() {
      return Hsex;
   }

   public void setHsex(String hsex) {
      Hsex = hsex;
   }

   public int getHage() {
      return Hage;
   }

   public void setHage(int hage) {
      Hage = hage;
   }

   public String getHxuexiao() {
      return Hxuexiao;
   }

   public void setHxuexiao(String hxuexiao) {
      Hxuexiao = hxuexiao;
   }

   public String getHzhiwei() {
      return Hzhiwei;
   }

   public void setHzhiwei(String hzhiwei) {
      Hzhiwei = hzhiwei;
   }

   public String getHdanwei() {
      return Hdanwei;
   }

   public void setHdanwei(String hdanwei) {
      Hdanwei = hdanwei;
   }

   public int getHdianhua() {
      return Hdianhua;
   }

   @Override
   public String toString() {
      return "hongming{" +
              "Hid=" + Hid +
              ", Hanme='" + Hanme + '\'' +
              ", Hsex='" + Hsex + '\'' +
              ", Hage=" + Hage +
              ", Hxuexiao='" + Hxuexiao + '\'' +
              ", Hzhiwei='" + Hzhiwei + '\'' +
              ", Hdanwei='" + Hdanwei + '\'' +
              ", Hdianhua=" + Hdianhua +
              '}';
   }

   public void setHdianhua(int hdianhua) {
      Hdianhua = hdianhua;
   }

}
