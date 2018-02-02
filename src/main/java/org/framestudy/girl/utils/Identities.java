package org.framestudy.girl.utils;

import java.util.UUID;

/**
 * Author: peng
 * Description:
 * Date: Created in 2018/2/1 下午6:47
 * Modified By:
 */
public class Identities {
    private Identities() {}

    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
