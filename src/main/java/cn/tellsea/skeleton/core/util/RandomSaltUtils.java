package cn.tellsea.skeleton.core.util;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * 随机盐工具类
 *
 * @author Tellsea
 * @Description Created on 2019/7/13
 */
public class RandomSaltUtils {

    public static String getSalt() {
        return RandomStringUtils.random(32, true, true);
    }
}
