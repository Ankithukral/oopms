package openones.oopms.entity;
// Generated 12:18:17 01-03-2012 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Tailoring generated by hbm2java
 */
public class Tailoring  implements java.io.Serializable {


     private BigDecimal tailId;
     private String tailPer;
     private String appCri;
     private BigDecimal processId;
     private String status;
     private String category;
     private BigDecimal action;
     private BigDecimal note;
     private Set projectTailorings = new HashSet(0);

    public Tailoring() {
    }

	
    public Tailoring(BigDecimal tailId, String tailPer, String appCri) {
        this.tailId = tailId;
        this.tailPer = tailPer;
        this.appCri = appCri;
    }
    public Tailoring(BigDecimal tailId, String tailPer, String appCri, BigDecimal processId, String status, String category, BigDecimal action, BigDecimal note, Set projectTailorings) {
       this.tailId = tailId;
       this.tailPer = tailPer;
       this.appCri = appCri;
       this.processId = processId;
       this.status = status;
       this.category = category;
       this.action = action;
       this.note = note;
       this.projectTailorings = projectTailorings;
    }
   
    public BigDecimal getTailId() {
        return this.tailId;
    }
    
    public void setTailId(BigDecimal tailId) {
        this.tailId = tailId;
    }
    public String getTailPer() {
        return this.tailPer;
    }
    
    public void setTailPer(String tailPer) {
        this.tailPer = tailPer;
    }
    public String getAppCri() {
        return this.appCri;
    }
    
    public void setAppCri(String appCri) {
        this.appCri = appCri;
    }
    public BigDecimal getProcessId() {
        return this.processId;
    }
    
    public void setProcessId(BigDecimal processId) {
        this.processId = processId;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public BigDecimal getAction() {
        return this.action;
    }
    
    public void setAction(BigDecimal action) {
        this.action = action;
    }
    public BigDecimal getNote() {
        return this.note;
    }
    
    public void setNote(BigDecimal note) {
        this.note = note;
    }
    public Set getProjectTailorings() {
        return this.projectTailorings;
    }
    
    public void setProjectTailorings(Set projectTailorings) {
        this.projectTailorings = projectTailorings;
    }




}

