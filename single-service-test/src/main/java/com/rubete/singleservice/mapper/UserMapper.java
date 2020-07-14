package com.rubete.singleservice.mapper;

import com.rubete.singleservice.empty.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<SysUser> selectUser();
}
