package com.okay.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = -1152779434213289790L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PKID")
    private Integer pkid;

    @Column(name = "ISACTIVE")
    private Boolean isActive;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "CREATEDBY")
    private String createdBy;

    @Column(name = "UPDATED")
    private Date updated;

    @Column(name = "UPDATEDBY")
    private String updatedBy;

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}