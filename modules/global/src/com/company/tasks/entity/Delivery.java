package com.company.tasks.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "TASKS_DELIVERY")
@Entity(name = "tasks_Delivery")
public class Delivery extends StandardEntity {
    private static final long serialVersionUID = -6216599039816533142L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false, unique = true)
    protected BigDecimal number;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GOODS_ID")
    protected Goods goods;

    @NotNull
    @Column(name = "DISTANCE", nullable = false)
    protected BigDecimal distance;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    protected Integer status;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CARRIER_ID")
    protected Carrier carrier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRUCK_ID")
    protected Truck truck;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public StatusDelivery getStatus() {
        return status == null ? null : StatusDelivery.fromId(status);
    }

    public void setStatus(StatusDelivery status) {
        this.status = status == null ? null : status.getId();
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }
}