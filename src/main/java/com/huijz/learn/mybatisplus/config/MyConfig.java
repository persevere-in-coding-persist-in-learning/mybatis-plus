package com.huijz.learn.mybatisplus.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2021/1/6 下午10:59
 */
@Configuration
public class MyConfig {
    /**
     * 乐观锁插件
     * 将 OptimisticLockerInterceptor 通过 @Bean 交给 Spring 管理。
     *
     * @return 乐观锁插件的实例
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}
