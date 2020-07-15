package com.rubete.singleservice.empty;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

/**
 *
 */
@Data
//@Alias("sysUser")
public class SysUser {

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
