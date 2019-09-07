package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Engine implements Serializable {
    //
    private Integer ncid;
    //
    private String nscale;
    //
    private String nform;
    //
    private String ngas;
    //
    private String nsoup;
    //
    private String ntype;
    //get set 方法
    public void setNcid (Integer  ncid){
        this.ncid=ncid;
    }
    public  Integer getNcid(){
        return this.ncid;
    }
    public void setNscale (String  nscale){
        this.nscale=nscale;
    }
    public  String getNscale(){
        return this.nscale;
    }
    public void setNform (String  nform){
        this.nform=nform;
    }
    public  String getNform(){
        return this.nform;
    }
    public void setNgas (String  ngas){
        this.ngas=ngas;
    }
    public  String getNgas(){
        return this.ngas;
    }
    public void setNsoup (String  nsoup){
        this.nsoup=nsoup;
    }
    public  String getNsoup(){
        return this.nsoup;
    }
    public void setNtype (String  ntype){
        this.ntype=ntype;
    }
    public  String getNtype(){
        return this.ntype;
    }
}
