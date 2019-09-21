package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Essential implements Serializable {
    //
    private Integer ecid;
    //
    private String eidentity;
    //
    private String erank;
    //
    private String eengine;
    //
    private String espeed;
    //
    private String estructure;
    //get set 方法
    public void setEcid (Integer  ecid){
        this.ecid=ecid;
    }
    public  Integer getEcid(){
        return this.ecid;
    }
    public void setEidentity (String  eidentity){
        this.eidentity=eidentity;
    }
    public  String getEidentity(){
        return this.eidentity;
    }
    public void setErank (String  erank){
        this.erank=erank;
    }
    public  String getErank(){
        return this.erank;
    }
    public void setEengine (String  eengine){
        this.eengine=eengine;
    }
    public  String getEengine(){
        return this.eengine;
    }
    public void setEspeed (String  espeed){
        this.espeed=espeed;
    }
    public  String getEspeed(){
        return this.espeed;
    }
    public void setEstructure (String  estructure){
        this.estructure=estructure;
    }
    public  String getEstructure(){
        return this.estructure;
    }
}
