package com.company.tasks.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "TASKS_CARRIER")
@Entity(name = "tasks_Carrier")
public class Carrier extends StandardEntity {
    private static final long serialVersionUID = 423155387686115277L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @Positive(message = "Cost for delivery must not be null")
    @NotNull
    @Column(name = "COST", nullable = false)
    protected BigDecimal cost;

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}