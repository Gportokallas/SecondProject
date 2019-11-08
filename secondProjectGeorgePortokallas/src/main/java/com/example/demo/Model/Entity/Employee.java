package com.example.demo.Model.Entity;


import com.example.demo.Model.Enum.ContractType;

import javax.persistence.*;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public static int counter;
    private int recordNumber;

    private String lastName;
    private String name;
    private String address;
    private String phoneNumber;
    private String hireDate;
    private String departureDate;
    private String position;
    private boolean isActive;
    private ContractType contractType;

    @ManyToOne
    private Unit unit;

    public Employee(String lastName, String name, String address, String phoneNumber, String hireDate, String departureDate, String position, boolean isActive, ContractType contractType) {

        this.lastName = lastName;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.departureDate = departureDate;
        this.position = position;
        this.isActive = isActive;
        this.contractType = contractType;
        counter = counter + 1;
        recordNumber = counter;
    }

    public Employee() {
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    public int getRecordNum() {
        return counter;
    }

    public void setRecordNum(int recordNum) {
        this.counter = recordNum;
        ;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
