package com.example.springplaygroundnew.entity;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public abstract class BasePerson extends BaseEntity {
    private String firstName;
    private String lastName;
}
