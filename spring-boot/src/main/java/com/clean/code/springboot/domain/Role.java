package com.clean.code.springboot.domain;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Role implements Serializable{
    @Id
    @NonNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
