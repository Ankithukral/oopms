package openones.oopms.entity;
// Generated 12:18:17 01-03-2012 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * Typeofwork generated by hbm2java
 */
public class Typeofwork  implements java.io.Serializable {


     private BigDecimal towId;
     private String name;

    public Typeofwork() {
    }

    public Typeofwork(BigDecimal towId, String name) {
       this.towId = towId;
       this.name = name;
    }
   
    public BigDecimal getTowId() {
        return this.towId;
    }
    
    public void setTowId(BigDecimal towId) {
        this.towId = towId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


