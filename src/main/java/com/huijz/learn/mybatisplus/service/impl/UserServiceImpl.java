package com.huijz.learn.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.api.IErrorCode;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huijz.learn.mybatisplus.mapper.UserMapper;
import com.huijz.learn.mybatisplus.entity.User;
import com.huijz.learn.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2021-01-01 00:11:07
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public R getUserByName(String userName) {
        List<User> userList = userMapper.selectByName(userName);
        if (!CollectionUtils.isEmpty(userList)) {
            return R.ok(userList);
        }
        return R.failed(String.format("不存在相应的数据资源:userName:{}", userName));
    }
}