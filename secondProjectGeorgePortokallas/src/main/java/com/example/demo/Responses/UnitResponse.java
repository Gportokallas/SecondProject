package com.example.demo.Responses;

public class UnitResponse {

    public Long id;
    public String desc;

    public UnitResponse(Long id, String desc) {
        this.id = id;
        this.desc = desc;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
