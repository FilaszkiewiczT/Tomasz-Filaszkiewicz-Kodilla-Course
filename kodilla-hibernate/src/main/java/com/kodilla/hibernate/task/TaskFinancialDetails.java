package com.kodilla.hibernate.task;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TASKS_FINANCIALS")
public class TaskFinancialDetails {
    @Id
    @GeneratedValue
    private Long id;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails() {
    }

    public TaskFinancialDetails(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isPaid() {
        return paid;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setPaid(boolean paid) {
        this.paid = paid;
    }
}