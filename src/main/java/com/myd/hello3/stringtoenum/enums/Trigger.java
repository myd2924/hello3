package com.myd.hello3.stringtoenum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/10/15 16:48
 * @Description: TODO
 */
public enum Trigger {
    NONE,
    VISIT,
    ADD;

    @JsonCreator
    public Trigger fromValue(int value) {
        return values()[value];
    }

    @JsonValue
    public int toValue() {
        return this.ordinal();
    }

    public static Trigger chgValue(int value) {
        return values()[value];
    }
}
