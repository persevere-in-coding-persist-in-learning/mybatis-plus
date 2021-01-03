package com.huijz.learn.mybatisplus.service;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.service.IService;
import com.huijz.learn.mybatisplus.entity.User;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2021-01-01 00:11:07
 */
public interface UserService extends IService<User> {
    R getUserByName(String userName);
}