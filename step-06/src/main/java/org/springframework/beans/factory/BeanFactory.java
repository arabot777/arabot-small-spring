package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @Author: Liushan
 * @Date: 2021/9/3 18:28
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
