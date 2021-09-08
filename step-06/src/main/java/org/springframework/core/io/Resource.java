package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Liushan
 * @Date: 2021/9/7 11:19
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
