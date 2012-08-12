package openones.oopms.entity;
// Generated 12:18:17 01-03-2012 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * ApSizeunit generated by hbm2java
 */
public class ApSizeunit  implements java.io.Serializable {


     private BigDecimal unitId;
     private String name;
     private Set wpSizes = new HashSet(0);

    public ApSizeunit() {
    }

	
    public ApSizeunit(BigDecimal unitId, String name) {
        this.unitId = unitId;
        this.name = name;
    }
    public ApSizeunit(BigDecimal unitId, String name, Set wpSizes) {
       this.unitId = unitId;
       this.name = name;
       this.wpSizes = wpSizes;
    }
   
    public BigDecimal getUnitId() {
        return this.unitId;
    }
    
    public void setUnitId(BigDecimal unitId) {
        this.unitId = unitId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getWpSizes() {
        return this.wpSizes;
    }
    
    public void setWpSizes(Set wpSizes) {
        this.wpSizes = wpSizes;
    }




}


