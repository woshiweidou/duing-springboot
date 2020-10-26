package com.weidoubaobao.duying.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User implements java.io.Serializable {
    private Integer id;
    private String username;
    private String password;
    private String realname;
    private Integer phone;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", phone=" + phone +
                '}';
    }

}