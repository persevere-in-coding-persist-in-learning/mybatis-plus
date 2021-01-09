package com.huijz.learn.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

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
    //版本号
    @Version
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private int version;
    //创建时间
    @DateTimeFormat
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    //修改时间
    @DateTimeFormat
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}