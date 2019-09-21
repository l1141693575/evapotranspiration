package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Brand implements Serializable {
    //编号
    private Integer bid;
    //品牌
    private String bname;
    //get set 方法
    public void setBid (Integer  bid){
        this.bid=bid;
    }
    public  Integer getBid(){
        return this.bid;
    }
    public void setBname (String  bname){
        this.bname=bname;
    }
    public  String getBname(){
        return this.bname;
    }
}
