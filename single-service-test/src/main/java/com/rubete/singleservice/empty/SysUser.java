package com.rubete.singleservice.empty;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 *
 */
@Data
@Entity
public class SysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String deptId;


    private String parentId;


    private String loginName;


    private String userName;


    private String email;


    private String phonenumber;


    private String sex;


    private String avatar;

    private String password;


    private String salt;


    private String status;


    private String delFlag;


    private String loginIp;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date loginDate;


    private String userType;

}
