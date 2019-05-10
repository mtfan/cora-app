package com.cora.common.util;

import com.google.common.base.CaseFormat;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

/**
 * @Description:
 * @Author: fanmingtao
 * @Date: 2018/9/14
 */
public class CaseFormatUtil {

    /**
     * 如：userName->user_name
     *
     * @param str
     * @return
     */
    public static String lowerCamel2LowerUnderScore(String str) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, str);
    }

    /**
     * 如：userName->UserName
     *
     * @param str
     * @return
     */
    public static String lowerCamel2UpperCamel(String str) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, str);
    }

    /**
     * 如：userName->USER_NAME
     *
     * @param str
     * @return
     */
    public static String lowerCamel2UpperUnderScore(String str) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, str);
    }

    /**
     * 如：user-name->userName
     *
     * @param str
     * @return
     */
    public static String lowerHyphen2LowerCamel(String str) {
        return CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, str);
    }

    /**
     * 如：user_name->UserName
     *
     * @param str
     * @return
     */
    public static String upperUnder2UpperCamel(String str) {
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "user_name");
    }

    /**
     * 如：userName->USER_NAME->USER
     *
     * @param str
     * @return
     */
    public static String prefixUpperUnderScore(String str) {
        String lowerUpperUnderScore = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, str);
        String[] split = StringUtils.split(lowerUpperUnderScore, "_");
        return split[0];
    }

    /**
     * 如：userName->USER_NAME->NAME
     *
     * @param str
     * @return
     */
    public static String suffixUpperUnderScore(String str) {
        String lowerUpperUnderScore = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, str);
        String[] split = StringUtils.split(lowerUpperUnderScore, "_");
        return split[split.length - 1];
    }

    /**
     * 如：bldThree-><BLD, BLD_THREE>
     *
     * @param str
     * @return
     */
    public static Pair<String, String> formatKeyAndValue(String str) {
        String platform = prefixUpperUnderScore(str);
        String type = lowerCamel2UpperUnderScore(str);
        return Pair.of(platform, type);
    }
}
