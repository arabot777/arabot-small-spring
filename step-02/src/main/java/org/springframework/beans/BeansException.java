package org.springframework.beans;

/**
 * @Author: Liushan
 * @Date: 2021/9/3 18:24
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
