package openones.oopms.projecteye.model;
// Generated 12:18:17 01-03-2012 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * RiskCategory generated by hbm2java
 */
public class RiskCategory  implements java.io.Serializable {


     private BigDecimal categoryId;
     private String categoryName;
     private Byte isNew;
     private Set riskSources = new HashSet(0);

    public RiskCategory() {
    }

	
    public RiskCategory(BigDecimal categoryId) {
        this.categoryId = categoryId;
    }
    public RiskCategory(BigDecimal categoryId, String categoryName, Byte isNew, Set riskSources) {
       this.categoryId = categoryId;
       this.categoryName = categoryName;
       this.isNew = isNew;
       this.riskSources = riskSources;
    }
   
    public BigDecimal getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(BigDecimal categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Byte getIsNew() {
        return this.isNew;
    }
    
    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }
    public Set getRiskSources() {
        return this.riskSources;
    }
    
    public void setRiskSources(Set riskSources) {
        this.riskSources = riskSources;
    }




}

