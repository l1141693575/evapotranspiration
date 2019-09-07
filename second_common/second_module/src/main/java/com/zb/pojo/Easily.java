package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Easily implements Serializable {
    //
    private Integer ycid;
    //
    private Integer ybox;
    //
    private Integer ystor;
    //
    private Integer ypump;
    //
    private Integer yjel;
    //
    private Integer yengine;
    //
    private Integer ycold;
    //get set 方法
    public void setYcid (Integer  ycid){
        this.ycid=ycid;
    }
    public  Integer getYcid(){
        return this.ycid;
    }
    public void setYbox (Integer  ybox){
        this.ybox=ybox;
    }
    public  Integer getYbox(){
        return this.ybox;
    }
    public void setYstor (Integer  ystor){
        this.ystor=ystor;
    }
    public  Integer getYstor(){
        return this.ystor;
    }
    public void setYpump (Integer  ypump){
        this.ypump=ypump;
    }
    public  Integer getYpump(){
        return this.ypump;
    }
    public void setYjel (Integer  yjel){
        this.yjel=yjel;
    }
    public  Integer getYjel(){
        return this.yjel;
    }
    public void setYengine (Integer  yengine){
        this.yengine=yengine;
    }
    public  Integer getYengine(){
        return this.yengine;
    }
    public void setYcold (Integer  ycold){
        this.ycold=ycold;
    }
    public  Integer getYcold(){
        return this.ycold;
    }
}
