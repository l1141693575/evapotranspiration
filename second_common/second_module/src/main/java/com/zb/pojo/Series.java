package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Series implements Serializable {
    //编号
    private Integer sid;
    //车系
    private String sname;
    //品牌编号
    private Integer sbid;
    //get set 方法
    public void setSid (Integer  sid){
        this.sid=sid;
    }
    public  Integer getSid(){
        return this.sid;
    }
    public void setSname (String  sname){
        this.sname=sname;
    }
    public  String getSname(){
        return this.sname;
    }
    public void setSbid (Integer  sbid){
        this.sbid=sbid;
    }
    public  Integer getSbid(){
        return this.sbid;
    }
}
