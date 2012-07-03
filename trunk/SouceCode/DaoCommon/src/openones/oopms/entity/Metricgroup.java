package openones.oopms.entity;
// Generated 12:18:17 01-03-2012 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Metricgroup generated by hbm2java
 */
public class Metricgroup  implements java.io.Serializable {


     private BigDecimal mgroupId;
     private String groupname;
     private BigDecimal parentId;
     private Set metricDeses = new HashSet(0);
     private Set pcbs = new HashSet(0);

    public Metricgroup() {
    }

	
    public Metricgroup(BigDecimal mgroupId, String groupname) {
        this.mgroupId = mgroupId;
        this.groupname = groupname;
    }
    public Metricgroup(BigDecimal mgroupId, String groupname, BigDecimal parentId, Set metricDeses, Set pcbs) {
       this.mgroupId = mgroupId;
       this.groupname = groupname;
       this.parentId = parentId;
       this.metricDeses = metricDeses;
       this.pcbs = pcbs;
    }
   
    public BigDecimal getMgroupId() {
        return this.mgroupId;
    }
    
    public void setMgroupId(BigDecimal mgroupId) {
        this.mgroupId = mgroupId;
    }
    public String getGroupname() {
        return this.groupname;
    }
    
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
    public BigDecimal getParentId() {
        return this.parentId;
    }
    
    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }
    public Set getMetricDeses() {
        return this.metricDeses;
    }
    
    public void setMetricDeses(Set metricDeses) {
        this.metricDeses = metricDeses;
    }
    public Set getPcbs() {
        return this.pcbs;
    }
    
    public void setPcbs(Set pcbs) {
        this.pcbs = pcbs;
    }




}


