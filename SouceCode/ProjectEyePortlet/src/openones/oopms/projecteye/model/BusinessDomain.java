package openones.oopms.projecteye.model;
// Generated Jul 17, 2012 12:55:28 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * BusinessDomain generated by hbm2java
 */
public class BusinessDomain  implements java.io.Serializable {


     private BigDecimal domainId;
     private String domainName;
     private String status;

    public BusinessDomain() {
    }

	
    public BusinessDomain(BigDecimal domainId, String domainName) {
        this.domainId = domainId;
        this.domainName = domainName;
    }
    public BusinessDomain(BigDecimal domainId, String domainName, String status) {
       this.domainId = domainId;
       this.domainName = domainName;
       this.status = status;
    }
   
    public BigDecimal getDomainId() {
        return this.domainId;
    }
    
    public void setDomainId(BigDecimal domainId) {
        this.domainId = domainId;
    }
    public String getDomainName() {
        return this.domainName;
    }
    
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


