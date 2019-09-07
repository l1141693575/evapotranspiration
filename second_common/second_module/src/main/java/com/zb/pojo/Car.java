package com.zb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Car implements Serializable {
    //
    private Integer cid;
    //
    private Integer csid;
    //
    private Double cprice;
    //
    private Integer cage;
    //
    private Integer cspeed;
    //
    private Double cmodel;
    //
    private Double cmileage;
    //
    private Double cyield;
    //
    private Integer cstandard;
    //
    private Integer cseat;
    //
    private Integer cfuel;
    //
    private Integer ccolor;
    //
    private Integer clocation;
    //
    private Integer cdrive;
    //
    private Integer cnationality;
    //
    private Integer clightspot;
    //
    private Integer cstaes;
    //
    private Integer cstrict;
    //
    private Integer cshort;
    //
    private Integer coverflow;
    //
    private Integer cpractice;
    //
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cdatetime;
    //
    private Integer cvehicle;
    //@
    private Integer cstate;
    //get set 方法
    public void setCid (Integer  cid){
        this.cid=cid;
    }
    public  Integer getCid(){
        return this.cid;
    }
    public void setCsid (Integer  csid){
        this.csid=csid;
    }
    public  Integer getCsid(){
        return this.csid;
    }
    public void setCprice (Double  cprice){
        this.cprice=cprice;
    }
    public  Double getCprice(){
        return this.cprice;
    }
    public void setCage (Integer  cage){
        this.cage=cage;
    }
    public  Integer getCage(){
        return this.cage;
    }
    public void setCspeed (Integer  cspeed){
        this.cspeed=cspeed;
    }
    public  Integer getCspeed(){
        return this.cspeed;
    }
    public void setCmodel (Double  cmodel){
        this.cmodel=cmodel;
    }
    public  Double getCmodel(){
        return this.cmodel;
    }
    public void setCmileage (Double  cmileage){
        this.cmileage=cmileage;
    }
    public  Double getCmileage(){
        return this.cmileage;
    }
    public void setCyield (Double  cyield){
        this.cyield=cyield;
    }
    public  Double getCyield(){
        return this.cyield;
    }
    public void setCstandard (Integer  cstandard){
        this.cstandard=cstandard;
    }
    public  Integer getCstandard(){
        return this.cstandard;
    }
    public void setCseat (Integer  cseat){
        this.cseat=cseat;
    }
    public  Integer getCseat(){
        return this.cseat;
    }
    public void setCfuel (Integer  cfuel){
        this.cfuel=cfuel;
    }
    public  Integer getCfuel(){
        return this.cfuel;
    }
    public void setCcolor (Integer  ccolor){
        this.ccolor=ccolor;
    }
    public  Integer getCcolor(){
        return this.ccolor;
    }
    public void setClocation (Integer  clocation){
        this.clocation=clocation;
    }
    public  Integer getClocation(){
        return this.clocation;
    }
    public void setCdrive (Integer  cdrive){
        this.cdrive=cdrive;
    }
    public  Integer getCdrive(){
        return this.cdrive;
    }
    public void setCnationality (Integer  cnationality){
        this.cnationality=cnationality;
    }
    public  Integer getCnationality(){
        return this.cnationality;
    }
    public void setClightspot (Integer  clightspot){
        this.clightspot=clightspot;
    }
    public  Integer getClightspot(){
        return this.clightspot;
    }
    public void setCstaes (Integer  cstaes){
        this.cstaes=cstaes;
    }
    public  Integer getCstaes(){
        return this.cstaes;
    }
    public void setCstrict (Integer  cstrict){
        this.cstrict=cstrict;
    }
    public  Integer getCstrict(){
        return this.cstrict;
    }
    public void setCshort (Integer  cshort){
        this.cshort=cshort;
    }
    public  Integer getCshort(){
        return this.cshort;
    }
    public void setCoverflow (Integer  coverflow){
        this.coverflow=coverflow;
    }
    public  Integer getCoverflow(){
        return this.coverflow;
    }
    public void setCpractice (Integer  cpractice){
        this.cpractice=cpractice;
    }
    public  Integer getCpractice(){
        return this.cpractice;
    }
    public void setCdatetime (Date  cdatetime){
        this.cdatetime=cdatetime;
    }
    public  Date getCdatetime(){
        return this.cdatetime;
    }
    public void setCvehicle (Integer  cvehicle){
        this.cvehicle=cvehicle;
    }
    public  Integer getCvehicle(){
        return this.cvehicle;
    }
    public void setCstate (Integer  cstate){
        this.cstate=cstate;
    }
    public  Integer getCstate(){
        return this.cstate;
    }
}
