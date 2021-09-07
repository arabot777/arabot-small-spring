package org.springframework.core.io;

/**
 * @Author: Liushan
 * @Date: 2021/9/7 11:30
 */
public interface ResourceLoader {
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
