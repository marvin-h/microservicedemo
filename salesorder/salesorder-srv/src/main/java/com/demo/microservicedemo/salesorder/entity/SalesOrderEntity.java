package com.demo.microservicedemo.salesorder.entity;

import javax.persistence.*;

@Entity
public class SalesOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    @SequenceGenerator(name = "id_seq", sequenceName = "SALESORDER_ID_SEQ")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
