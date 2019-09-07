package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Chassis implements Serializable {
    //
    private Integer hcid;
    //
    private String hdrive;
    //
    private String hhelp;
    //
    private String hbraking;
    //
    private String hfront;
    //
    private String hqueen;
    //get set 方法
    public void setHcid (Integer  hcid){
        this.hcid=hcid;
    }
    public  Integer getHcid(){
        return this.hcid;
    }
    public void setHdrive (String  hdrive){
        this.hdrive=hdrive;
    }
    public  String getHdrive(){
        return this.hdrive;
    }
    public void setHhelp (String  hhelp){
        this.hhelp=hhelp;
    }
    public  String getHhelp(){
        return this.hhelp;
    }
    public void setHbraking (String  hbraking){
        this.hbraking=hbraking;
    }
    public  String getHbraking(){
        return this.hbraking;
    }
    public void setHfront (String  hfront){
        this.hfront=hfront;
    }
    public  String getHfront(){
        return this.hfront;
    }
    public void setHqueen (String  hqueen){
        this.hqueen=hqueen;
    }
    public  String getHqueen(){
        return this.hqueen;
    }
}
