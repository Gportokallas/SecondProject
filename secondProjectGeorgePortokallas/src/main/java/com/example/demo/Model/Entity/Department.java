package com.example.demo.Model.Entity;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue
    private long id;
    private String desc;

    @ManyToOne
    private BusinessUnit businessUnit;

    public BusinessUnit getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }

    public Department() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Department(String desc) {
        this.desc = desc;
    }
}
