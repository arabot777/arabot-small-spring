package org.springframework.beans.factory.config;

/**
 * @Author: Liushan
 * @Date: 2021/9/6 15:48
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
