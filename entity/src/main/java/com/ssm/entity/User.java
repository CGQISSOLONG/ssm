package com.ssm.entity;

import lombok.Data;
import java.io.Serializable;

@Data
public class User implements Serializable {

    private int id;
    private String userName;
    private String password;

}
