package org.springframework;

/**
 * @Author: Liushan
 * @Date: 2021/9/3 16:20
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
