package com.huijz.learn.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huijz.learn.mybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-01 00:11:07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> selectByName(String name);
}