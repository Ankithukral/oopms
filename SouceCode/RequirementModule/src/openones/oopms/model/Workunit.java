package openones.oopms.model;
// Generated Jul 6, 2012 2:17:18 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Workunit generated by hbm2java
 */
public class Workunit  implements java.io.Serializable {


     private BigDecimal workunitid;
     private int type;
     private BigDecimal parentworkunitid;
     private BigDecimal tableid;
     private String workunitname;
     private Boolean protected_;
     private Set<Tasks> taskses = new HashSet<Tasks>(0);

    public Workunit() {
    }

	
    public Workunit(BigDecimal workunitid, int type, String workunitname) {
        this.workunitid = workunitid;
        this.type = type;
        this.workunitname = workunitname;
    }
    public Workunit(BigDecimal workunitid, int type, BigDecimal parentworkunitid, BigDecimal tableid, String workunitname, Boolean protected_, Set<Tasks> taskses) {
       this.workunitid = workunitid;
       this.type = type;
       this.parentworkunitid = parentworkunitid;
       this.tableid = tableid;
       this.workunitname = workunitname;
       this.protected_ = protected_;
       this.taskses = taskses;
    }
   
    public BigDecimal getWorkunitid() {
        return this.workunitid;
    }
    
    public void setWorkunitid(BigDecimal workunitid) {
        this.workunitid = workunitid;
    }
    public int getType() {
        return this.type;
    }
    
    public void setType(int type) {
        this.type = type;
    }
    public BigDecimal getParentworkunitid() {
        return this.parentworkunitid;
    }
    
    public void setParentworkunitid(BigDecimal parentworkunitid) {
        this.parentworkunitid = parentworkunitid;
    }
    public BigDecimal getTableid() {
        return this.tableid;
    }
    
    public void setTableid(BigDecimal tableid) {
        this.tableid = tableid;
    }
    public String getWorkunitname() {
        return this.workunitname;
    }
    
    public void setWorkunitname(String workunitname) {
        this.workunitname = workunitname;
    }
    public Boolean getProtected_() {
        return this.protected_;
    }
    
    public void setProtected_(Boolean protected_) {
        this.protected_ = protected_;
    }
    public Set<Tasks> getTaskses() {
        return this.taskses;
    }
    
    public void setTaskses(Set<Tasks> taskses) {
        this.taskses = taskses;
    }




}


