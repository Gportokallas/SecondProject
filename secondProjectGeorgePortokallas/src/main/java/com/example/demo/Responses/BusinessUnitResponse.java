package com.example.demo.Responses;

import com.example.demo.Model.Entity.Company;

import javax.persistence.ManyToOne;

public class BusinessUnitResponse {

    private long id;
    private String desc;

    public BusinessUnitResponse(long id, String desc) {
        this.id = id;
        this.desc = desc;
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


}
