package openones.oopms.planner.model;
// Generated Aug 5, 2012 2:58:18 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * Module generated by hbm2java
 */
public class Module  implements java.io.Serializable {


     private BigDecimal moduleId;
     private Project project;
     private Workproduct workproduct;
     private String name;
     private BigDecimal wpId;
     private BigDecimal plannedDefect;
     private BigDecimal replannedDefect;
     private Date plannedReviewDate;
     private Date plannedReleaseDate;
     private Date plannedTestEndDate;
     private BigDecimal plannedSize;
     private BigDecimal replannedSize;
     private Date actualReviewDate;
     private Date actualReleaseDate;
     private Date actualTestEndDate;
     private BigDecimal actualSize;
     private BigDecimal reuse;
     private BigDecimal isDeliverable;
     private String deliveryLocation;
     private String note;
     private BigDecimal status;
     private Date commitedDeliveryDate;
     private Date actualDeliveryDate;
     private String conductor;
     private String reviewers;
     private String approvers;
     private BigDecimal plannedSizeUnitId;
     private BigDecimal actualSizeUnitId;
     private BigDecimal plannedSizeType;
     private BigDecimal actualSizeType;
     private Date replannedReleaseDate;
     private String baseline;
     private Boolean baselineStatus;
     private String baselineNote;
     private BigDecimal replanDefectRate;
     private String noteDefectRate;
     private String reasion;
     private String action;
     private BigDecimal newPlanSizeTest;
     private BigDecimal newPlanSizeRev;
     private BigDecimal isDefectReview;
     private BigDecimal isDefectTest;

    public Module() {
    }

	
    public Module(BigDecimal moduleId, Project project, String name) {
        this.moduleId = moduleId;
        this.project = project;
        this.name = name;
    }
    public Module(BigDecimal moduleId, Project project, Workproduct workproduct, String name, BigDecimal wpId, BigDecimal plannedDefect, BigDecimal replannedDefect, Date plannedReviewDate, Date plannedReleaseDate, Date plannedTestEndDate, BigDecimal plannedSize, BigDecimal replannedSize, Date actualReviewDate, Date actualReleaseDate, Date actualTestEndDate, BigDecimal actualSize, BigDecimal reuse, BigDecimal isDeliverable, String deliveryLocation, String note, BigDecimal status, Date commitedDeliveryDate, Date actualDeliveryDate, String conductor, String reviewers, String approvers, BigDecimal plannedSizeUnitId, BigDecimal actualSizeUnitId, BigDecimal plannedSizeType, BigDecimal actualSizeType, Date replannedReleaseDate, String baseline, Boolean baselineStatus, String baselineNote, BigDecimal replanDefectRate, String noteDefectRate, String reasion, String action, BigDecimal newPlanSizeTest, BigDecimal newPlanSizeRev, BigDecimal isDefectReview, BigDecimal isDefectTest) {
       this.moduleId = moduleId;
       this.project = project;
       this.workproduct = workproduct;
       this.name = name;
       this.wpId = wpId;
       this.plannedDefect = plannedDefect;
       this.replannedDefect = replannedDefect;
       this.plannedReviewDate = plannedReviewDate;
       this.plannedReleaseDate = plannedReleaseDate;
       this.plannedTestEndDate = plannedTestEndDate;
       this.plannedSize = plannedSize;
       this.replannedSize = replannedSize;
       this.actualReviewDate = actualReviewDate;
       this.actualReleaseDate = actualReleaseDate;
       this.actualTestEndDate = actualTestEndDate;
       this.actualSize = actualSize;
       this.reuse = reuse;
       this.isDeliverable = isDeliverable;
       this.deliveryLocation = deliveryLocation;
       this.note = note;
       this.status = status;
       this.commitedDeliveryDate = commitedDeliveryDate;
       this.actualDeliveryDate = actualDeliveryDate;
       this.conductor = conductor;
       this.reviewers = reviewers;
       this.approvers = approvers;
       this.plannedSizeUnitId = plannedSizeUnitId;
       this.actualSizeUnitId = actualSizeUnitId;
       this.plannedSizeType = plannedSizeType;
       this.actualSizeType = actualSizeType;
       this.replannedReleaseDate = replannedReleaseDate;
       this.baseline = baseline;
       this.baselineStatus = baselineStatus;
       this.baselineNote = baselineNote;
       this.replanDefectRate = replanDefectRate;
       this.noteDefectRate = noteDefectRate;
       this.reasion = reasion;
       this.action = action;
       this.newPlanSizeTest = newPlanSizeTest;
       this.newPlanSizeRev = newPlanSizeRev;
       this.isDefectReview = isDefectReview;
       this.isDefectTest = isDefectTest;
    }
   
    public BigDecimal getModuleId() {
        return this.moduleId;
    }
    
    public void setModuleId(BigDecimal moduleId) {
        this.moduleId = moduleId;
    }
    public Project getProject() {
        return this.project;
    }
    
    public void setProject(Project project) {
        this.project = project;
    }
    public Workproduct getWorkproduct() {
        return this.workproduct;
    }
    
    public void setWorkproduct(Workproduct workproduct) {
        this.workproduct = workproduct;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getWpId() {
        return this.wpId;
    }
    
    public void setWpId(BigDecimal wpId) {
        this.wpId = wpId;
    }
    public BigDecimal getPlannedDefect() {
        return this.plannedDefect;
    }
    
    public void setPlannedDefect(BigDecimal plannedDefect) {
        this.plannedDefect = plannedDefect;
    }
    public BigDecimal getReplannedDefect() {
        return this.replannedDefect;
    }
    
    public void setReplannedDefect(BigDecimal replannedDefect) {
        this.replannedDefect = replannedDefect;
    }
    public Date getPlannedReviewDate() {
        return this.plannedReviewDate;
    }
    
    public void setPlannedReviewDate(Date plannedReviewDate) {
        this.plannedReviewDate = plannedReviewDate;
    }
    public Date getPlannedReleaseDate() {
        return this.plannedReleaseDate;
    }
    
    public void setPlannedReleaseDate(Date plannedReleaseDate) {
        this.plannedReleaseDate = plannedReleaseDate;
    }
    public Date getPlannedTestEndDate() {
        return this.plannedTestEndDate;
    }
    
    public void setPlannedTestEndDate(Date plannedTestEndDate) {
        this.plannedTestEndDate = plannedTestEndDate;
    }
    public BigDecimal getPlannedSize() {
        return this.plannedSize;
    }
    
    public void setPlannedSize(BigDecimal plannedSize) {
        this.plannedSize = plannedSize;
    }
    public BigDecimal getReplannedSize() {
        return this.replannedSize;
    }
    
    public void setReplannedSize(BigDecimal replannedSize) {
        this.replannedSize = replannedSize;
    }
    public Date getActualReviewDate() {
        return this.actualReviewDate;
    }
    
    public void setActualReviewDate(Date actualReviewDate) {
        this.actualReviewDate = actualReviewDate;
    }
    public Date getActualReleaseDate() {
        return this.actualReleaseDate;
    }
    
    public void setActualReleaseDate(Date actualReleaseDate) {
        this.actualReleaseDate = actualReleaseDate;
    }
    public Date getActualTestEndDate() {
        return this.actualTestEndDate;
    }
    
    public void setActualTestEndDate(Date actualTestEndDate) {
        this.actualTestEndDate = actualTestEndDate;
    }
    public BigDecimal getActualSize() {
        return this.actualSize;
    }
    
    public void setActualSize(BigDecimal actualSize) {
        this.actualSize = actualSize;
    }
    public BigDecimal getReuse() {
        return this.reuse;
    }
    
    public void setReuse(BigDecimal reuse) {
        this.reuse = reuse;
    }
    public BigDecimal getIsDeliverable() {
        return this.isDeliverable;
    }
    
    public void setIsDeliverable(BigDecimal isDeliverable) {
        this.isDeliverable = isDeliverable;
    }
    public String getDeliveryLocation() {
        return this.deliveryLocation;
    }
    
    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    public BigDecimal getStatus() {
        return this.status;
    }
    
    public void setStatus(BigDecimal status) {
        this.status = status;
    }
    public Date getCommitedDeliveryDate() {
        return this.commitedDeliveryDate;
    }
    
    public void setCommitedDeliveryDate(Date commitedDeliveryDate) {
        this.commitedDeliveryDate = commitedDeliveryDate;
    }
    public Date getActualDeliveryDate() {
        return this.actualDeliveryDate;
    }
    
    public void setActualDeliveryDate(Date actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }
    public String getConductor() {
        return this.conductor;
    }
    
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
    public String getReviewers() {
        return this.reviewers;
    }
    
    public void setReviewers(String reviewers) {
        this.reviewers = reviewers;
    }
    public String getApprovers() {
        return this.approvers;
    }
    
    public void setApprovers(String approvers) {
        this.approvers = approvers;
    }
    public BigDecimal getPlannedSizeUnitId() {
        return this.plannedSizeUnitId;
    }
    
    public void setPlannedSizeUnitId(BigDecimal plannedSizeUnitId) {
        this.plannedSizeUnitId = plannedSizeUnitId;
    }
    public BigDecimal getActualSizeUnitId() {
        return this.actualSizeUnitId;
    }
    
    public void setActualSizeUnitId(BigDecimal actualSizeUnitId) {
        this.actualSizeUnitId = actualSizeUnitId;
    }
    public BigDecimal getPlannedSizeType() {
        return this.plannedSizeType;
    }
    
    public void setPlannedSizeType(BigDecimal plannedSizeType) {
        this.plannedSizeType = plannedSizeType;
    }
    public BigDecimal getActualSizeType() {
        return this.actualSizeType;
    }
    
    public void setActualSizeType(BigDecimal actualSizeType) {
        this.actualSizeType = actualSizeType;
    }
    public Date getReplannedReleaseDate() {
        return this.replannedReleaseDate;
    }
    
    public void setReplannedReleaseDate(Date replannedReleaseDate) {
        this.replannedReleaseDate = replannedReleaseDate;
    }
    public String getBaseline() {
        return this.baseline;
    }
    
    public void setBaseline(String baseline) {
        this.baseline = baseline;
    }
    public Boolean getBaselineStatus() {
        return this.baselineStatus;
    }
    
    public void setBaselineStatus(Boolean baselineStatus) {
        this.baselineStatus = baselineStatus;
    }
    public String getBaselineNote() {
        return this.baselineNote;
    }
    
    public void setBaselineNote(String baselineNote) {
        this.baselineNote = baselineNote;
    }
    public BigDecimal getReplanDefectRate() {
        return this.replanDefectRate;
    }
    
    public void setReplanDefectRate(BigDecimal replanDefectRate) {
        this.replanDefectRate = replanDefectRate;
    }
    public String getNoteDefectRate() {
        return this.noteDefectRate;
    }
    
    public void setNoteDefectRate(String noteDefectRate) {
        this.noteDefectRate = noteDefectRate;
    }
    public String getReasion() {
        return this.reasion;
    }
    
    public void setReasion(String reasion) {
        this.reasion = reasion;
    }
    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
    public BigDecimal getNewPlanSizeTest() {
        return this.newPlanSizeTest;
    }
    
    public void setNewPlanSizeTest(BigDecimal newPlanSizeTest) {
        this.newPlanSizeTest = newPlanSizeTest;
    }
    public BigDecimal getNewPlanSizeRev() {
        return this.newPlanSizeRev;
    }
    
    public void setNewPlanSizeRev(BigDecimal newPlanSizeRev) {
        this.newPlanSizeRev = newPlanSizeRev;
    }
    public BigDecimal getIsDefectReview() {
        return this.isDefectReview;
    }
    
    public void setIsDefectReview(BigDecimal isDefectReview) {
        this.isDefectReview = isDefectReview;
    }
    public BigDecimal getIsDefectTest() {
        return this.isDefectTest;
    }
    
    public void setIsDefectTest(BigDecimal isDefectTest) {
        this.isDefectTest = isDefectTest;
    }




}


