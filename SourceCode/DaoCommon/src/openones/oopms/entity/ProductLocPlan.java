package openones.oopms.entity;
// Generated 12:18:17 01-03-2012 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * ProductLocPlan generated by hbm2java
 */
public class ProductLocPlan  implements java.io.Serializable {


     private BigDecimal productLocId;
     private Module module;
     private Project project;
     private Language language;
     private BigDecimal locProductivity;
     private BigDecimal locQuality;
     private BigDecimal motherBody;
     private BigDecimal added;
     private BigDecimal modified;
     private BigDecimal total;
     private BigDecimal reused;
     private BigDecimal generated;
     private String note;

    public ProductLocPlan() {
    }

	
    public ProductLocPlan(BigDecimal productLocId, Module module, Project project, Language language) {
        this.productLocId = productLocId;
        this.module = module;
        this.project = project;
        this.language = language;
    }
    public ProductLocPlan(BigDecimal productLocId, Module module, Project project, Language language, BigDecimal locProductivity, BigDecimal locQuality, BigDecimal motherBody, BigDecimal added, BigDecimal modified, BigDecimal total, BigDecimal reused, BigDecimal generated, String note) {
       this.productLocId = productLocId;
       this.module = module;
       this.project = project;
       this.language = language;
       this.locProductivity = locProductivity;
       this.locQuality = locQuality;
       this.motherBody = motherBody;
       this.added = added;
       this.modified = modified;
       this.total = total;
       this.reused = reused;
       this.generated = generated;
       this.note = note;
    }
   
    public BigDecimal getProductLocId() {
        return this.productLocId;
    }
    
    public void setProductLocId(BigDecimal productLocId) {
        this.productLocId = productLocId;
    }
    public Module getModule() {
        return this.module;
    }
    
    public void setModule(Module module) {
        this.module = module;
    }
    public Project getProject() {
        return this.project;
    }
    
    public void setProject(Project project) {
        this.project = project;
    }
    public Language getLanguage() {
        return this.language;
    }
    
    public void setLanguage(Language language) {
        this.language = language;
    }
    public BigDecimal getLocProductivity() {
        return this.locProductivity;
    }
    
    public void setLocProductivity(BigDecimal locProductivity) {
        this.locProductivity = locProductivity;
    }
    public BigDecimal getLocQuality() {
        return this.locQuality;
    }
    
    public void setLocQuality(BigDecimal locQuality) {
        this.locQuality = locQuality;
    }
    public BigDecimal getMotherBody() {
        return this.motherBody;
    }
    
    public void setMotherBody(BigDecimal motherBody) {
        this.motherBody = motherBody;
    }
    public BigDecimal getAdded() {
        return this.added;
    }
    
    public void setAdded(BigDecimal added) {
        this.added = added;
    }
    public BigDecimal getModified() {
        return this.modified;
    }
    
    public void setModified(BigDecimal modified) {
        this.modified = modified;
    }
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public BigDecimal getReused() {
        return this.reused;
    }
    
    public void setReused(BigDecimal reused) {
        this.reused = reused;
    }
    public BigDecimal getGenerated() {
        return this.generated;
    }
    
    public void setGenerated(BigDecimal generated) {
        this.generated = generated;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}


