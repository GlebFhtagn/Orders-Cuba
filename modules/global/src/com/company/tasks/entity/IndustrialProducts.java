package com.company.tasks.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s %s|name,weight")
@Table(name = "TASKS_INDUSTRIAL_PRODUCTS")
@Entity(name = "tasks_IndustrialProducts")
public class IndustrialProducts extends Goods {
    private static final long serialVersionUID = 8696939563711600922L;

    @Column(name = "WEIGHT")
    protected Integer weight;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}