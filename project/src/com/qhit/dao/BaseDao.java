package com.qhit.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;

public class BaseDao {
    private static ComboPooledDataSource dataSource=new ComboPooledDataSource("c3p0-config.xml");
    static Connection coon=null;
    static{
        try {
            coon=dataSource.getConnection();
            if (coon!=null){
                System.out.println("数据库连接成功");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){

    }
}
