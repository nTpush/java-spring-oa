package com.example.javabootoa.domain;

import java.io.Serializable;

public class DemoDO implements Serializable {

    private static final long serialVersionUID = -5554561712056198940L;

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
