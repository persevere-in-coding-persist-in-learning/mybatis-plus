package com.huijz.learn.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2021-01-01 00:11:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user")
public class User extends Model<User> {
    //主键ID
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    //姓名
    private String name;
    //年龄
    private Integer age;
    //邮箱
    private String email;
}