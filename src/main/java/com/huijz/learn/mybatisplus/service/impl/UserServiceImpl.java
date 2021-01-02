package com.huijz.learn.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huijz.learn.mybatisplus.mapper.UserMapper;
import com.huijz.learn.mybatisplus.entity.User;
import com.huijz.learn.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2021-01-01 00:11:07
 */
@Service("userService1")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}