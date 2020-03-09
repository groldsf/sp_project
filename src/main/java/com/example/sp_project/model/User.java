package com.example.sp_project.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class User extends BaseEntity {

    private String name;

    @Column(unique = true)
    private String login;

    private String password;

}
