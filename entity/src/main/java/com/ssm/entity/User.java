package com.ssm.entity;

import lombok.Data;
import java.io.Serializable;

@Data
public class User implements Serializable {

    private String strUserName;
    private String strPassword;

}
