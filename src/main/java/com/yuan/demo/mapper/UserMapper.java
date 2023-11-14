package com.yuan.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuan.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    User queryByIdUser(@Param("id") String id);
}
