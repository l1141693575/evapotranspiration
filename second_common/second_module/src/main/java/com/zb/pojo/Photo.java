package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Photo implements Serializable {
    //
    private Integer pid;
    //
    private Integer pcid;
    //
    private String pphoto;
    //
    private Integer pindex;
    //
    private String pname;
    //get set 方法
    public void setPid (Integer  pid){
        this.pid=pid;
    }
    public  Integer getPid(){
        return this.pid;
    }
    public void setPcid (Integer  pcid){
        this.pcid=pcid;
    }
    public  Integer getPcid(){
        return this.pcid;
    }
    public void setPphoto (String  pphoto){
        this.pphoto=pphoto;
    }
    public  String getPphoto(){
        return this.pphoto;
    }
    public void setPindex (Integer  pindex){
        this.pindex=pindex;
    }
    public  Integer getPindex(){
        return this.pindex;
    }
    public void setPname (String  pname){
        this.pname=pname;
    }
    public  String getPname(){
        return this.pname;
    }
}
