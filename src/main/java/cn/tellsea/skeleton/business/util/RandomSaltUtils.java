package cn.tellsea.skeleton.business.util;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomSaltUtils {

    public static String getSalt() {
        return RandomStringUtils.random(32, true, true);
    }
}
