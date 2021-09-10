package org.springframework.test.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanPostProcessor;
import org.springframework.test.bean.UserService;

/**
 * @Author: Liushan
 * @Date: 2021/9/10 13:33
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
