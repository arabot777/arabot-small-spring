package org.springframework.context;

import org.springframework.beans.BeansException;

/**
 * @Author: Liushan
 * @Date: 2021/9/9 22:08
 */
public interface ConfigurableApplicationContext extends ApplicationContext{
    void refresh() throws BeansException;
}
