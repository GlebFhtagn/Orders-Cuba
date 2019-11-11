package com.company.tasks.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@NamePattern("%s %s|name,expirationDate")
@Table(name = "TASKS_FOODSTUFFS")
@Entity(name = "tasks_Foodstuffs")
public class Foodstuffs extends Goods {
    private static final long serialVersionUID = 6633481778132989555L;

    @Column(name = "EXPIRATION_DATE")
    protected BigDecimal expirationDate;

    public BigDecimal getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(BigDecimal expirationDate) {
        this.expirationDate = expirationDate;
    }
}