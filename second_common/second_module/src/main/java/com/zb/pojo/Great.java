package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Great implements Serializable {
    //
    private Integer gcid;
    //
    private Integer gleft;
    //
    private Integer gright;
    //
    private Integer gfirewall;
    //
    private Integer gtrunk;
    //
    private Integer gbumper;
    //
    private Integer gtop;
    //get set 方法
    public void setGcid (Integer  gcid){
        this.gcid=gcid;
    }
    public  Integer getGcid(){
        return this.gcid;
    }
    public void setGleft (Integer  gleft){
        this.gleft=gleft;
    }
    public  Integer getGleft(){
        return this.gleft;
    }
    public void setGright (Integer  gright){
        this.gright=gright;
    }
    public  Integer getGright(){
        return this.gright;
    }
    public void setGfirewall (Integer  gfirewall){
        this.gfirewall=gfirewall;
    }
    public  Integer getGfirewall(){
        return this.gfirewall;
    }
    public void setGtrunk (Integer  gtrunk){
        this.gtrunk=gtrunk;
    }
    public  Integer getGtrunk(){
        return this.gtrunk;
    }
    public void setGbumper (Integer  gbumper){
        this.gbumper=gbumper;
    }
    public  Integer getGbumper(){
        return this.gbumper;
    }
    public void setGtop (Integer  gtop){
        this.gtop=gtop;
    }
    public  Integer getGtop(){
        return this.gtop;
    }
}
