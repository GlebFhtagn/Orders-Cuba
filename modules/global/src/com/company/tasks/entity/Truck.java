package com.company.tasks.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.CaseConversion;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|number")
@Table(name = "TASKS_TRUCK")
@Entity(name = "tasks_Truck")
public class Truck extends StandardEntity {
    private static final long serialVersionUID = 8321837667989898734L;

    @CaseConversion
    @NotNull
    @Column(name = "NUMBER_", nullable = false, unique = true)
    protected String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CARRIER_ID")
    protected Carrier carrier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRUCK_TYPE_ID")
    protected TruckType truckType;

    public TruckType getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckType truckType) {
        this.truckType = truckType;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}