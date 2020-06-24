package com.lzc;

import com.lzc.controller.UserController;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: liuzhichao
 * @Date: 2020/6/24 20:51
 * @Description:
 */
@Configuration
public class SpringAppli implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        UserController bean = applicationContext.getBean(UserController.class);
        System.out.println("bean = " + bean);
    }

}