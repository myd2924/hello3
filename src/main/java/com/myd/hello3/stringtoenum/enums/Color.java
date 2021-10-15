package com.myd.hello3.stringtoenum.enums;

import lombok.AllArgsConstructor;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/10/14 00:52
 * @Description: TODO
 */
@AllArgsConstructor
public enum Color implements ConverterBaseEnum {
    YELLOW(1, "黄"),
    RED(2, "红"),
    GREED(3, "绿");

    Integer value;
    String msg;

    @Override
    public String toViewValue() {
        return String.valueOf(value);
    }
}
