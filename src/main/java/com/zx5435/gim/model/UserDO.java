package com.zx5435.gim.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user")
public class UserDO {

    @Id
    private Integer id;
    private String username;
    private String password;

}
