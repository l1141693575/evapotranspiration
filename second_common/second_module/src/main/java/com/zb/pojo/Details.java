package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Details implements Serializable {
    //
    private Integer dcid;
    //
    private Integer dsafeguard;
    //
    private Integer dretreat;
    //
    private Integer dequip;
    //
    private Integer dserve;
    //
    private Integer dtable;
    //
    private Integer dsift;
    //
    private Integer dseal;
    //
    private Integer ddetect;
    //get set 方法
    public void setDcid (Integer  dcid){
        this.dcid=dcid;
    }
    public  Integer getDcid(){
        return this.dcid;
    }
    public void setDsafeguard (Integer  dsafeguard){
        this.dsafeguard=dsafeguard;
    }
    public  Integer getDsafeguard(){
        return this.dsafeguard;
    }
    public void setDretreat (Integer  dretreat){
        this.dretreat=dretreat;
    }
    public  Integer getDretreat(){
        return this.dretreat;
    }
    public void setDequip (Integer  dequip){
        this.dequip=dequip;
    }
    public  Integer getDequip(){
        return this.dequip;
    }
    public void setDserve (Integer  dserve){
        this.dserve=dserve;
    }
    public  Integer getDserve(){
        return this.dserve;
    }
    public void setDtable (Integer  dtable){
        this.dtable=dtable;
    }
    public  Integer getDtable(){
        return this.dtable;
    }
    public void setDsift (Integer  dsift){
        this.dsift=dsift;
    }
    public  Integer getDsift(){
        return this.dsift;
    }
    public void setDseal (Integer  dseal){
        this.dseal=dseal;
    }
    public  Integer getDseal(){
        return this.dseal;
    }
    public void setDdetect (Integer  ddetect){
        this.ddetect=ddetect;
    }
    public  Integer getDdetect(){
        return this.ddetect;
    }
}
