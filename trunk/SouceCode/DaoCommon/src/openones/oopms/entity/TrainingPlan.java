package openones.oopms.entity;
// Generated 12:18:17 01-03-2012 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * TrainingPlan generated by hbm2java
 */
public class TrainingPlan  implements java.io.Serializable {


     private BigDecimal trainingPlanId;
     private Project project;
     private String description;
     private String participants;
     private String waiverCriteria;
     private Date startDate;
     private Date endDate;
     private Date actualEndDate;
     private String topic;
     private Boolean verifyby;
     private String duration;

    public TrainingPlan() {
    }

	
    public TrainingPlan(BigDecimal trainingPlanId) {
        this.trainingPlanId = trainingPlanId;
    }
    public TrainingPlan(BigDecimal trainingPlanId, Project project, String description, String participants, String waiverCriteria, Date startDate, Date endDate, Date actualEndDate, String topic, Boolean verifyby, String duration) {
       this.trainingPlanId = trainingPlanId;
       this.project = project;
       this.description = description;
       this.participants = participants;
       this.waiverCriteria = waiverCriteria;
       this.startDate = startDate;
       this.endDate = endDate;
       this.actualEndDate = actualEndDate;
       this.topic = topic;
       this.verifyby = verifyby;
       this.duration = duration;
    }
   
    public BigDecimal getTrainingPlanId() {
        return this.trainingPlanId;
    }
    
    public void setTrainingPlanId(BigDecimal trainingPlanId) {
        this.trainingPlanId = trainingPlanId;
    }
    public Project getProject() {
        return this.project;
    }
    
    public void setProject(Project project) {
        this.project = project;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getParticipants() {
        return this.participants;
    }
    
    public void setParticipants(String participants) {
        this.participants = participants;
    }
    public String getWaiverCriteria() {
        return this.waiverCriteria;
    }
    
    public void setWaiverCriteria(String waiverCriteria) {
        this.waiverCriteria = waiverCriteria;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Date getActualEndDate() {
        return this.actualEndDate;
    }
    
    public void setActualEndDate(Date actualEndDate) {
        this.actualEndDate = actualEndDate;
    }
    public String getTopic() {
        return this.topic;
    }
    
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public Boolean getVerifyby() {
        return this.verifyby;
    }
    
    public void setVerifyby(Boolean verifyby) {
        this.verifyby = verifyby;
    }
    public String getDuration() {
        return this.duration;
    }
    
    public void setDuration(String duration) {
        this.duration = duration;
    }




}


