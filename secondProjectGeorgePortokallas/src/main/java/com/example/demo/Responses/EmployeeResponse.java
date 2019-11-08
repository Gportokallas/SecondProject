package com.example.demo.Responses;

import com.example.demo.Model.Enum.ContractType;

public class EmployeeResponse {

    public long id;
    public String fullName;
    public String address;
    public String telephone;
    public String workingPeriod;
    private int recordNumber;
    public boolean active;
    public ContractType contractType;
    public String position;

    public String unitName;

    // id, recordNumber, fullname, telephone, workingPeriod ( θα υπολογιζεται απο starting date - end date, βαλτε present αν δεν εχει φύγει) , status, contractType, position, unitName (edited)

    public EmployeeResponse(int recordNumber, long id, String fullName, String address, String telephone, String workingPeriod, boolean Active, ContractType contractType, String position, String unitName) {

        this.recordNumber = recordNumber;
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.telephone = telephone;
        this.workingPeriod = workingPeriod;
        this.active = Active;
        this.contractType = contractType;
        this.position = position;
        this.unitName = unitName;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWorkingPeriod() {
        return workingPeriod;
    }

    public void setWorkingPeriod(String workingPeriod) {
        this.workingPeriod = workingPeriod;
    }

    public boolean Active() {
        return active;
    }

    public void setActive(boolean Active) {
        this.active = Active;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
