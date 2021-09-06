package org.springframework.beans.factory.config;

/**
 * @Author: Liushan
 * @Date: 2021/9/3 18:27
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
