package com.itheima.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import com.itheima.pojo.User;


@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> list();
}
